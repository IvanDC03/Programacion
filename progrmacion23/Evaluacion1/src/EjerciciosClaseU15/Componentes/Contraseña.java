package EjerciciosClaseU15.Componentes;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.event.*;

import javax.swing.text.Document;

public class Contraseña {

	public static void main(String[] args) {

		MarcoCajaTexto marco = new MarcoCajaTexto();

	}

}

class MarcoCajaTexto extends JFrame {

	public MarcoCajaTexto() {

		setTitle("Eventos de caja de texto");

		setBounds(300, 300, 600, 400);

		LaminaCajaTexto lamina = new LaminaCajaTexto();

		add(lamina);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

}

class LaminaCajaTexto extends JPanel {

	private JTextField txtUsuario;

	private JPasswordField txtPass;

	public LaminaCajaTexto() {

//lamina principal

		BorderLayout disposicionPpal = new BorderLayout();

		setLayout(disposicionPpal);

//seguna lamina

		JPanel laminaSuperior = new JPanel();

		GridLayout disposicionLamSup = new GridLayout(2, 2);

		laminaSuperior.setLayout(disposicionLamSup);

//creamos las etiquetas

		JLabel lblUsuario = new JLabel("Usuario:");

		JLabel lblPass = new JLabel("Contraseña:");

//creamos las cajas de texto

		txtUsuario = new JTextField(15);

		txtPass = new JPasswordField(15);

//añadimos los componentes a la lamimna superior

		laminaSuperior.add(lblUsuario);

		laminaSuperior.add(txtUsuario);

		laminaSuperior.add(lblPass);

		laminaSuperior.add(txtPass);

//creamos el boton

		JButton btnEnviar = new JButton("Enviar");

//ponemos el campo password a la escucha

		OyenteComprobarPassword oyente = new OyenteComprobarPassword();

		txtPass.getDocument().addDocumentListener(oyente);

		OyenteBoton oyenteB = new OyenteBoton();

		btnEnviar.addActionListener(oyenteB);

//añadimos componentes a la lámina principal

		add(laminaSuperior, BorderLayout.NORTH);

		add(btnEnviar, BorderLayout.SOUTH);

	}

	private class OyenteBoton implements ActionListener {

		@Override

		public void actionPerformed(ActionEvent e) {

			System.out.println("Usuario: " + txtUsuario.getText());

			System.out.print("Contraseña: ");

			char[] pass = txtPass.getPassword();

			for (int i = 0; i < pass.length; i++) {

				System.out.print(pass[i]);

			}

		}

	}

	private class OyenteComprobarPassword implements DocumentListener {

		char[] password = txtPass.getPassword();

		@Override

		public void insertUpdate(DocumentEvent e) {

			if (password.length < 8 || password.length > 12)

				txtPass.setBackground(Color.RED);

			else

				txtPass.setBackground(Color.GREEN);

		}

		@Override

		public void removeUpdate(DocumentEvent e) {

			if (password.length < 8 || password.length > 12)

				txtPass.setBackground(Color.RED);

			else

				txtPass.setBackground(Color.GREEN);

		}

		@Override

		public void changedUpdate(DocumentEvent e) {

// TODO Auto-generated method stub

		}

	}

}