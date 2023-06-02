package proyectoIntegrador2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import javax.swing.JEditorPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//EN ESTA INTERFAZ EL USUARIO TENDRÁ A CCESO A TODO EL CONTENIDO, DONDE PODRÁ INICIAR Y CERRAR SESIÓN

public class InterfazInicio extends JFrame {

	// VARIABLES A NIVEL DE CLASE

	private JPanel contentPane;
	private String usuario;
	private double monedero;
	private boolean sesionIniciada;

	private InterfazLogin login;
	private InterfazRanking rank;
	private InterfazApuestas apuesta;
	
	private JMenu mnUsuario;
	private JMenu mnIniciar;
	private JMenuItem mntmCerrarSesion;
	private JMenuItem mntmMonedero;
	

	// CONSTRUCTOR

	public InterfazInicio() {

		// WINDOW LISTENER PARA QUE CAMBIE SU NOMBRE Y EL VALOR DE SU MONEDERO

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowActivated(WindowEvent e) {

				usuario = login.getUsuarioRegistrado();
				monedero = login.getMonedero();
						
				actualizaInterfaz();

			}
		});

		// LLAMAMOS A UN MÉTODO QUE DICE POR CONSOLA DÓNDE ESTÁS

		ubicacion();

		// INICIALIZACIÓN DE VARIABLES DE CLASE

		usuario = "";
		sesionIniciada = false;

		login = new InterfazLogin();
		rank = new InterfazRanking();
		apuesta = new InterfazApuestas(usuario);

		login.setVisible(false);
		rank.setVisible(false);
		apuesta.setVisible(false);

		// PARÁMETROS PARA LA VENTANA

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 487);
		setTitle("interfaz Inicio");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ELEMNTOS DE LA INTERFÁZ GRÁFICA:

		// PANELES Y LABELS

		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(240, 248, 255));
		panelTitulo.setBounds(244, 57, 378, 50);
		contentPane.add(panelTitulo);

		JLabel lblProyecto = new JLabel("Proyecto Integrador Tenis");
		lblProyecto.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panelTitulo.add(lblProyecto);

		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(30, 144, 255));
		panelMenu.setBounds(118, 108, 610, 47);
		contentPane.add(panelMenu);

		// TABLA QUE NADIE SE SABE POR QUÉ ESTÁ AQUÍ PERO LA QUEREMOS IGUAL <3

		String[] columnNames = { "Nombre", "Posición", "Puntos", "Edad", "Nacionalidad" };
		Object[][] data = new Object[20][5];
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 233, 671, 186);
		contentPane.add(scrollPane);

		JTable table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		// MENU:

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 842, 34);
		contentPane.add(menuBar);

		// COMPONENTES DEL MENÚ Y SUS RESPECTIVOS LISTENERS:

		// INICIAR SESIÓN
		
		mnIniciar = new JMenu("Iniciar Sesión");
		mnIniciar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {

					usuario = inicioSesion();
					
					login.setAlwaysOnTop(false);

					actualizaInterfaz();

				} catch (Exception ex) {

					ex.printStackTrace();

				}
			}
		});

		menuBar.add(mnIniciar);

		// USUARIO
		
		mnUsuario = new JMenu("");

		menuBar.add(mnUsuario);

		// MENÚ ITEM DE USUARIO DÓNDE SE PUEDE CERRAR SESIÓN

		mntmCerrarSesion = new JMenuItem("Cerrar Sesión");

		mntmCerrarSesion.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				// RESETEA EL USUARIO Y ACTUALIZA

				usuario = "";
				
				actualizaInterfaz();

			}

		});

		mntmCerrarSesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sesionIniciada = false;

				usuario = "";

				actualizaInterfaz();

			}

		});

		mntmMonedero = new JMenuItem("Monedero: ");
		
		mnUsuario.add(mntmMonedero);

		mnUsuario.add(mntmCerrarSesion);
		
		// TORNEOS
		
		JMenu mnTorneos = new JMenu("Torneos");

		mnTorneos.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				if (!usuario.equals("Admin")) {

					InterfazTorneos torn = new InterfazTorneos();
					torn.ubicacion();
					torn.actualizaNombre(usuario);
					torn.setVisible(true);

				}

				else {

					InterfazTorneoAdmin torneoAdmin = new InterfazTorneoAdmin();
					torneoAdmin.ubicacion();
					torneoAdmin.actualizaNombre(usuario);
					torneoAdmin.setVisible(true);

				}

			}

		});

		menuBar.add(mnTorneos);

		// JUGADORES
		
		JMenu mnJugadores = new JMenu("Jugadores");

		mnJugadores.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				InterfazJugadores jugadores = new InterfazJugadores(usuario);
				
				jugadores.ubicacion();
				jugadores.actualizaNombre(usuario);
				jugadores.setVisible(true);
				
			}

		});

		menuBar.add(mnJugadores);

		// RANKING
		
		JMenu mnRanking = new JMenu("Ranking");

		mnRanking.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				rank.actualizaNombre(usuario);
				rank.ubicacion();
				rank.setVisible(true);

			}

		});

		menuBar.add(mnRanking);

		// ESTADÍSTICAS
		
		JMenu mnEstadisticas = new JMenu("Estadísticas");

		mnEstadisticas.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				InterfazEstadisticas estadisticas = new InterfazEstadisticas(usuario);

				estadisticas.ubicacion();
				estadisticas.actualizaNombre(usuario);
				estadisticas.setVisible(true);

			}

		});

		menuBar.add(mnEstadisticas);

		// APUESTAS
		
		JMenu mnApuestas = new JMenu("Apuestas");
		

		mnApuestas.addMouseListener(new MouseAdapter() {

			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {

				try {

					//apuesta = new InterfazApuestas(usuario);
					
					apuesta.actualizaInterfaz(usuario);
					
					apuesta.setVisible(true);
					
					monedero = apuesta.getMonedero();
					
					actualizaInterfaz();
					
				} catch (Exception e1) {

					e1.printStackTrace();

				}

			}

		});

		menuBar.add(mnApuestas);

		// EL MENÚ DE USUARIO SE INICIARÁ NO VISIBLE

		if (sesionIniciada == true) {

			mnUsuario.setVisible(true);

			mntmCerrarSesion.setVisible(true);

		}

		else {

			mnUsuario.setVisible(false);

			mntmCerrarSesion.setVisible(false);

		}

	}

	// MÉTODOS Y FUNCIONES:

	// EL INICIO DE SESIÓN COGERÁ LAS CREDENCIALES DEL USUARIO

	public String inicioSesion() {

		try {

			login.setAlwaysOnTop(true);
			login.setVisible(true);

			return login.getUsuarioRegistrado();

		} catch (Exception ex) {

			ex.printStackTrace();

		}

		return "";

	}

	/* LA INTERFAZ SE ACTUALIZA PARA QUE LAS CREDENCIALES CONSEGUIDAS EN INICIO
	
	SESIÓN SE MUESTREN EN LA INTERFAZ Y EL RESTO DEL PROGRAMA*/

	public void actualizaInterfaz() {

		if (!login.getUsuarioRegistrado().equals("") && !usuario.equals("")) {

			// LA INTERFAZ CAMBIARÁ SU ASPECTO PARA MOSTRAR EL USUARIO
			
			this.sesionIniciada = true;

			setTitle("Interzaf Inicio - Usuario: " + usuario);
			
			mntmMonedero.setText("Monedero: " + monedero + "€");

			actualizaUser();

		}

		else {

			// DEVUELVE A LOS VALORES POR DEFECTO

			this.sesionIniciada = false;

			setTitle("Interzaf Inicio");

			actualizaUser();

		}

	}

	// SE ACTUALIZAN LOS CAMPOS DE INICIO SESIÓN PARA MOSTRAR U OCULTAR LA PESTAÑA DE USURAIO
	
	public void actualizaUser() {

		if (sesionIniciada == true) {

			// HACE VISIBLE EL USUARIO SESIÓN Y OCULTA INICIAR SESIÓN
			
			mnUsuario.setVisible(true);

			mntmCerrarSesion.setVisible(true);

			mnUsuario.setText(usuario);

			mnIniciar.setVisible(false);

		}

		else if (sesionIniciada == false) {

			// HACE VISIBLE INICIAR SESIÓN Y OCULTA EL USUARIO

			mntmCerrarSesion.setVisible(false);

			mnUsuario.setVisible(false);

			mnIniciar.setVisible(true);

		}

	}

	private void ubicacion() {

		System.out.println("Te encuentras en la interfaz Inicio");

	}
}