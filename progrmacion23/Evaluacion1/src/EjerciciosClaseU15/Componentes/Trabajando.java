package EjerciciosClaseU15.Componentes;

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
		Lamina lamina = new Lamina();
		add(lamina);
		setVisible(true);
	}
}
class Lamina extends JPanel implements ActionListener {
	private JTextArea textArea;
	public Lamina() {
		textArea = new JTextArea(8,20);
		textArea.setLineWrap(true);
		JScrollPane laminaScroll = new JScrollPane(textArea);
		add(laminaScroll);
	}
	@Override
	public void actionPerformed (ActionEvent e) {
		
		
	}
	
}