package EjerciciosClaseU15;

import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco extends JFrame {
public Marco() {
	//setSize(500,300);
	//setLocation(400,200);
	setBounds(400,200,500,300);
	//setResizable(false);
	//setExtendedState(Frame.MAXIMIZED_BOTH);
	//dar titulo a la venatana
	setTitle("Mi primera ventana");
	getToolkit();
}
}
