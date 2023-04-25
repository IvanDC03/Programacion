package EjerciciosClaseU15.Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConEventos {

	public static void main(String[] args) {
MarcoConEventos eventos = new MarcoConEventos();
	}

}
class MarcoConEventos extends JFrame{
	public MarcoConEventos() {
		setTitle("Trabajando con Eventos");
		setBounds(700,300,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaConEventos lamina = new LaminaConEventos();
		add(lamina);
		setVisible(true);
	}
}
class LaminaConEventos extends JPanel implements ActionListener{
	private JButton verde = new JButton("Verde");
	private JButton azul = new JButton("Azul");
	private JButton amarillo = new JButton("Amarillo");
	private JButton saludar = new JButton("Saludar");
	public LaminaConEventos() {
		/*añadimos un boton*/
		add(verde);
		add(azul);
		add(amarillo);
		add(saludar);
		/*indicar quien va a recibir la accion del click*/
		verde.addActionListener(this);
		azul.addActionListener(this);
		amarillo.addActionListener(this);
		saludar.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		/*cambiar el color del fondo*/
		if (botonPulsado==verde) {
			setBackground(Color.GREEN);
		}
		else if(botonPulsado==azul) {
			setBackground(Color.BLUE);
		}
		else {
			setBackground(Color.YELLOW);
		}
		if (botonPulsado==saludar) {
			System.out.println("Hola que tal?");
		}
	}
}