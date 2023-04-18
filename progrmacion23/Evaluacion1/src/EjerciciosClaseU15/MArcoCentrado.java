package EjerciciosClaseU15;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MArcoCentrado extends JFrame  {
public MArcoCentrado() {
	Toolkit pantalla = Toolkit.getDefaultToolkit();
	Dimension tamaño = pantalla.getScreenSize();
	int altura = tamaño.height;
	int ancho = tamaño.width;
	setVisible(true);
	setSize(ancho/2,altura/2);
	setLocation(ancho/4,altura/4);

}


}
