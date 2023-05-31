package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazEstadisticas extends JFrame {

	private String usuario;
	
	private JPanel contentPane;
	private boolean abierto;

	public InterfazEstadisticas(String usuario) {
		
		this.abierto = true;
		this.usuario = "";
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 915, 508);
		setTitle("Interfaz Estadisticas");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] columnNombres1 = { "Nombre", "%Saque", "%1Serv", "%Puntos", "%Gana" };
		Object[][] data = new Object[20][5];
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 147, 279, 272);
		contentPane.add(scrollPane);

		JTable table = new JTable(data, columnNombres1);
		scrollPane.setViewportView(table);

		String[] columnNombres2 = { "Nombre", "%Saque", "%1Serv", "%Puntos", "%Gana" };
		Object[][] data2 = new Object[20][5];
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(299, 147, 289, 272);
		contentPane.add(scrollPane2);

		JTable table2 = new JTable(data2, columnNombres2);
		scrollPane2.setViewportView(table2);

		String[] columnNombres3 = { "Nombre", "%Saque", "%1Serv", "%Puntos", "%Gana" };
		Object[][] data3 = new Object[20][5];
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(598, 147, 293, 272);
		contentPane.add(scrollPane3);

		JTable table3 = new JTable(data3, columnNombres3);
		scrollPane3.setViewportView(table3);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(274, 29, 345, 41);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblEstadisticas = new JLabel("Estadisticas Tenistas");
		lblEstadisticas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstadisticas.setBounds(78, 11, 189, 19);
		panel.add(lblEstadisticas);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 255));
		panel_1.setBounds(10, 119, 279, 28);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblLideresServicio = new JLabel("Líderes Servicio");
		lblLideresServicio.setBackground(new Color(238, 130, 238));
		lblLideresServicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLideresServicio.setBounds(69, 11, 128, 14);
		panel_1.add(lblLideresServicio);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1.setBounds(299, 119, 289, 28);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel lbllideresDevolucion = new JLabel("Líderes Devolución");
		lbllideresDevolucion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbllideresDevolucion.setBounds(58, 11, 153, 14);
		panel_1_1.add(lbllideresDevolucion);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(127, 255, 212));
		panel_1_1_1.setBounds(598, 119, 293, 28);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);

		JLabel lblLideresPresion = new JLabel("Líderes Bajo Presión");
		lblLideresPresion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLideresPresion.setBounds(53, 11, 168, 14);
		panel_1_1_1.add(lblLideresPresion);

		JButton btnAtras = new JButton("<- Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cerrar();
				
			}
		});
		btnAtras.setBounds(739, 430, 126, 30);
		contentPane.add(btnAtras);

		if (this.abierto == true) {
			
			setVisible(true);
			
		}
		
		else {
			
			setVisible(false);
			
		}
		
	}
	
	public void cerrar() {
		
		this.abierto = false;
		setVisible(false);
		
	}
	
	public void actualizaNombre(String usuario) {
		
		this.usuario = usuario;
		
		if (!this.usuario.equals("")) {
			
			setTitle("Interfaz Estadísticas - Usuario: " + this.usuario);
			
		}
		
	}

	public void ubicacion() {
		
		System.out.println("Te encuentras en la interfaz Estadísticas");
		
	}
	
}
