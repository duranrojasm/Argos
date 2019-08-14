package com.softnet.watched.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softnet.watched.util.Constantes;

public class DocumentoService {

	private static final Logger log = LoggerFactory.getLogger(DocumentoService.class);
	
	public void procesoLecturaDocumentos(final String path_root, final Properties config){
		try {
			
			final String path_in = Paths.get(path_root, Constantes.PATH_IN).toString();
			final String path_error = Paths.get(path_root, Constantes.PATH_ERROR).toString();
			String[] documentos = new File(path_in).list();
			if(documentos==null){
				File directorio=new File(Paths.get(path_root, Constantes.PATH_IN).toString()); 
				directorio.mkdir(); 
				documentos = new File(path_in).list();
			}
			if (documentos.length > 0){
				log.info("Cantidad de documentos encontrados: "+documentos.length);					
				final String path_proceso = Paths.get(path_root, Constantes.PATH_PRO).toString();
					for (String documento : documentos){								
						String tipodocu = FilenameUtils.getExtension(documento);
						if(!tipodocu.equals("pdf")){
							try {		
								log.info("No es un archivo permitido: "+documento);
								File directorio2=new File(Paths.get(path_root, Constantes.PATH_ERROR).toString()); 
								directorio2.mkdir(); 
								Files.move(Paths.get(path_in, documento), Paths.get(path_error, documento), StandardCopyOption.REPLACE_EXISTING);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}else{
							try {	
								File directorio2=new File(Paths.get(path_root, Constantes.PATH_ERROR).toString()); 
								directorio2.mkdir(); 
								Files.move(Paths.get(path_in, documento), Paths.get(path_proceso, documento), StandardCopyOption.REPLACE_EXISTING);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
			}else{
				log.debug("No se encontraron documentos disponibles para mover");
			}

		} catch (Exception e) {
			log.error("Error al leer los documentos del directorio: ", e);
		}
	}
	
	public void procesoSincronizacion(final String path_root, final Properties config, final String Host, final String Puerto, final String Usuario, final String contrasena){
		try {					
			final String path_proceso = Paths.get(path_root, Constantes.PATH_PRO).toString();
			String path_error = Paths.get(path_root, Constantes.PATH_ERROR).toString();
			String path_completado = Paths.get(path_root, Constantes.PATH_OUT).toString();
			String[] documentos;
			
			File dir = new File(path_proceso);
			if (!dir.exists()){
				dir.mkdirs();
				documentos = new File(path_proceso).list();
			}else{
				documentos = new File(path_proceso).list();
			}
			
			
			if (documentos.length > 0){
				
				SincronizacionService service = new SincronizacionService();	
				
				
				dir = new File(path_error);
				if (!dir.exists())
					dir.mkdirs();
				
				dir = new File(path_completado);
				if (!dir.exists())
					dir.mkdirs();
				
				for (String documento : documentos){
					try {
						log.info("Sincronizando documento: " + documento);		
						int estado = service.iniciaProceso(path_proceso, documento, config, Host, Puerto, Usuario, contrasena);
						if (estado > 0) {
							log.info("Documento sincronizado, codigo generado: " + estado);
							Files.move(Paths.get(path_proceso, documento), 
									Paths.get(path_completado, documento), 
									StandardCopyOption.REPLACE_EXISTING);
						} else {
							log.error("Moviendo a la carpeta de errores: " + path_error +" alguno de los usuarios no se encuentran registrados en el sistema");
							Files.move(Paths.get(path_proceso, documento), 
									Paths.get(path_error, documento), 
									StandardCopyOption.REPLACE_EXISTING);
						}
					} catch (Exception e) {
						log.error("Error al sincronizar el archivo: " + documento , e);
					}
				}
			}else{
				log.debug("No se encontraron documentos disponibles para sincronizar");
			}
				
		} catch (Exception e) {
			log.error("Error al leer los documentos del directorio: ", e);
		}
	}
}
