package EjerciciosClaseU15.TrabajandoConBorderLayouts;

import java.awt.BorderLayout;

import javax.swing.*;

public class TrabajandoConBorderLayouts {

	public static void main(String[] args) {
//MarcoL Marco1 = new MarcoL();
	}
class LaminaBorder extends JPanel{
	private JButton btnAmarillo = new JButton("Amarillo");
	private JButton btnVerde = new JButton("Verde");
	private JButton btnAzul = new JButton("Azul");
	private JButton btnRosa = new JButton("Rosa");
	private JButton btnRojo = new JButton("Rojo");
	private JFrame funcion = new JFrame("Hola");
	public LaminaBorder() {
		BorderLayout disposicion = new BorderLayout();
		setLayout(disposicion);
		add(funcion);
		add(btnAmarillo,BorderLayout.EAST);
		add(btnVerde,BorderLayout.NORTH);
		add(btnAzul,BorderLayout.SOUTH);
		add(btnRosa,BorderLayout.WEST);
		add(btnRojo,BorderLayout.CENTER);
	}
	class MarcoL extends JFrame{
		public MarcoL() {
			setTitle("Trabajando con Layouts");
			setBounds(300,300,600,400);
			LaminaBorder lamina = new LaminaBorder();
		}
	}
}
}
