package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class VentanaDeResultados extends JInternalFrame {
	public VentanaDeResultados() {
		setClosable(true);
		setFrameIcon(new ImageIcon(VentanaDeResultados.class.getResource("/Imagenes/icons/folder-documents-icon.png")));
		setResizable(false);
		setTitle("Resultados");
		getContentPane().setLayout(null);
		setSize(422,225);
		
		JLabel lblCdigo = new JLabel("Paciente");
		lblCdigo.setBounds(10, 22, 63, 14);
		getContentPane().add(lblCdigo);
		
		JLabel lblNombre = new JLabel("Prueba");
		lblNombre.setBounds(222, 22, 47, 14);
		getContentPane().add(lblNombre);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setIcon(new ImageIcon(VentanaDeResultados.class.getResource("/Imagenes/icons/Actions-dialog-ok-apply-icon.png")));
		btnAceptar.setBounds(79, 149, 115, 33);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(VentanaDeResultados.class.getResource("/Imagenes/icons/Actions-edit-delete-icon.png")));
		btnCancelar.setBounds(232, 149, 115, 33);
		getContentPane().add(btnCancelar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 19, 135, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(271, 19, 135, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblMedicamentos = new JLabel("Resultados");
		lblMedicamentos.setBounds(10, 65, 81, 14);
		getContentPane().add(lblMedicamentos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 66, 316, 57);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
