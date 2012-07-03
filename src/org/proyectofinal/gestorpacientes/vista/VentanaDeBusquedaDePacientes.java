package org.proyectofinal.gestorpacientes.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;

public class VentanaDeBusquedaDePacientes extends JFrame{
	private JTextField textField;
	private JTable table;
	private JLabel label;
	private JButton btnNewButton;
	public VentanaDeBusquedaDePacientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaDeBusquedaDePacientes.class.getResource("/Imagenes/icons/Actions-edit-find-user-icon.png")));
		setResizable(false);
		setTitle("B\u00FAsqueda de pacientes");
		getContentPane().setLayout(null);
		setSize(463, 611);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setIcon(new ImageIcon(VentanaDeBusquedaDePacientes.class.getResource("/Imagenes/icons/search-icon.png")));
		lblBuscar.setBounds(157, 49, 73, 16);
		getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(227, 47, 219, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 185, 434, 385);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				label.setIcon(new ImageIcon(VentanaDeBusquedaDePacientes.class.getResource("/Imagenes/User.png")));
				btnNewButton.setEnabled(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label.setIcon(null);
				btnNewButton.setEnabled(false);
			}
		});
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Apellido", "C\u00E9dula"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblPorNombreApellido = new JLabel(" (Por nombre, apellido y/o c\u00E9dula)");
		lblPorNombreApellido.setForeground(Color.GRAY);
		lblPorNombreApellido.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblPorNombreApellido.setBounds(242, 67, 186, 16);
		getContentPane().add(lblPorNombreApellido);
		
		btnNewButton = new JButton("Ver historial");
		btnNewButton.setEnabled(false);
		btnNewButton.setIcon(new ImageIcon(VentanaDeBusquedaDePacientes.class.getResource("/Imagenes/icons/History-Folder-Ash-icon.png")));
		btnNewButton.setBounds(259, 105, 103, 30);
		getContentPane().add(btnNewButton);
		
	    label = new JLabel("");
		
		label.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label.setBounds(12, 12, 134, 154);
		getContentPane().add(label);
	}
}
