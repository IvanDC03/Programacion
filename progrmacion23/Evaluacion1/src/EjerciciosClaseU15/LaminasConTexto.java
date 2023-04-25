package EjerciciosClaseU15;

import javax.swing.*;

public class LaminasConTexto extends JPanel {
	public LaminasConTexto() {
		JTextField txtCampo = new JTextField(20);
		add(txtCampo);
		JButton miBoton = new JButton("click");
		add(miBoton);
		JTextArea txt = new JTextArea(8, 20);
		add(txt);

	}
}
