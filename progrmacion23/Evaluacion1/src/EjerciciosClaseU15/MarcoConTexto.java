package EjerciciosClaseU15;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame {
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminasConTexto lamina = new LaminasConTexto();
		add(lamina);
		setVisible(true);
	}
}
