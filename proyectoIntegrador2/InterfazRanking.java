package proyectoIntegrador2;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;

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

public class InterfazRanking extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JPanel panelFem;
	private JPanel panelDuo1;
	private JScrollPane scrollPaneDuo;
	private JTextField txtRankingJugadoresY;
	private JTable tableMasculino;
	private JTable tableFemenino;
	private JTable tableDuos;
	private JButton btnAtras;
	private String usuario;

	public InterfazRanking() {

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
		    
		    Connection conexion = DriverManager.getConnection(url);  // conexión bbdd

		    String consultaSelect = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistas ORDER BY Posicion"; // Consulta SQL 

		    PreparedStatement sentencia = (PreparedStatement) conexion.prepareStatement(consultaSelect); // Preparar la sentencia

		    ResultSet resultado = sentencia.executeQuery();  // Ejecutar la consulta y obtener el resultado

		    
		    ResultSetMetaData metaData = (ResultSetMetaData) resultado.getMetaData(); // nos da información sobre las columnas del resultado
		    int cantidadColumnas = metaData.getColumnCount();

		    
		    resultado.last(); // nos da el numero de filas que va a haber
		    int cantidadFilas = resultado.getRow();
		    resultado.beforeFirst();

		    // Crear una matriz para almacenar los datos de las filas y un array para los nombres de las columnas
		    Object[][] datos = new Object[cantidadFilas][cantidadColumnas];
		    String[] nombresColumnas = new String[cantidadColumnas];

		   
		    for (int i = 1; i <= cantidadColumnas; i++) {  // Saca los nombres de las columnas
		        nombresColumnas[i - 1] = metaData.getColumnName(i);
		    }

		    int fila = 0;

		   
		    while (resultado.next()) {  // Recorrer  y guarda los datos en la matriz
		        for (int i = 1; i <= cantidadColumnas; i++) {
		            datos[fila][i - 1] = resultado.getObject(i);
		        }
		        fila++;
		    }

		     
		    sentencia.close(); // Cerrar la sentencia y la conexión a la bbdd
		    conexion.close();

		  
		    tableMasculino = new JTable(datos, nombresColumnas);
		    
		    scrollPane = new JScrollPane(tableMasculino);
		    scrollPane.setBounds(44, 121, 785, 279);
		    contentPane.add(scrollPane);

		} catch (SQLException e) {
		    
		    System.out.println("Error al obtener datos: " + e.getMessage());
		}

		// FIN CREACIÓN TABLA MASCULINOS

		btnAtras = new JButton("<- Atrás");  //boton atras y sus funcionalidades
		btnAtras.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        setVisible(false);
		    }
		});

		btnAtras.setBackground(new Color(240, 248, 255)); //estilo btn atras
		btnAtras.setBounds(739, 411, 123, 32);
		contentPane.add(btnAtras);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(44, 93, 785, 307);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblMasculino = new JLabel("Masculino"); //Layout
		lblMasculino.setBackground(new Color(248, 248, 255));
		lblMasculino.setBounds(329, 0, 92, 25);
		panel.add(lblMasculino);
		lblMasculino.setForeground(new Color(0, 0, 0));
		lblMasculino.setFont(new Font("Tahoma", Font.PLAIN, 20));

		scrollPane.setVisible(true);
		panel.setVisible(true);

		// creación tabla mujeres

		ArrayList<String> nombresColumnas = new ArrayList<>();
		ArrayList<Object[]> filasDatos = new ArrayList<>();

		try {
		    Connection conexion = DriverManager.getConnection(url);  // conexión bbdd
		    String consultaSelect = "SELECT Nombre, Posicion, Puntos, Edad FROM tenistasfem ORDER BY Posicion"; // Consulta SQL 
		    PreparedStatement sentencia = (PreparedStatement) conexion.prepareStatement(consultaSelect); // Preparar la sentencia
		    ResultSet resultado = sentencia.executeQuery(); // Ejecutar la consulta y obtener el resultado

		    ResultSetMetaData metaData = (ResultSetMetaData) resultado.getMetaData(); // nos da información sobre las columnas del resultado
		    int cantidadColumnas = metaData.getColumnCount();

		    
		    for (int i = 1; i <= cantidadColumnas; i++) {  // Saca los nombres de las columnas
		        nombresColumnas.add(metaData.getColumnName(i));
		    }

		  
		    while (resultado.next()) {
		        Object[] datosFila = new Object[cantidadColumnas];
		        for (int i = 1; i <= cantidadColumnas; i++) {
		            datosFila[i - 1] = resultado.getObject(i);
		        }
		        filasDatos.add(datosFila);
		    }

		    sentencia.close();
		    conexion.close();
		} catch (SQLException e) {
		    System.out.println("Error al obtener datos: " + e.getMessage());
		}

		
		Object[][] datosAmplitud = new Object[filasDatos.size()][nombresColumnas.size()]; // Crear matriz de datos
		for (int i = 0; i < filasDatos.size(); i++) {
		    datosAmplitud[i] = filasDatos.get(i);
		}

		
		tableFemenino = new JTable(datosAmplitud, nombresColumnas.toArray()); // Crear la tabla con los datos obtenidos
		JScrollPane scrollPaneFem = new JScrollPane(tableFemenino);
		scrollPaneFem.setBounds(41, 121, 788, 279);
		contentPane.add(scrollPaneFem);

		// fin creación tabla mujeres

		// CREACIÓN TABLA DUOS

		try {
		    Connection conexion = DriverManager.getConnection(url);
		    String consultaSelect = "SELECT * FROM tenistasduo";
		    PreparedStatement sentencia = (PreparedStatement) conexion.prepareStatement(consultaSelect);
		    ResultSet resultado = sentencia.executeQuery();

		    ResultSetMetaData metaData = (ResultSetMetaData) resultado.getMetaData();
		    int cantidadColumnas = metaData.getColumnCount();

		    resultado.last();
		    int cantidadFilas = resultado.getRow();
		    resultado.beforeFirst();

		    Object[][] datos = new Object[cantidadFilas][cantidadColumnas];
		    String[] nombresColumnas1 = new String[cantidadColumnas];

		    for (int i = 1; i <= cantidadColumnas; i++) {
		        nombresColumnas1[i - 1] = metaData.getColumnName(i);
		    }

		    int fila = 0;
		    while (resultado.next()) {
		        for (int i = 1; i <= cantidadColumnas; i++) {
		            datos[fila][i - 1] = resultado.getObject(i);
		        }
		        fila++;
		    }

		    sentencia.close();
		    conexion.close();

		    tableDuos = new JTable(datos, nombresColumnas1);
		    JScrollPane scrollPaneDuo = new JScrollPane(tableDuos);
		    scrollPaneDuo.setBounds(41, 121, 788, 279);
		    contentPane.add(scrollPaneDuo);

		    JScrollBar scrollBar = new JScrollBar();
		    scrollBar.setBounds(626, 199, 17, 48);
		    contentPane.add(scrollBar);
		    scrollPaneDuo.setVerticalScrollBar(scrollBar);

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

		    JPanel panelDuo1 = new JPanel();
		    panelDuo1.setBackground(new Color(224, 255, 255));
		    panelDuo1.setBounds(41, 93, 788, 307);
		    contentPane.add(panelDuo1);
		    panelDuo1.setLayout(null);

		    JLabel texto = new JLabel("Tenistas Duplas");
		    texto.setFont(new Font("Tahoma", Font.PLAIN, 22));
		    texto.setBounds(315, 0, 140, 25);
		    panelDuo1.add(texto);

		    scrollPaneDuo.setVisible(true);
		    panelDuo1.setVisible(true);
		} catch (SQLException e) {
		    System.out.println("Error al obtener datos: " + e.getMessage());
		}

		// FIN CREACIÓN TABLA DUOS

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
		        String opcionSeleccionada = (String) comboBox.getSelectedItem();

		        if (opcionSeleccionada.equals("Masculino")) {

		            scrollPane.setVisible(true);            //Muestra y oculta las tablas 
		            panel.setVisible(true);

		            
		            scrollPaneDuo.setVisible(false);
		            panelDuo1.setVisible(false);

		            
		            scrollPaneFem.setVisible(false);
		            panelFem.setVisible(false);

		        } else if (opcionSeleccionada.equals("Femenino")) {

		            scrollPane.setVisible(false);
		            panel.setVisible(false);

		           
		            scrollPaneFem.setVisible(true);
		            panelFem.setVisible(true);

		           
		            scrollPaneDuo.setVisible(false);
		            panelDuo1.setVisible(false);

		        } else if (opcionSeleccionada.equals("Tenistas Duo")) {

		            scrollPane.setVisible(false);
		            panel.setVisible(false);

		           
		            scrollPaneFem.setVisible(false);
		            panelFem.setVisible(false);

		           
		            scrollPaneDuo.setVisible(true);
		            panelDuo1.setVisible(true);
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

}
