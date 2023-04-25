package EjerciciosClaseU15;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {

		MarcoEventos marco = new MarcoEventos();
	}
}

class MarcoEventos extends JFrame {
	public MarcoEventos() {
		setTitle("Trabanjando con eventos de ventana");
		setBounds(300, 200, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		OyenteVentana oyente = new OyenteVentana();
		addWindowListener(oyente);
	}
}

class OyenteVentana implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("La ventana ha sido abierta");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("La ventana ha sido cerrada");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventana esta cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("La ventana ha sido minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("La ventana ha sido desminizada");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("La ventana ha sido activada");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("La ventana ha sido desactivada");

	}

}