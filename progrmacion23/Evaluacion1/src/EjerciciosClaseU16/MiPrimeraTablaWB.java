package EjerciciosClaseU16;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MiPrimeraTablaWB extends JFrame {

	private JPanel contentPane;

	private JTable miTabla;

	private DefaultTableModel modelo;

	private JButton btnAlta;

	private JButton btnBaja;

	private JButton btnModificar;

	private JButton btnFin;

	private JTextField txtUsuario;

	private JTextField txtPass;

	public static void main(String[] args) {

		MiPrimeraTablaWB frame = new MiPrimeraTablaWB();

		frame.setVisible(true);

	}

	public MiPrimeraTablaWB() {

		setTitle("Tabla Swing");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();

//para quitar la selección de una fila de la tabla

		contentPane.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				miTabla.getSelectionModel().clearSelection();

				limpiarCampos();

			}

		});

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(79, 27, 263, 145);

		contentPane.add(scrollPane);

		miTabla = new JTable();

		miTabla.addMouseListener(new MouseAdapter() {

			@Override

			public void mousePressed(MouseEvent e) {

				int fila = miTabla.getSelectedRow();

				txtUsuario.setText((String) modelo.getValueAt(fila, 0));

				txtPass.setText((String) modelo.getValueAt(fila, 1));

// esto lo hacemos para habilitar el botón de baja

				updateBaja();

//para habilitar el botón de modificar

				updateModificar();

			}

		});

		modelo = new DefaultTableModel( // aquí he copiado lo que había dentro del set model

				new Object[][] { { "Silvia", "123" }, { "Admin", "Secreto" }, { "Pepe", "12345" },

						{ "Lola", "fsadfa" }, },

				new String[] { "USUARIO", "CONTRASEÑA" });

		miTabla.setModel(modelo);

		scrollPane.setViewportView(miTabla);

		btnAlta = new JButton("Alta");

		btnAlta.setEnabled(false);

		btnAlta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				modelo.addRow(new String[] { txtUsuario.getText(), txtPass.getText() });

//para limpiar campos

				limpiarCampos();

			}

		});

		btnAlta.setBounds(21, 232, 85, 21);

		contentPane.add(btnAlta);

		btnBaja = new JButton("Baja");

		btnBaja.setEnabled(false);

		btnBaja.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				modelo.removeRow(miTabla.getSelectedRow()); // eliminamos la fila seleccionada

				limpiarCampos();

			}

		});

		btnBaja.setBounds(116, 232, 85, 21);

		contentPane.add(btnBaja);

		btnModificar = new JButton("Modificar");

		btnModificar.setEnabled(false);

		btnModificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

// averiguamos la fila que está seleccionada

				int fila = miTabla.getSelectedRow();

				modelo.setValueAt(txtUsuario.getText(), fila, 0);

				modelo.setValueAt(txtPass.getText(), fila, 1);

//al final

				limpiarCampos();

			}

		});

		btnModificar.setBounds(211, 232, 85, 21);

		contentPane.add(btnModificar);

		btnFin = new JButton("Finalizar");

		btnFin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}

		});

		btnFin.setBounds(312, 232, 85, 21);

		contentPane.add(btnFin);

		txtUsuario = new JTextField();

		txtUsuario.addKeyListener(new KeyAdapter() {

			@Override

			public void keyReleased(KeyEvent e) {

// creamos un método

				updateAlta();

//para controlar el boton modificar

				updateModificar();

			}

		});

		txtUsuario.setBounds(79, 192, 96, 19);

		contentPane.add(txtUsuario);

		txtUsuario.setColumns(10);

		txtPass = new JTextField();

		txtPass.addKeyListener(new KeyAdapter() {

			@Override

			public void keyReleased(KeyEvent e) {

				updateAlta();

				updateModificar();

			}

		});

		txtPass.setBounds(246, 192, 96, 19);

		contentPane.add(txtPass);

		txtPass.setColumns(10);
	}

	private void limpiarCampos() {

		txtUsuario.setText(null);

		txtPass.setText(null);

//para comprobar que los obotones se habilitan correctamente

		updateAlta();

		updateBaja();

		updateModificar();

	}

	private void updateModificar() {

//tiene que estar también una fila seleccionada

		if (txtUsuario.getText().length() == 0 || txtPass.getText().length() == 0

				|| miTabla.getSelectedRow() == -1)

			btnModificar.setEnabled(false);

		else

			btnModificar.setEnabled(true);

	}

	private void updateBaja() {

//si hay alguna fila seleccionada

		if (miTabla.getSelectedColumn() == -1)

			btnBaja.setEnabled(false);

		else

			btnBaja.setEnabled(true);

	}

	private void updateAlta() {

// cuando los dos campos estén rellenos

		if (txtUsuario.getText().length() == 0 || txtPass.getText().length() == 0)

			btnAlta.setEnabled(false);

		else

			btnAlta.setEnabled(true);

	}

}