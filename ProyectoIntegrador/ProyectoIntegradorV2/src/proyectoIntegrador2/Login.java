package proyectoIntegrador2;

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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usuariocaja;
	private JPasswordField contraseñacaja;
	private String usuarioRegistrado;
	private String contraseñaRegistrada;

	private static String usuarioAdmin;
	private static String contraseñaAdmin;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {

		usuarioAdmin = "Admin";
		contraseñaAdmin = "1234";

		usuarioRegistrado = usuarioAdmin;
		contraseñaRegistrada = contraseñaAdmin;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Proyecto Integrador Tenis");
		lblNewLabel.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
		lblNewLabel.setBounds(110, 11, 312, 35);
		contentPane.add(lblNewLabel);

		JLabel lblRegistrate = new JLabel("REGISTRATE!!!!");
		lblRegistrate.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
		lblRegistrate.setBounds(180, 57, 178, 35);
		contentPane.add(lblRegistrate);

		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 20));
		lblUsuario.setBounds(123, 133, 130, 35);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contraseña :");
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

		JButton btnRegistrarse = new JButton("Registrarte");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuarioRegistrado = usuariocaja.getText();
				contraseñaRegistrada = new String(contraseñacaja.getPassword());
				JOptionPane.showMessageDialog(null, "Registrado correctamente", "Registro exitoso",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnRegistrarse.setBounds(171, 234, 184, 27);
		contentPane.add(btnRegistrarse);

		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuarioIngresado = usuariocaja.getText();
				String contraseñaIngresada = new String(contraseñacaja.getPassword());

				if (usuarioIngresado.equals(usuarioRegistrado) && contraseñaIngresada.equals(contraseñaRegistrada)) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioRegistrado + "!!!", "Has Accedido",
							JOptionPane.INFORMATION_MESSAGE);

					/*
					 * Principal hsl = new Principal(); hsl.setVisible(true);
					 */

					Admin admin = new Admin(usuarioRegistrado, contraseñaRegistrada);
					Cliente cliente = new Cliente(usuarioRegistrado);

					if (usuarioAdmin.equals(usuarioIngresado) && contraseñaAdmin.equals(contraseñaIngresada)) {

						admin.setVisible(true);

					}

					else {

						cliente.setVisible(true);

					}

				} else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos", "Error de inicio de sesión",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIniciarSesion.setBounds(172, 266, 184, 27);
		contentPane.add(btnIniciarSesion);
	}

}
