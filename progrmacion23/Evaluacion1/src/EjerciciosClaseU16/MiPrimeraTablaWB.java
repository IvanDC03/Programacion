package EjerciciosClaseU16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MiPrimeraTablaWB extends JFrame {

	private JPanel contentPane;
	private JTable MiTabla;
	private JTextField txtTxtUsuario;
	private JTextField txtTxtPassword;
	private JTextField Tabla;

	
	public static void main(String[] args) {
					MiPrimeraTablaWB frame = new MiPrimeraTablaWB();
					frame.setVisible(true);
			}

	
	public MiPrimeraTablaWB() {
		setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 47, 242, 128);
		contentPane.add(scrollPane);
		
		MiTabla = new JTable();
		scrollPane.setViewportView(MiTabla);
		
		Tabla = new JTextField();
		Tabla.setColumns(3);
		scrollPane.setColumnHeaderView(Tabla);
		
		JButton btnNewButton = new JButton("Alta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//modelo.addRow(new String [] (txtusuario.getText(),txtPassword.getText()));
			}
		});
		btnNewButton.setBounds(10, 326, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Baja");
		btnNewButton_1.setBounds(112, 326, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modificacion");
		btnNewButton_2.setBounds(220, 326, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.setBounds(488, 326, 85, 21);
		contentPane.add(btnNewButton_3);
		
		txtTxtUsuario = new JTextField();
		txtTxtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtTxtUsuario.setText("txt Usuario");
		txtTxtUsuario.setBounds(52, 216, 96, 19);
		contentPane.add(txtTxtUsuario);
		txtTxtUsuario.setColumns(10);
		
		txtTxtPassword = new JTextField();
		txtTxtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtTxtPassword.setText("txt Password");
		txtTxtPassword.setBounds(198, 216, 96, 19);
		contentPane.add(txtTxtPassword);
		txtTxtPassword.setColumns(10);
	}
}
