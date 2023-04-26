package EjerciciosClaseU15.Layouts;

import javax.swing.JFrame;

public class TrabajandoConLayouts {

	public static void main(String[] args) {
MarcoLayout marco = new MarcoLayout();
	}

}
class MarcoLayout extends JFrame{
	public MarcoLayout() {
		setTitle("Trabajando con Layouts");
		setBounds(300,300,600,400);
		LaminaLayout lamina = new LaminaLayout();
	}
}
class LaminaLayout extends JFrame{
	public LaminaLayout() {
		
	}
}