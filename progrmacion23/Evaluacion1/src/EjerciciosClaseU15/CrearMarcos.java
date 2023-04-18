package EjerciciosClaseU15;

import javax.swing.JFrame;

public class CrearMarcos {

	public static void main(String[] args) {
MArcoCentrado PrimerMarco = new MArcoCentrado();
//Hago visible el marco
PrimerMarco.setVisible(true);
//indicar que hara cuando se cierre
PrimerMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
