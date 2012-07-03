package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VentanaDePadecimientos extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	public VentanaDePadecimientos() {
		setClosable(true);
		setFrameIcon(new ImageIcon(VentanaDePadecimientos.class.getResource("/Imagenes/icons/Thermometer-icon.png")));
		setResizable(false);
		setTitle("Padecimientos");
		getContentPane().setLayout(null);
		setSize(416,137);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 22, 46, 14);
		getContentPane().add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(55, 19, 135, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(211, 22, 46, 14);
		getContentPane().add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(263, 19, 135, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setIcon(new ImageIcon(VentanaDePadecimientos.class.getResource("/Imagenes/icons/Actions-dialog-ok-apply-icon.png")));
		btnAceptar.setBounds(72, 63, 115, 33);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(VentanaDePadecimientos.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnCancelar.setBounds(222, 63, 115, 33);
		getContentPane().add(btnCancelar);
	}
}
