package EjerciciosClaseU15.Layouts;

import javax.swing.*;

public class PracticaLayouts {

	public static void main(String[] args) {
		//Layout layout1 = new Layout();
		//Lamina lamina1 = new Lamina();
	}

	class Layout extends JFrame {
		public Layout() {
			setTitle("Practica de Layouts");
			setBounds(400, 300, 200, 100);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

		class Lamina extends JPanel {
			private JButton rojo = new JButton("rojo");
			private JButton naranja = new JButton("naranja");
			private JButton morado = new JButton("morado");
			private JButton verde = new JButton("verde");

			public Lamina() {
				add(rojo);
				add(naranja);
				add(morado);
				add(verde);

			}
		}
	}
}