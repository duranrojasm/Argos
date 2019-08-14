package com.softnet.watched.hilo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softnet.watched.service.DocumentoService;
import com.softnet.watched.view.Principal;

public class Sincrohilo extends Thread {
	private static final Logger log = LoggerFactory.getLogger(Principal.class);
	private static Properties config = new Properties();
	public static Boolean ejecucion2;
	String Host;
	String Puerto;
	String Usuario;
	String Contrasena;
	
	public Sincrohilo(String host, String puerto, String usua, String contra) {

		Host = host;
		Puerto = puerto;
		Usuario = usua;
		Contrasena = contra;
	}
	public void run() {
		try {
			cargarProperties();
			String path_root = config.getProperty("dirRoot");
			if (path_root == null || path_root.trim().isEmpty())
				throw new Exception("Debe especificar el directorio raiz de archivos");
			DocumentoService service = new DocumentoService();
			File dir = new File(path_root);
			if (!dir.exists()){
				dir.mkdirs();
			}
			ejecucion2 = true;
			while(ejecucion2){
				service.procesoSincronizacion(path_root, config, Host, Puerto, Usuario, Contrasena);
				try {
					Thread.sleep(Integer.parseInt(config.getProperty("sleepSeg"))*1000);
				} catch (Exception exe) {
					// TODO: handle exception
				}
			}
		} catch (Exception ex) {
			ejecucion2=false;
			log.error("Error al iniciar el proceso de sincronización", ex);
		}
				
	}
	private static void cargarProperties(){
		try {
			File file = new File("configuracion.properties");
			FileInputStream fileInput = new FileInputStream(file);
			config = new Properties();
			config.load(fileInput);
			fileInput.close();
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
