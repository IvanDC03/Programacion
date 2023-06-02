package proyectoIntegrador2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

// INTERFAZ DE APUESTAS

public class InterfazApuestas extends JFrame {

	// VARIABLES A NIVEL DE CLASE

	private String nombre;
	private double monedero;

	// private String partido;
	// private String multiplicador;

	// private Apuesta apuesta;

	private Connection connection;
	private PreparedStatement statementMonederoActual;
	
	private double monederoActual;

	// private ArrayList<Apuesta> apuestas;

	private JPanel contentPane;
	private JTable tablaPartidos;
	private JTable tablaApuestas;
	private DefaultTableModel partidos;
	private DefaultTableModel modelo;
	private JButton btnEliminar;
	private JButton btnAñadir;
	// private JButton btnModificador;
	private JLabel lblMonedero;
	private JButton btnAñadeDinero;

	private JButton btnApostar;
	private JTextField textDinero;

	public void actualizarDatos() {

		monedero = monederoActual;

	}

	public void dispose() {

		actualizarDatos();

		super.dispose();

	}

	// CONSTRUCTOR

	public InterfazApuestas(String usuario){

		// MUESTRA LA UBICACIÓN

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent e) {

				Integer riquezasLabel = (int)(monederoActual);
				
				String dineroLabel = riquezasLabel.toString();
				
				lblMonedero.setText(dineroLabel);
				
				ubicacion();

			}

			@Override
			public void windowClosed(WindowEvent e) {
				
				setVisible(true);
				
				/*if ()) {
					
					setVisible(false);
					
				}*/
				
			}
			
		});

		// INICIALIZAMOS LAS VARIABLES

		this.nombre = usuario;
		
		// this.partido = null;
		// this.multiplicador = null;
		// this.apuestas = new ArrayList<>();

		this.monedero = 0; // LUEGO SE CAMBIA SU VALOR

		// actualizaMonedero();

		// creaApuestas(); // NO ESTÁ IMPLEMENTADO

		// PARÁMETROS DE LA VENTANA

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Interfaz Apuestas");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// PANELS

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
		});

		scrollPane.setBounds(92, 146, 292, 47);
		contentPane.add(scrollPane);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.addMouseListener(new MouseAdapter() {
		});

		scrollPane2.setBounds(92, 38, 292, 80);
		contentPane.add(scrollPane2);

		// CONEXIÓN CON LA BASE DE DATOS

		String url = "jdbc:mysql://localhost:3306/integradortenis?useUnicode=true&characterEncoding=utf8&user=dck";

		try {

			connection = DriverManager.getConnection(url);

			// TABLAS

			// LA TABLA PARTIDOS NOS MUESTRA LOS PARTIDOS DISPONIBLES

			tablaPartidos = new JTable();
			tablaPartidos.addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {

					añadeApuesta();
					eliminaApuesta();

				}

			});

			// LA TABLA APUESTAS NOS MUESTRA LOS PARTIDOS SELECCIONADOS A LOS QUE SE DESEA
			// APOSTAR

			tablaApuestas = new JTable();

			// PARTIDOS CONSTRUIDOS POR DEFECTO

			partidos = new DefaultTableModel(
					
					new Object[][] { { "Nadal vs Djokovic", "x1,24" }, { "Federer vs Sampras", "x0,84" },
							{ "Borj vs Sweeting", "x1,02" } },

					new String[] { "Partido", "Multiplicador" });

			tablaPartidos.setModel(partidos);

			scrollPane2.setViewportView(tablaPartidos);

			modelo = new DefaultTableModel(new Object[][] {}, new String[] { "Partido", "Multiplicador" });

			tablaPartidos.addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					añadeApuesta();
				}
			});

			tablaApuestas.addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {

					eliminaApuesta();

				}

			});

			tablaApuestas.setModel(modelo);
			scrollPane.setViewportView(tablaApuestas);

			// AL AÑADIR PARTIDOS DE TABLA PARTIDOS SU INFORMACIÓN SE COPIA A LA TABLA
			// APUESTAS

			String query = "SELECT monedero FROM usuario WHERE nombre = ?";

			try {

				java.sql.PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, nombre);
				ResultSet resultSet = statement.executeQuery();

				btnAñadir = new JButton("Añadir");
				btnAñadir.setEnabled(false);
				btnAñadir.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						int fila = tablaPartidos.getSelectedRow();

						String partidoSeleccionado = (String) partidos.getValueAt(fila, 0);
						String multiplicadorSeleccionado = (String) partidos.getValueAt(fila, 1);

						modelo.addRow(new String[] { partidoSeleccionado, multiplicadorSeleccionado });

						añadeApuesta();
						actualizaInterfaz(usuario);

					}
				});

				btnAñadir.setBounds(111, 231, 91, 23);
				contentPane.add(btnAñadir);

			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			btnEliminar = new JButton("Eliminar");
			btnEliminar.setEnabled(false);
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					modelo.removeRow(tablaApuestas.getSelectedRow());

					actualizaEliminaApuesta();
					actualizaInterfaz(usuario);

				}
			});

			btnEliminar.setBounds(212, 231, 91, 23);
			contentPane.add(btnEliminar);

			// LOS BOTONES DE AÑADIR DINERO Y APOSTAR QUE SE ENCUENTRAN MÁS ABAJO SOLO
			// FUNCIONAN SI SE HA INICIADO SESIÓN PREVIAMENTE

			btnAñadeDinero = new JButton("Añadir Dinero");
			btnAñadeDinero.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					try {

						añadeDinero(usuario);

					} catch (Exception e1) {

						e1.printStackTrace();

					}
				}
			});

			btnAñadeDinero.setBounds(313, 231, 115, 23);

			contentPane.add(btnAñadeDinero);

			JLabel lblPartidos = new JLabel("Partidos disponibles");
			lblPartidos.setBounds(192, 23, 135, 14);
			contentPane.add(lblPartidos);

			JLabel lblApuestas = new JLabel("Apuestas añadidas");
			lblApuestas.setBounds(193, 129, 104, 14);
			contentPane.add(lblApuestas);

			lblMonedero = new JLabel("Dinero: " + monedero + "€");
			lblMonedero.setBounds(195, 206, 100, 14);
			contentPane.add(lblMonedero);

			textDinero = new JTextField("0");
			textDinero.setBounds(296, 203, 106, 20);
			contentPane.add(textDinero);
			textDinero.setColumns(10);

			btnApostar = new JButton("Apostar");
			btnApostar.setBounds(10, 231, 91, 23);

			contentPane.add(btnApostar);

		} catch (SQLException e1) {

			// TODO Auto-generated catch block
			e1.printStackTrace();

		}
		
		

	}

	public double getMonedero() {

		actualizarDatos();

		actualizaMonedero(monederoActual);

		return monedero;

	}

	// LOS BOTONES SE ENCIENDEN O APAGAN EN FUNCIÓN DE LA COLUMNA SELECCIONADA Y DE
	// SÍ HAY DATOS EN LA TABLA

	private void añadeApuesta() {

		if (tablaPartidos.getSelectedRow() == -1) {

			btnAñadir.setEnabled(false);

		}

		else {

			btnAñadir.setEnabled(true);

			tablaApuestas.getRowCount();

		}

	}

	private void eliminaApuesta() {

		if (tablaApuestas.getSelectedRow() == -1) {

			btnEliminar.setEnabled(false);

		}

		else {

			btnEliminar.setEnabled(true);

		}

	}

	// SOLO SE PODRÁ AÑADIR DINERO DE FORMA NUMÉRICA Y AL ERRAR EL INGRESO RESETEA
	// EL VALOR DE LA CAJA DE TEXTO

	// EL MONEDERO SE ACTUALIZA

	private void añadeDinero(String usuario) {
		
		try {
			
			String queryMonederoActual = "SELECT `monedero` FROM `usuario` WHERE `nombre` = ?";
			statementMonederoActual = connection.prepareStatement(queryMonederoActual);
			statementMonederoActual.setString(1, usuario);
			ResultSet resultSetMonederoActual = statementMonederoActual.executeQuery();

			if (resultSetMonederoActual.next()) {
				
				monederoActual = resultSetMonederoActual.getDouble("monedero");
				monederoActual += Integer.parseInt(textDinero.getText());

				String queryMonedero = "UPDATE `usuario` SET `monedero` = ? WHERE `nombre` = ?";
				PreparedStatement statementMonedero = connection.prepareStatement(queryMonedero);
				statementMonedero.setDouble(1, monederoActual);
				statementMonedero.setString(2, usuario);
				statementMonedero.executeUpdate();

				actualizaMonedero(monederoActual);
				
			} else {
				
				JOptionPane.showMessageDialog(null, "El usuario no fue encontrado", "Error al añadir dinero",
						JOptionPane.ERROR_MESSAGE);
				
			}
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "El valor introducido no es numérico", "Error al añadir dinero",
					JOptionPane.ERROR_MESSAGE);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// MÉTODOS PARA ACTUALIZAR ELEMENTOS

	private void actualizaMonedero(double monederoActual) {

			lblMonedero.setText("Dinero: " + monederoActual + "€");

			dispose();

	}

	private void actualizaEliminaApuesta() {

		btnEliminar.setEnabled(false);

	}

	private void actualizaApostar() {

		if (tablaApuestas.getRowCount() > 0) {

			btnApostar.setEnabled(true);

		}

		else {

			btnApostar.setEnabled(false);

		}

	}

	/*
	 * private void creaApuestas() { // NO IMPLEMENTADO
	 * 
	 * // AQUÍ SE CREAN LOS DATOS DE LAS APUESTAS PERO NO ESTÁ IMPLEMENTADO AL //
	 * FUNCIONAMIENTO
	 * 
	 * for (int n = 0; n < 10; n++) {
	 * 
	 * double multiplicador = (double) (Math.random() * 2);
	 * 
	 * int finaliza = (int) (Math.random() * 11);
	 * 
	 * boolean finalizada;
	 * 
	 * if (finaliza % 2 == 0) {
	 * 
	 * finalizada = true;
	 * 
	 * }
	 * 
	 * else {
	 * 
	 * finalizada = false;
	 * 
	 * }
	 * 
	 * apuesta = new Apuesta(multiplicador, false, finalizada);
	 * 
	 * apuestas.add(apuesta);
	 * 
	 * }
	 * 
	 * }
	 */

	public void actualizaInterfaz(String usuario) {

		this.nombre = usuario;

		btnAñadeDinero.setEnabled(false);
		btnApostar.setEnabled(false);

		if (!this.nombre.equals("")) {

			setTitle("Interfaz Apuestas - Usuario: " + this.nombre);
			btnAñadeDinero.setEnabled(true);

			actualizaApostar();

		}

	}

	private void ubicacion() {

		System.out.println("Te encuentras en la interfaz Apuestas");

	}
}