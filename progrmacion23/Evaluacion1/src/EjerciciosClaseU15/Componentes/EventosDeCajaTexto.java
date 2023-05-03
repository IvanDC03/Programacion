package EjerciciosClaseU15.Componentes;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosDeCajaTexto {

	public static void main(String[] args) {
MarcoTexto marco1 = new MarcoTexto();
	}

}
class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setTitle("Area de textos");
		setBounds(700,300,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaArea lamina = new LaminaArea();
		add(lamina);
		setVisible(true);
	}
}
class LaminaTexto extends JPanel {
	private JTextField txtTexto;
	
	public LaminaTexto() {
		txtTexto = new JTextField();
		add(txtTexto);
		EventosDeCajaTexto oyente = new EventosDeCajaTexto();
		//Document miDocumento = new Document();
	}

}
class OyenteCajaText implements DocumentListener{

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}