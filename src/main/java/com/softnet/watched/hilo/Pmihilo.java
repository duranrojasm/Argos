package com.softnet.watched.hilo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softnet.watched.service.DocumentoService;
import com.softnet.watched.view.Principal;

public class Pmihilo extends Thread{
	
	private static final Logger log = LoggerFactory.getLogger(Principal.class);
	private static Properties config = new Properties();
	public static Boolean ejecucion; 
	
	public void run() {
		try {
			cargarProperties();
			
			String path_root = config.getProperty("dirRoot");
			if (path_root == null || path_root.trim().isEmpty())
				throw new Exception("Debe especificar el directorio raiz de archivos");
						
			DocumentoService service = new DocumentoService();
			int evaluacion=0;
			int maxEvaluacion= Integer.parseInt(config.getProperty("maxEval"));
			File dir = new File(path_root);
			if (!dir.exists()){
				dir.mkdirs();
			}
			ejecucion = true;
			while(ejecucion || evaluacion<maxEvaluacion){
				
				service.procesoLecturaDocumentos(path_root, config);
				evaluacion++;
				try {
					Thread.sleep(Integer.parseInt(config.getProperty("sleepSeg"))*1000);
				} catch (Exception exe) {
					// TODO: handle exception
				}
			}
		} catch (Exception ex) {
			ejecucion=false;
			log.error("Error al iniciar aplicativo", ex);
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
