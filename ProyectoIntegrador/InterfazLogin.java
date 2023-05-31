package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// INTRERFAZ PARA REGISTRAR USUARIOS E INICIAR SESIÓN

public class InterfazLogin extends JFrame {

	// VARIABLES A NIVEL DE CLASE

	private JPanel contentPane;
	private JTextField usuariocaja;
	private JPasswordField contraseñacaja;
	private String usuarioRegistrado;
	private String contraseñaRegistrada;
	
	private String usuarioIngresado;
	private String contraseñaIngresada;
	
	private double monedero;
	
	private Connection connection;

	private static String usuarioAdmin;
	private static String contraseñaAdmin;

	private int fallos;

	// MÉTODO PARA ACTUALIZAR EL VALOR DEL USUARIO REGISTRADO

	public void actualizarDatos() {

		usuarioRegistrado = usuariocaja.getText();

	}

	// EL MÉTODO DISPOSE LO UTILIZAMOS PARA PODER CRAGAR LOS DATOS DE ESTA INTERFAZ
	// A LA INTERFAZ DE INICIO

	public void dispose() {

		actualizarDatos();

		super.dispose();

	}

	// CONSTRUCTOR

	public InterfazLogin() {

		// LA UBICACIÓN SE MOSTRARÁ AL ABRIR LA VENTANA

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent e) {

				ubicacion();

			}

			// ESTO SE HACE CUANDO SE JUNTE A LO DEL PUNCHIS

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowActivated(e);
				// limpiaLogin();
			}
		});

		// CONEXIÓN CON LA BASE DE DATOS

		String url = "jdbc:mysql://localhost:3306/integradortenis?useUnicode=true&characterEncoding=utf8&user=dck";

		try {

			connection = DriverManager.getConnection(url);

			// SE INICIALIZAN LAS VARIABLES QUE ESTÁN A NIVEL DE CLASE

			// SE CREA EL USUARIO ADMIN

			usuarioAdmin = "Admin";
			contraseñaAdmin = "1234";

			usuarioRegistrado = usuarioAdmin;
			contraseñaRegistrada = contraseñaAdmin;
			
			monedero = 0;

			fallos = 0;

			// PARÁMETROS DE LA VENTANA

			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 571, 372);
			setTitle("Interfaz Login");
			contentPane = new JPanel();
			contentPane.setBackground(new Color(153, 204, 255));
			contentPane.setForeground(Color.BLACK);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			// LABELS

			JLabel lblNewLabel = new JLabel("Proyecto Integrador Tenis");
			lblNewLabel.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
			lblNewLabel.setBounds(110, 11, 312, 35);
			contentPane.add(lblNewLabel);

			JLabel lblRegistrate = new JLabel("REGISTRATE!!!!");
			lblRegistrate.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
			lblRegistrate.setBounds(180, 57, 178, 35);
			contentPane.add(lblRegistrate);

			JLabel lblUsuario = new JLabel("Usuario: ");
			lblUsuario.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
			lblUsuario.setBounds(123, 133, 130, 35);
			contentPane.add(lblUsuario);

			JLabel lblContrasea = new JLabel("Contraseña: ");
			lblContrasea.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
			lblContrasea.setBounds(89, 175, 144, 35);
			contentPane.add(lblContrasea);

			usuariocaja = new JTextField();
			usuariocaja.setBounds(243, 140, 161, 27);
			contentPane.add(usuariocaja);
			usuariocaja.setColumns(10);

			contraseñacaja = new JPasswordField();
			contraseñacaja.setBounds(243, 179, 161, 27);
			contentPane.add(contraseñacaja);

			// BOTONES CON SUS LISTENERS:

			// EL BOTÓN DE REGISTRO NO PERMITIRÁ EL REGISTRO DE UNA CUENTA CON EL NOMBRE DE
			// ADMIN

			// AL JUNTARLO CON LA BASE FALTA QUE NO SE PUEDAN REGISTRAR 2 USUARIOS IGUALES
			// !!!!!

			JButton btnRegistrarse = new JButton("Registrarte");
			btnRegistrarse.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
				    if (!usuariocaja.getText().equals("Admin")) {
				        usuarioRegistrado = usuariocaja.getText();
				        contraseñaRegistrada = new String(contraseñacaja.getPassword());
				        
				        String queryUsuario = "INSERT INTO `usuario`(`nombre`, `contraseña`, `monedero`) VALUES ('" + usuarioRegistrado + "','" + contraseñaRegistrada + "'," + monedero + ")";

				        try {
				        	
				            PreparedStatement statementTenistas = connection.prepareStatement(queryUsuario);
				            statementTenistas.executeUpdate();
				            
				            JOptionPane.showMessageDialog(null, "Registrado correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
				            
				        } catch (SQLException e1) {
				        	
				            e1.printStackTrace();
				            
				        }
				    } else {
				    	
				        JOptionPane.showMessageDialog(null, "Este usuario ya existe", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
				        
				        usuariocaja.setText("");
				        contraseñacaja.setText("");
				        
				    }
				}
			});

			btnRegistrarse.setBounds(171, 234, 184, 27);
			contentPane.add(btnRegistrarse);

			// BOTÓN DE INICIO DE SESIÓN:

			// COMPRUEBA QUE EL USUARIO ESTÉ REGISTRADO Y TIENES 3 INTENTOS PARA INICIAR
			// SESIÓN

			// LAS FUNCIONALIDES SERÁN DIFERENTES SI SE INICIA COMO ADMINISTRADOR O COMO
			// USUARIO REGULAR

			JButton btnIniciarSesion = new JButton("Iniciar Sesion");
			btnIniciarSesion.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
				    usuarioIngresado = usuariocaja.getText();
				    contraseñaIngresada = new String(contraseñacaja.getPassword());

				    try {
				        String query = "SELECT * FROM usuario WHERE nombre = ? AND contraseña = ?";
				        PreparedStatement statement = connection.prepareStatement(query);
				        statement.setString(1, usuarioIngresado);
				        statement.setString(2, contraseñaIngresada);
				        ResultSet resultSet = statement.executeQuery();

				        if (resultSet.next()) {
				            dispose();
				            JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioIngresado + "!!!", "Has Accedido", JOptionPane.INFORMATION_MESSAGE);
				            
				            // Resto del código después de la verificación exitosa
				            InterfazAdmin admin = new InterfazAdmin(usuarioAdmin, contraseñaAdmin);
				            
				            if (usuarioIngresado.equals(usuarioAdmin) && contraseñaIngresada.equals(contraseñaAdmin)) {
				                admin.setVisible(true);
				            } else {
				                admin.setVisible(false);
				            }
				        } else {
				            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
				            usuariocaja.setText("");
				            contraseñacaja.setText("");
				            fallos++;
				        }

				        if (fallos == 3) {
				            System.exit(0);
				        }
				        
				        // SE LLAMA A ACTUALIZAR DATOS
				        actualizarDatos();
				        
				        resultSet.close();
				        statement.close();
				    } catch (SQLException ex) {
				        ex.printStackTrace();
				    }
				}
			});

			btnIniciarSesion.setBounds(172, 266, 184, 27);
			contentPane.add(btnIniciarSesion);

		} catch (SQLException e1) {

			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

	}

	// GETTERS Y SETTERS DEL USUARIO Y LA CONTRASEÑA

	public String getUsuarioRegistrado() {

		actualizarDatos();

		return usuarioRegistrado;

	}

	public String getContraseñaRegistrada() {
		return contraseñaRegistrada;
	}

	public void setUsuarioRegistrado(String usuarioRegistrado) {
		this.usuarioRegistrado = usuarioRegistrado;
	}

	public void setContraseñaRegistrada(String contraseñaRegistrada) {
		this.contraseñaRegistrada = contraseñaRegistrada;
	}
	
	public double getMonedero() {
		return monedero;
	}

	public void setMonedero() {
	    try {
	        String query = "SELECT monedero FROM usuario WHERE nombre = ? AND contraseña = ?";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setString(1, usuarioIngresado);
	        statement.setString(2, contraseñaIngresada);
	        ResultSet resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            this.monedero = resultSet.getDouble("monedero");
	        } else {
	            
	            this.monedero = 0.0;
	        }

	        resultSet.close();
	        statement.close();
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	}


	// SE LIMPIA EL LOGIN

	private void limpiaLogin() {

		usuariocaja.setText("");
		contraseñacaja.setText("");

		usuarioRegistrado = usuarioAdmin;
		contraseñaRegistrada = contraseñaAdmin;

		fallos = 0;

	}

	private void ubicacion() {

		System.out.println("Te encuentras en la interfaz Login");

	}

}
