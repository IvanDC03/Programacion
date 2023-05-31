package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;

	public class Ranking extends JFrame {
	
		private JPanel contentPane;
		private JTextField txtRankingJugadoresY;
		private JTable table;
		private JButton btnNewButton;
		private JScrollPane scrollPane;
		private JPanel panelfem;
		private JPanel panelduo1;
		private JScrollPane scrollpaneduo;
	
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ranking frame = new Ranking();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		public Ranking() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 905, 504);
			contentPane = new JPanel();
			contentPane.setForeground(new Color(100, 149, 237));
			contentPane.setBackground(new Color(100, 149, 237));
			contentPane.setBorder(new EmptyBorder(0, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
	
			txtRankingJugadoresY = new JTextField();
			txtRankingJugadoresY.setBackground(new Color(100, 149, 237));
			txtRankingJugadoresY.setEditable(false);
			txtRankingJugadoresY.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24));
			txtRankingJugadoresY.setText("Ranking Mundial");
			txtRankingJugadoresY.setBounds(333, 11, 201, 49);
			contentPane.add(txtRankingJugadoresY);
			txtRankingJugadoresY.setColumns(10);
	
			String url = "jdbc:mysql://localhost:3306/integradortenis?useUnicode=true&characterEncoding=utf8&user=dck";
			
			try {
			    Connection conexionbbdd = DriverManager.getConnection(url);
			    String sentencia = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistas ORDER BY Posicion";
			    PreparedStatement conexion2 = (PreparedStatement) conexionbbdd.prepareStatement(sentencia);
			    ResultSet resultSet = conexion2.executeQuery();
	
			    ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
			    int sumacoumnas = metaData.getColumnCount();
	
			    
			    resultSet.last();
			    int filastotal = resultSet.getRow();
			    resultSet.beforeFirst();
	
			    Object[][] data = new Object[filastotal][sumacoumnas];
			    String[] nombrescolumnas = new String[sumacoumnas];
	
			    for (int i = 1; i <= sumacoumnas; i++) {
			        nombrescolumnas[i - 1] = metaData.getColumnName(i);
			    }
	
			    int row = 0;
			    while (resultSet.next()) {
			        for (int i = 1; i <= sumacoumnas; i++) {
			            data[row][i - 1] = resultSet.getObject(i);
			        }
			        row++;
			    }
	
			    conexion2.close();
			    conexionbbdd.close();
	
			    JTable table = new JTable(data, nombrescolumnas);
			    scrollPane = new JScrollPane(table);
			    scrollPane.setBounds(44, 121, 785, 279);
			    contentPane.add(scrollPane);
	
			    JScrollBar scrollBar = new JScrollBar();
			    scrollBar.setBounds(396, 129, 17, 281);
			    contentPane.add(scrollBar);
			    scrollPane.setVerticalScrollBar(scrollBar);
			} catch (SQLException e) {
			    System.out.println("Error al obtener datos: " + e.getMessage());
			}
			
			
			btnNewButton = new JButton("<- Atrás");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Principal princpi = new Principal();
					princpi.setVisible(true);
				}
			});
			btnNewButton.setBackground(new Color(240, 248, 255));
			btnNewButton.setBounds(739, 411, 123, 32);
			contentPane.add(btnNewButton);
	
			JPanel panel = new JPanel();
			panel.setBackground(new Color(224, 255, 255));
			panel.setBounds(44, 93, 785, 307);
			contentPane.add(panel);
			panel.setLayout(null);
	
			JLabel lblNewLabel = new JLabel("Masculino");
			lblNewLabel.setBackground(new Color(248, 248, 255));
			lblNewLabel.setBounds(329, 0, 92, 25);
			panel.add(lblNewLabel);
			lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			
			scrollPane.setVisible(true);
			panel.setVisible(true);
			
			
			
			//creacion tabla mujeres
			
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
			JTable tablafemenino = new JTable(amplituddatos, columnNames.toArray());
			JScrollPane scrollpanefem = new JScrollPane(tablafemenino);
			scrollpanefem.setBounds(41, 121, 788, 279);
			contentPane.add(scrollpanefem);
			
			//fin creacion tabla mujeres
			
			//CREACION TABLA DUOS
			
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

			    JTable table = new JTable(data, columnNames1);
			    JScrollPane scrollpaneduo = new JScrollPane(table);
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
		
		//FIN CREACION TABLA DUOS
		
		

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
		

	}
