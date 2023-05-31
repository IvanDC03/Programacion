/*package ConexionBBDD;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Rank extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JPanel panelfem;
	private JPanel panelduo1;
	private JScrollPane scrollpaneduo;
	private JTextField txtRankingJugadoresY;
	private JTable tableMasculino;
	private JTable tableFemenino;
	private JTable tableDuos;
	private JButton btnAtras;
	private String usuario;

	public Rank() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 905, 504);
		setTitle("Interfaz Ranking");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtRankingJugadoresY = new JTextField();
		txtRankingJugadoresY.setBackground(new Color(255, 255, 0));
		txtRankingJugadoresY.setEditable(false);
		txtRankingJugadoresY.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtRankingJugadoresY.setText("Ranking Jugadores y Jugadoras Tenis");
		txtRankingJugadoresY.setBounds(235, 11, 425, 49);
		contentPane.add(txtRankingJugadoresY);
		txtRankingJugadoresY.setColumns(10);

		String url = "jdbc:mysql://localhost:3306/integradortenis?useUnicode=true&characterEncoding=utf8&user=dck";

		

		try {

			Connection connection = DriverManager.getConnection(url);
			String selectQuery = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistas ORDER BY Posicion";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(selectQuery);
			ResultSet resultSet = statement.executeQuery();

			//ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
			//int columnCount = metaData.getColumnCount();

			resultSet.last();
			int rowCount = resultSet.getRow();
			resultSet.beforeFirst();

			Object[][] data = new Object[rowCount][columnCount];
			String[] columnNames = new String[columnCount];

			for (int i = 1; i <= columnCount; i++) {
				columnNames[i - 1] = metaData.getColumnName(i);
			}

			int row = 0;

			while (resultSet.next()) {

				for (int i = 1; i <= columnCount; i++) {

					data[row][i - 1] = resultSet.getObject(i);

				}

				row++;

			}

			statement.close();
			connection.close();

			tableMasculino = new JTable(data, columnNames);
			scrollPane = new JScrollPane(tableMasculino);
			scrollPane.setBounds(44, 121, 785, 279);
			contentPane.add(scrollPane);

			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(396, 129, 17, 281);
			contentPane.add(scrollBar);

		} catch (SQLException e) {

			System.out.println("Error al obtener datos: " + e.getMessage());
		}

		// FIN CREACIÓN TABLA MASCULINOS
		
		btnAtras = new JButton("<- Atrás");
		btnAtras.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				
			}
		});

		btnAtras.setBackground(new Color(240, 248, 255));
		btnAtras.setBounds(739, 411, 123, 32);
		contentPane.add(btnAtras);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(44, 93, 785, 307);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblMasculino = new JLabel("Masculino");
		lblMasculino.setBackground(new Color(248, 248, 255));
		lblMasculino.setBounds(329, 0, 92, 25);
		panel.add(lblMasculino);
		lblMasculino.setForeground(new Color(0, 0, 0));
		lblMasculino.setFont(new Font("Tahoma", Font.PLAIN, 20));

		scrollPane.setVisible(true);
		panel.setVisible(true);

		// creacion tabla mujeres

		ArrayList<String> columnNames = new ArrayList<>();
		ArrayList<Object[]> dataRows = new ArrayList<>();

		try {

			Connection connection = DriverManager.getConnection(url);
			String selectQuery = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistasfem ORDER BY Posicion";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(selectQuery);
			ResultSet resultSet = statement.executeQuery();

			ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();

			// Obtener nombres de columnas
			for (int i = 1; i <= columnCount; i++) {
				columnNames.add(metaData.getColumnName(i));
			}

			// Obtener datos de las filas
			while (resultSet.next()) {
				Object[] rowData = new Object[columnCount];
				for (int i = 1; i <= columnCount; i++) {
					rowData[i - 1] = resultSet.getObject(i);
				}
				dataRows.add(rowData);
			}

			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error al obtener datos: " + e.getMessage());
		}

		// Crear matriz de datos
		Object[][] amplituddatos = new Object[dataRows.size()][columnNames.size()];
		for (int i = 0; i < dataRows.size(); i++) {
			amplituddatos[i] = dataRows.get(i);
		}

		// Crear la tabla con los datos obtenidos
		tableFemenino = new JTable(amplituddatos, columnNames.toArray());
		JScrollPane scrollpanefem = new JScrollPane(tableFemenino);
		scrollpanefem.setBounds(41, 121, 788, 279);
		contentPane.add(scrollpanefem);

		// fin creacion tabla mujeres

		// CREACION TABLA DUOS

		try {

			Connection connection = DriverManager.getConnection(url);
			String selectQuery = "SELECT * FROM tenistasduo";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(selectQuery);
			ResultSet resultSet = statement.executeQuery();

			ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();

			resultSet.last();
			int rowCount = resultSet.getRow();
			resultSet.beforeFirst();

			Object[][] data = new Object[rowCount][columnCount];
			String[] columnNames1 = new String[columnCount];

			for (int i = 1; i <= columnCount; i++) {
				columnNames1[i - 1] = metaData.getColumnName(i);
			}

			int row = 0;
			while (resultSet.next()) {
				for (int i = 1; i <= columnCount; i++) {
					data[row][i - 1] = resultSet.getObject(i);
				}
				row++;
			}

			statement.close();
			connection.close();

			tableDuos = new JTable(data, columnNames1);
			JScrollPane scrollpaneduo = new JScrollPane(tableDuos);
			scrollpaneduo.setBounds(41, 121, 788, 279);
			contentPane.add(scrollpaneduo);

			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(626, 199, 17, 48);
			contentPane.add(scrollBar);
			scrollpaneduo.setVerticalScrollBar(scrollBar);

			JPanel panel1 = new JPanel();
			panel1.setBackground(new Color(224, 255, 255));
			panel1.setBounds(648, 223, 1, 1);
			contentPane.add(panel1);
			panel1.setLayout(null);

			JLabel label = new JLabel("Masculino");
			label.setBackground(new Color(248, 248, 255));
			label.setBounds(329, 0, 92, 25);
			panel1.add(label);
			label.setForeground(new Color(0, 0, 0));
			label.setFont(new Font("Tahoma", Font.PLAIN, 20));

			JPanel panelduo1 = new JPanel();
			panelduo1.setBackground(new Color(224, 255, 255));
			panelduo1.setBounds(41, 93, 788, 307);
			contentPane.add(panelduo1);
			panelduo1.setLayout(null);

			JLabel texto = new JLabel("Tenistas Duplas");
			texto.setFont(new Font("Tahoma", Font.PLAIN, 22));
			texto.setBounds(315, 0, 140, 25);
			panelduo1.add(texto);

			scrollpaneduo.setVisible(true);
			panelduo1.setVisible(true);
		} catch (SQLException e) {
			System.out.println("Error al obtener datos: " + e.getMessage());
		}

		// FIN CREACION TABLA DUOS

		JComboBox<String> comboBox = new JComboBox();
		comboBox.setBackground(new Color(224, 255, 255));
		comboBox.setBounds(44, 11, 89, 22);
		contentPane.add(comboBox);
		JComboBox<String> comboBox1 = null;
		comboBox.addItem("Masculino");

		comboBox.addItem("Femenino");

		comboBox.addItem("Tenistas Duo");

		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox.getSelectedItem();

				if (selectedOption.equals("Masculino")) {

					scrollPane.setVisible(true);
					panel.setVisible(true);

					// Ocultar tabla de tenistas dúo
					scrollpaneduo.setVisible(false);
					panelduo1.setVisible(false);

					// Ocultar tabla femenina
					scrollpanefem.setVisible(false);
					panelfem.setVisible(false);

				} else if (selectedOption.equals("Femenino")) {

					scrollPane.setVisible(false);
					panel.setVisible(false);

					// Mostrar tabla femenina
					scrollpanefem.setVisible(true);
					panelfem.setVisible(true);

					// Ocultar tabla de tenistas dúo
					scrollpaneduo.setVisible(false);
					panelduo1.setVisible(false);

				} else if (selectedOption.equals("Tenistas Duo")) {

					scrollPane.setVisible(false);
					panel.setVisible(false);

					// Ocultar tabla femenina
					scrollpanefem.setVisible(false);
					panelfem.setVisible(false);

					// Mostrar tabla de tenistas dúo
					scrollpaneduo.setVisible(true);
					panelduo1.setVisible(true);
				}
			}
		});

	}

	public void cerrar() {

		setVisible(false);

	}

	public void actualizaNombre(String usuario) {

		this.usuario = usuario;

		if (!this.usuario.equals("")) {

			setTitle("Interfaz Ranking - Usuario: " + this.usuario);

		}
		
		else {
			
			setTitle("interfaz Jugadores");
			
		}

	}

	public void ubicacion() {

		System.out.println("Te encuentras en la interfaz Ranking");

	}

}*/
