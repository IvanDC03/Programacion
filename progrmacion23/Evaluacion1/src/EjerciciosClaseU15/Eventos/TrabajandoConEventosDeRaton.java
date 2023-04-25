package EjerciciosClaseU15.Eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class TrabajandoConEventosDeRaton {

	public static void main(String[] args) {
MarcoRaton marco = new MarcoRaton();
	}

}
class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setTitle("Eventos del raton");
		setBounds(700,300,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
		OyenteRaton miEvento = new OyenteRaton();
		addMouseListener(miEvento);
		addMouseMotionListener(miEvento);
	}
	
}
class OyenteRaton implements MouseListener,MouseMotionListener{

	@Override
	public void mouseClicked(MouseEvent e) {
System.out.println("Has hecho click");
System.out.println("Coordenada x" + e.getX());
System.out.println("Coordenada y" + e.getY());
System.out.println("Numero de click" + e.getClickCount());
	}

	@Override
	public void mousePressed(MouseEvent e) {
/*System.out.println("Estas presionando el boton");
System.out.println(e.getModifiersEx());*/
if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
	System.out.println("Boton izquierdo");
}
else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
	System.out.println("Boton derecho");
}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Has soltado el boton");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Has entrado");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Has salido");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
System.out.println("Estoy arrastrando");		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
System.out.println("Estoy moviendo");		
	}
	
}