package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VentanaDePruebas extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	public VentanaDePruebas() {
		setResizable(false);
		setTitle("Pruebas de laboratorio");
		getContentPane().setLayout(null);
		setSize(419,137);
		
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
		btnAceptar.setIcon(new ImageIcon(VentanaDePruebas.class.getResource("/Imagenes/icons/Actions-dialog-ok-apply-icon.png")));
		btnAceptar.setBounds(72, 63, 115, 33);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(VentanaDePruebas.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnCancelar.setBounds(222, 63, 115, 33);
		getContentPane().add(btnCancelar);
	}
}