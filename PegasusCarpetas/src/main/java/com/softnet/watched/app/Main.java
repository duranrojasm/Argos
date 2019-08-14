package com.softnet.watched.app;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softnet.watched.service.DocumentoService;
import com.softnet.watched.view.Principal;

public class Main {
	
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args){
		try {
			TrayIcon trayIcon = null;
			log.info("Iniciando servicio");
			if (SystemTray.isSupported()) {
				SystemTray tray = SystemTray.getSystemTray();
				URL url = System.class.getResource("/images/log3.png");
				Image image = Toolkit.getDefaultToolkit().getImage(url);
				
				final Principal vista = new Principal();
				PopupMenu menu = new PopupMenu();
		        final MenuItem exitItem = new MenuItem("Finalizar Servicio");
		        menu.add(exitItem);
				ActionListener listener = new ActionListener() {
		             public void actionPerformed(ActionEvent e) {
		            	 exitItem.setEnabled(true);
		               	 vista.setVisible(true);
		               	 
		               	 
		             }
		         };
		         ActionListener exit = new ActionListener() {
		             public void actionPerformed(ActionEvent e) {
		               	System.exit(0);
		             }
		         };
		         exitItem.addActionListener(exit);
		         
		         trayIcon = new TrayIcon(image, "Pegasus",menu);
		         trayIcon.addActionListener(listener);
		         try {
		             tray.add(trayIcon);
		         } catch (AWTException e) {
		             System.err.println(e);
		         }
			}else{
				Principal vista = new Principal();
				vista.setVisible(true);
			}
			
		} catch (Exception e) {
			log.error("Error al iniciar aplicativo", e);
		}
	}
}