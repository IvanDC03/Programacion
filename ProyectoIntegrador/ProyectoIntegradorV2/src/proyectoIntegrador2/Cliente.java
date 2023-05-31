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
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class Cliente extends JFrame {

	private String nombre;
	private double monedero;

	private String partido;
	private String multiplicador;

	private Apuesta apuesta;

	private ArrayList<Apuesta> apuestas;

	private JPanel contentPane;
	private JTable tablaPartidos;
	private JTable tablaApuestas;
	private DefaultTableModel partidos;
	private DefaultTableModel modelo;
	private JButton btnEliminar;
	private JButton btnAñadir;
	private JButton btnModificador;
	private JLabel lblMonedero;
	private JButton btnAñadeDinero;
	private JTextField textDinero;

	public Cliente(String usuarioRegistrado) {

		this.nombre = usuarioRegistrado;
		this.partido = null;
		this.multiplicador = null;
		this.apuestas = new ArrayList<>();
		creaApuestas();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Interzaf Usuario: " + nombre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

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

		tablaPartidos = new JTable();
		tablaPartidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				añadeApuesta();
				eliminaApuesta();
			}
		});

		tablaApuestas = new JTable();

		partidos = new DefaultTableModel(new Object[][] { { "Navidal vs Djokovic", "x1,24" },
				{ "Federer vs Sampras", "x0,84" }, { "Borj vs Sweeting", "x1,02" } },
				new String[] { "Partido", "Multiplicador" });
		tablaPartidos.setModel(partidos);
		scrollPane2.setViewportView(tablaPartidos);

		modelo = new DefaultTableModel(new Object[][] {}, new String[] { "Partido", "Multiplicador" });
		tablaApuestas.setModel(modelo);
		scrollPane.setViewportView(tablaApuestas);

		btnAñadir = new JButton("Añadir");
		btnAñadir.setEnabled(false);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.addRow(new String[] { "partido", "multiplica" }); // NO CONSEGUIMOS QUE COPIE LOS DATOS DE LA
																			// TABLA DE ARRIBA
				añadeApuesta();
			}
		});
		btnAñadir.setBounds(10, 231, 91, 23);
		contentPane.add(btnAñadir);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(337, 231, 91, 23);
		contentPane.add(btnSalir);

		btnEliminar = new JButton("Eliminar"); // FUNCIONA REGULINCHIS
		btnEliminar.setEnabled(false);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.removeRow(tablaApuestas.getSelectedRow());
				eliminaApuesta();
			}
		});
		btnEliminar.setBounds(111, 231, 91, 23);
		contentPane.add(btnEliminar);
		
		btnAñadeDinero = new JButton("Añadir Dinero");
		btnAñadeDinero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadeDinero();
			}
		});
		btnAñadeDinero.setBounds(212, 231, 115, 23);
		contentPane.add(btnAñadeDinero);

		JLabel lblPartidos = new JLabel("Partidos disponibles");
		lblPartidos.setBounds(192, 23, 135, 14);
		contentPane.add(lblPartidos);

		JLabel lblApuestas = new JLabel("Apuestas añadidas");
		lblApuestas.setBounds(193, 129, 104, 14);
		contentPane.add(lblApuestas);

		lblMonedero = new JLabel("Dinero: " + monedero + "€");
		lblMonedero.setBounds(102, 204, 100, 14);
		contentPane.add(lblMonedero);
		
		textDinero = new JTextField();
		textDinero.setBounds(251, 204, 106, 20);
		contentPane.add(textDinero);
		textDinero.setColumns(10);

	}

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
	private void añadeDinero() {
			
			monedero += Integer.parseInt(textDinero.getText());
			
			actualizaMonedero();
			
	}
	
	private void actualizaMonedero() {
		
		lblMonedero.setText("Dinero: " + monedero + "€");
		
	}
	
	private void creaApuestas() {

		// AQUÍ SE CREAN LOS DATOS DE LAS APUESTAS PERO NO ESTÁ IMPLEMENTADO AL
		// FUNCIONAMIENTO

		for (int n = 0; n < 10; n++) {

			double multiplicador = (double) (Math.random() * 2);

			int finaliza = (int) (Math.random() * 11);

			boolean finalizada;

			if (finaliza % 2 == 0) {

				finalizada = true;

			}

			else {

				finalizada = false;

			}

			apuesta = new Apuesta(multiplicador, false, finalizada);

			apuestas.add(apuesta);

		}
	}
	
}