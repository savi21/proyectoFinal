package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class VentanaDeListaDeMedicos extends JInternalFrame{
	public VentanaDeListaDeMedicos() {
		setFrameIcon(new ImageIcon(VentanaDeListaDeMedicos.class.getResource("/Imagenes/icons/Apps-preferences-contact-list-icon.png")));
		setTitle("Listado de m\u00E9dicos");
		getContentPane().setLayout(null);
		setSize(422,491);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(12, 25, 79, 16);
		getContentPane().add(lblEspecialidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(96, 25, 149, 22);
		getContentPane().add(comboBox);
		
		JButton btnVerLista = new JButton("Ver lista");
		btnVerLista.setIcon(new ImageIcon(VentanaDeListaDeMedicos.class.getResource("/Imagenes/icons/Actions-edit-find-user-icon.png")));
		btnVerLista.setBounds(271, 22, 128, 25);
		getContentPane().add(btnVerLista);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Listado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(12, 73, 389, 376);
		getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setBackground(Color.WHITE);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"hola", "output", "String", "Integer"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
	}
}
