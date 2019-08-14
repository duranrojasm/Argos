package com.softnet.watched.service;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softnet.watched.webservice.DocumentoBean;
import com.softnet.watched.webservice.EmpresaBean;
import com.softnet.watched.webservice.NotificacionElectronicaWs;
import com.softnet.watched.webservice.NotificacionElectronicaWs_Service;
import com.softnet.watched.webservice.Resultado;
import com.softnet.watched.webservice.UsuarioBean;

public class SincronizacionService {

	private static final Logger log = LoggerFactory.getLogger(SincronizacionService.class);
	
	public int iniciaProceso(String path, String archivo, Properties config, String Host, String Puerto, String usu, String contra){
		int estado = 0;
		try {
			String[] datos = archivo.substring(0,archivo.length()-4).split("_");
			String minFirmantes= datos[1];
			String dniFirmantes[] = datos[2].split("-");
			String secFirmantes[] = datos[3].split("-");
			String dninotificados[] = null;
			
			try {
				dninotificados=datos[4].split("-");
			} catch (Exception e) {
				log.info("Proceso sin usuarios Notificados");
			}
			
			NotificacionElectronicaWs_Service service = new NotificacionElectronicaWs_Service(new URL(config.getProperty("URL_WS")));
			NotificacionElectronicaWs port = service.getNotificacionElectronicaWsPort();
			
			if((Host!=null && !Host.trim().isEmpty()) && (Puerto!=null && !Puerto.trim().isEmpty())){
				Client client = ClientProxy.getClient(port);
				HTTPConduit http = (HTTPConduit) client.getConduit();
				http.getClient().setProxyServer(Host);
				http.getClient().setProxyServerPort(Integer.valueOf(Puerto));
				if((usu!=null && !usu.trim().isEmpty()) && (contra!=null && !contra.trim().isEmpty())){
					http.getProxyAuthorization().setUserName(usu);
					http.getProxyAuthorization().setPassword(contra);
				}
			}					
			
			String nombre_proceso = datos[0];
			String comentario = "Proceso de notificacion ";
			int minimo_firmantes;
			
			try {
				minimo_firmantes = Integer.parseInt(minFirmantes);
			} catch (Exception e) {
				throw new Exception("Se esperaba un valor entero en lugar de "+minFirmantes);
			}
			
			if(minimo_firmantes > dniFirmantes.length){
				throw new Exception("Indicador de minimo de firmantes incorrecto. se esperaban "+minFirmantes+ " firmantes"   );
			}
			
			String tipof = config.getProperty("tipo_firmante");
			int unidad_tiempo;
			int timeout;
			if(Integer.parseInt(tipof)==0){
				unidad_tiempo = 0;
				timeout = 0;
			}else{
				unidad_tiempo = 2;
				timeout = 2;
			}			
			
			EmpresaBean empresa = new EmpresaBean();
			empresa.setRuc(Long.parseLong(config.getProperty("RUC_EMPRESA")));
			empresa.setRazSocial(config.getProperty("RZ_EMPRSA"));
			
			List<UsuarioBean> usuarios = new ArrayList<UsuarioBean>();
			UsuarioBean usuario;
			//FIRMANTE AUTOMATICO
			if(Integer.parseInt(tipof)==0){
				for (int i = 0; i < dniFirmantes.length; i++) {
					usuario = new UsuarioBean();
//					usuario.setTipoDocIdentidad(1);
					usuario.setDocIdentidad(dniFirmantes[i]);
					usuario.setTipoUsuario(5);
					usuario.setFlagEmpresa(0);
					usuario.setNroSecuenciaFirma(1);
					usuario.setPosicionFirma(dniFirmantes[i]);
					usuarios.add(usuario);
				}
			}else{
				//FIRMANTE NORMAL
				for (int i = 0; i < dniFirmantes.length; i++) {
					usuario = new UsuarioBean();
					usuario.setDocIdentidad(dniFirmantes[i]);
					usuario.setTipoUsuario(1);
					usuario.setFlagEmpresa(0);
					usuario.setNroSecuenciaFirma(Integer.parseInt(secFirmantes[i]));
					usuario.setPosicionFirma(dniFirmantes[i]);
					usuarios.add(usuario);
				}
			}	
			if(dninotificados != null){
				//NOTIFICADO
				for (int i = 0; i < dninotificados.length; i++) {
					usuario = new UsuarioBean();
					usuario.setTipoDocIdentidad(1);
					usuario.setDocIdentidad(dninotificados[i]);
					usuario.setTipoUsuario(2);
					usuario.setFlagEmpresa(0);
					usuario.setNroSecuenciaFirma(2);
					usuarios.add(usuario);
				}
			}
			//DOCUMENTOS
			List<DocumentoBean> documentos = new ArrayList<DocumentoBean>();
			DocumentoBean documento = new DocumentoBean();
			documento.setNombreDocumento(archivo);
			documento.setTipoDocumento(1);
			documento.setDocumento(leeArchivo(path, archivo));
			documento.setNombreDocumento(nombre_proceso+".pdf");			
			documentos.add(documento);
			
			Resultado result = port.registroNotificacion(config.getProperty("COD_ADMIN"), config.getProperty("PASS_ADMIN"), empresa, 
					usuarios, documentos, nombre_proceso, minimo_firmantes, timeout, unidad_tiempo, comentario);
			
			if (result.getEstado() != 1){
				ObjectMapper mapper = new ObjectMapper();
				log.error("No inicio el proceso, Revisar errores: " + mapper.writeValueAsString(result.getErrores()));
			}
			
			estado = result.getCodNotificacion();
			
		} catch (Exception e) {
			log.error("Ocurrio un error al iniciar el proceso de sincronizacion", e);
			estado = -1;
		}
		return estado;
	}
	
	private byte[] leeArchivo(String path_in, String archivo) throws Exception{
		Path path = Paths.get(path_in, archivo);
		byte[] data = Files.readAllBytes(path);
		return data;
	}
	
}
