package proyectoIntegrador2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class InterfazJugadores extends JFrame {
	
	private JTextField buscador;
	
	private String usuario;

	public InterfazJugadores(String usuario) {
		
		String url = "jdbc:mysql://localhost:3306/integradortenis?useUnicode=true&characterEncoding=utf8&user=dck";

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 746, 458);
		setTitle("interfaz Jugadores");
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Buscar Jugador");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(276, 11, 168, 35);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(103, 53, 530, 73);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Buscar Jugador :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(68, 28, 114, 20);
		panel.add(lblNewLabel_1);

		buscador = new JTextField();
		buscador.setBounds(190, 29, 166, 20);
		panel.add(buscador);
		buscador.setColumns(10);

		JButton botonbuscar = new JButton("Buscar");
		botonbuscar.setBounds(364, 28, 89, 23);
		panel.add(botonbuscar);

		JPanel panelinfogrande = new JPanel();
		panelinfogrande.setBackground(new Color(240, 255, 255));
		panelinfogrande.setBounds(103, 132, 530, 242);
		contentPane.add(panelinfogrande);
		panelinfogrande.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Informacion Jugador :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 11, 171, 21);
		panelinfogrande.add(lblNewLabel_2);

		// Crear el modelo de la tabla
		String[] columnas = { "Nombre", "Posición", "Edad", "Puntos" };
		DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 1);

		// Crear la tabla
		JTable tabla = new JTable(modeloTabla);
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(10, 43, 510, 42);
		panelinfogrande.add(scrollPane);

		botonbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugadorBuscado = buscador.getText();

				// Limpiar la tabla antes de agregar nuevos datos
				modeloTabla.setRowCount(0);

				try {
					Connection connection = DriverManager.getConnection(url);

					// Consulta en la tabla "tenistas"
					String queryTenistas = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistas WHERE Nombre LIKE ?";
					PreparedStatement statementTenistas = connection.prepareStatement(queryTenistas);
					statementTenistas.setString(1, "%" + jugadorBuscado + "%"); // Agregar el símbolo % para buscar
																				// cualquier coincidencia
					ResultSet resultSetTenistas = statementTenistas.executeQuery();

					// Consulta en la tabla "tenistasfem"
					String queryTenistasFem = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistasfem WHERE Nombre LIKE ?";
					PreparedStatement statementTenistasFem = connection.prepareStatement(queryTenistasFem);
					statementTenistasFem.setString(1, "%" + jugadorBuscado + "%"); // Agregar el símbolo % para buscar
																					// cualquier coincidencia
					ResultSet resultSetTenistasFem = statementTenistasFem.executeQuery();

					// Consulta en la tabla "tenistasduo"
					String queryTenistasDuo = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistasduo WHERE Nombre LIKE ?";
					PreparedStatement statementTenistasDuo = connection.prepareStatement(queryTenistasDuo);
					statementTenistasDuo.setString(1, "%" + jugadorBuscado + "%"); // Agregar el símbolo % para buscar
																					// cualquier coincidencia
					ResultSet resultSetTenistasDuo = statementTenistasDuo.executeQuery();

					// Obtener los datos de la tabla "tenistas"
					while (resultSetTenistas.next()) {
						String nombre = resultSetTenistas.getString("Nombre");
						String posicion = resultSetTenistas.getString("Posicion");
						String puntos = resultSetTenistas.getString("Puntos");
						String edad = resultSetTenistas.getString("Edad");

						// Agregar la fila con los datos del jugador a la tabla
						Object[] fila = { nombre, posicion, edad, puntos };
						modeloTabla.addRow(fila);
					}

					// Obtener los datos de la tabla "tenistasfem"
					while (resultSetTenistasFem.next()) {
						String nombre = resultSetTenistasFem.getString("Nombre");
						String posicion = resultSetTenistasFem.getString("Posicion");
						String puntos = resultSetTenistasFem.getString("Puntos");
						String edad = resultSetTenistasFem.getString("Edad");

						// Agregar la fila con los datos del jugador a la tabla
						Object[] fila = { nombre, posicion, edad, puntos };
						modeloTabla.addRow(fila);
					}

					// Obtener los datos de la tabla "tenistasduo"
					while (resultSetTenistasDuo.next()) {
						String nombre = resultSetTenistasDuo.getString("Nombre");
						String posicion = resultSetTenistasDuo.getString("Posicion");
						String puntos = resultSetTenistasDuo.getString("Puntos");
						String edad = resultSetTenistasDuo.getString("Edad");

						// Agregar la fila con los datos del jugador a la tabla
						Object[] fila = { nombre, posicion, edad, puntos };
						modeloTabla.addRow(fila);
					}

					// Cerrar los recursos
					statementTenistas.close();
					statementTenistasFem.close();
					statementTenistasDuo.close();
					connection.close();
				} catch (SQLException ex) {
					System.out.println("Error al obtener datos: " + ex.getMessage());
				}
			}
		});

		setVisible(true);
	}
	public void cerrar() {

		setVisible(false);

	}

	public void actualizaNombre(String usuario) {

		this.usuario = usuario;

		if (!this.usuario.equals("")) {

			setTitle("Interfaz Jugadores - Usuario: " + this.usuario);

		}

		else {
			
			setTitle("interfaz Jugadores");
			
		}
		
	}

	public void ubicacion() {

		System.out.println("Te encuentras en la interfaz Jugadores");

	}
	
}
