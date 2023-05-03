package EjerciciosClaseU15.Componentes;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Trabajando {

	public static void main(String[] args) {
MarcoArea marco = new MarcoArea();
	}

}
class MarcoArea extends JFrame{
	public MarcoArea() {
		setTitle("Area de textos");
		setBounds(700,300,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaArea lamina = new LaminaArea();
		add(lamina);
		setVisible(true);
	}
}
class LaminaArea extends JPanel {
	private JTextArea textArea;
	public LaminaArea() {
		textArea = new JTextArea(8,20);
		textArea.setLineWrap(true);
		JScrollPane laminaScroll = new JScrollPane(textArea);
		add(laminaScroll);
	}

}
class OyenteAreaTexto implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
