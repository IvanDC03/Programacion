package EjerciciosClaseU15.Componentes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;


public class IntroduciendoTexto {

	public static void main(String[] args) {
MarcoConTexto marco = new MarcoConTexto();
LaminaConTexto lamina = new LaminaConTexto();
	}

}
class MarcoConTexto extends JFrame{
	public MarcoConTexto() {
		setBounds(300,300,500,700);
		setTitle("Trabajamdo con cajas de texto");
		LaminaConTexto lamina = new LaminaConTexto();
		add(lamina);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class LaminaConTexto extends JPanel{
	private JTextField text = new JTextField(30);
	private JButton btnEscribir = new JButton("Presiona para confirmar");
	private JLabel email = new JLabel("Email");
	public JTextComponent lblerror;
	public LaminaConTexto() {
		add(text);
		add(btnEscribir);
		add(email);
		System.out.println(text.getText());
		OyenteEscribirTexto eventoOyente = new OyenteEscribirTexto();
		btnEscribir.addActionListener(eventoOyente);
	}
private class OyenteEscribirTexto implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(text.getText().trim());
		text.setText("");
	}

}
private class OyenteEmail implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if (email(text.getText())) {
			lblerror.setText("Email Correcto");
			lblerror.setOpaque(true);
			lblerror.setBackground(Color.GREEN);
		}
		else {
			lblerror.setText("Email Incorrecto");
			lblerror.setOpaque(true);
			lblerror.setBackground(Color.RED);
		}
	}
	
}
public boolean email(String text2) {
	// TODO Auto-generated method stub
	return false;
}
}
