package com.softnet.watched.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softnet.watched.hilo.Pmihilo;
import com.softnet.watched.hilo.Sincrohilo;
import com.softnet.watched.service.DocumentoService;



public class Principal extends JFrame implements ActionListener{
	
	
	
	private static final Logger log = LoggerFactory.getLogger(Principal.class);
	private static Pmihilo t;
	private static Sincrohilo sincro;
	
	JButton btnIniciar;
	JButton btnApagar;
	JLabel lblEstado;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblHost;
	JLabel lblPuerto;
	
	JCheckBox checkbox = new JCheckBox();
	private JLabel lblNewLabel;
	JCheckBox checkbox_1 = new JCheckBox();
	private JLabel lblNewLabel_1;
	private JCheckBox checkBoxaten;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	public Principal() {
		setAlwaysOnTop(true);
		setBackground(Color.BLUE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					setVisible(false);
//					this.finalize();
//					System.exit(0);
				} catch (Exception e2) {
					// TODO: handle exception
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		setFont(new Font("Arial", Font.PLAIN, 18));
		
        setTitle("Servicio");
        setSize(546,307);
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        URL url = System.class.getResource("/images/logo.png");
        ImageIcon im = new ImageIcon(url);
        this.setIconImage(im.getImage());
        checkbox.setSelected(false);
        

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.white);
		btnApagar = new JButton("APAGAR");
		btnApagar.setEnabled(false);
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setEnabled(true);
				btnApagar.setEnabled(false);
				
				t.stop();
				sincro.stop();
				System.gc();
			}
		});
		
		btnIniciar = new JButton("INICIAR");
		
		btnIniciar.addActionListener(this);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnIniciar)
					.addGap(18)
					.addComponent(btnApagar)
					.addGap(34))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIniciar)
						.addComponent(btnApagar)))
		);
		panel_1.setLayout(gl_panel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		lblHost = new JLabel("HOST");
		
		lblPuerto = new JLabel("PUERTO");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		lblEstado = new JLabel();
		
		
		
		
		lblNewLabel = new JLabel("Configurar proxy");
		
		lblNewLabel_1 = new JLabel("Autenticaci\u00F3n del proxy");
		
		checkBoxaten = new JCheckBox();
		checkBoxaten.setSelected(false);
		checkBoxaten.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					lblUsuario.setEnabled(true);
					lblContrasea.setEnabled(true);
					textField_4.setEnabled(true);
					textField_5.setEnabled(true);
					lblNewLabel_1.setEnabled(true);
				} else {
					lblUsuario.setEnabled(false);
					lblContrasea.setEnabled(false);
					textField_4.setEnabled(false);
					textField_5.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
				}
				
			}
		});
		
		lblUsuario = new JLabel("USUARIO");
		
		lblContrasea = new JLabel("CONTRASE\u00D1A");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		if(!checkbox.isSelected()){
			lblHost.setEnabled(false);
			lblPuerto.setEnabled(false);
			textField.setEnabled(false);
			textField_1.setEnabled(false);
			checkBoxaten.setSelected(false);
			checkBoxaten.setEnabled(false);
			lblUsuario.setEnabled(false);
			lblContrasea.setEnabled(false);
			textField_4.setEnabled(false);
			textField_5.setEnabled(false);
			lblNewLabel_1.setEnabled(false);
			
		}
		
		lblNewLabel_2 = new JLabel("Estado:");
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(checkbox)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblHost)
											.addGap(28)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPuerto)
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
							.addGap(83)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUsuario)
										.addComponent(lblContrasea))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBoxaten)
									.addGap(13)
									.addComponent(lblNewLabel_1))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(166)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(201)
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblEstado)))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(checkbox))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHost)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPuerto)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUsuario)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblContrasea)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(checkBoxaten))
					.addGap(33)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblEstado))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		checkbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					lblHost.setEnabled(true);
					lblPuerto.setEnabled(true);
					textField.setEnabled(true);
					textField_1.setEnabled(true);
					checkBoxaten.setEnabled(true);
				} else {
					lblHost.setEnabled(false);
					lblPuerto.setEnabled(false);
					textField.setEnabled(false);
					textField_1.setEnabled(false);
					checkBoxaten.setEnabled(false);
					textField_4.setEnabled(false);
					textField_5.setEnabled(false);
					lblUsuario.setEnabled(false);
					lblContrasea.setEnabled(false);
				}
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnIniciar){
			DocumentoService service = new DocumentoService();
			btnApagar.setEnabled(true);
			btnIniciar.setEnabled(false);
			String host = textField.getText();
			String puerto = textField_1.getText();
			String usua = textField_4.getText();
			String contra = textField_5.getText();
			
			t = new Pmihilo();
			sincro = new Sincrohilo(host, puerto, usua, contra);
			t.start();
			sincro.start();
			new Thread(){
				public void run(){
					while(t.isAlive()){		
						URL url = System.class.getResource("/images/verde.jpg");
						ImageIcon v = new ImageIcon(url);
						lblEstado.setIcon(v);
					}
					URL url = System.class.getResource("/images/rojo.jpg");
					ImageIcon r = new ImageIcon(url);
					lblEstado.setIcon(r);
				}
			}.start();
		}
	}
}
