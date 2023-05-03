package EjerciciosClaseU15.Componentes;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class TrabajandoComboBox {

	public static void main(String[] args) {

		MarcoCombo marco = new MarcoCombo();

	}

}

class MarcoCombo extends JFrame {

	public MarcoCombo() {

		setTitle("Combo Box");

		setBounds(300, 300, 400, 300);

		LaminaCombo lamina = new LaminaCombo();

		add(lamina);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

}

class LaminaCombo extends JPanel {

	private JLabel lblTexto;

	private JComboBox cboOpciones;

	public LaminaCombo() {

		BorderLayout disp = new BorderLayout();

		setLayout(disp);

		lblTexto = new JLabel("ESTUDIANDO COMBO BOXES", SwingConstants.CENTER);

		Font miFuente = new Font("Copperplate", Font.PLAIN, 18);

		lblTexto.setFont(miFuente);

//creamos un JPanel para la parte superior

//donde pondremos el comboBox

		JPanel pnlSuperior = new JPanel();

		cboOpciones = new JComboBox();

		cboOpciones.addItem("Serif");

		cboOpciones.addItem("Comic Sans MS");

		cboOpciones.addItem("Courier");

		cboOpciones.addItem("Futura");

//añadimos el combo al panel superior

		pnlSuperior.add(cboOpciones);

//añadir los componentes a la lámina principal

		add(pnlSuperior, BorderLayout.NORTH);

		add(lblTexto, BorderLayout.CENTER);

//ponemos a la escucha

		OyenteCombo oyente = new OyenteCombo();

		cboOpciones.addActionListener(oyente);

	}

	private class OyenteCombo implements ActionListener {

		@Override

		public void actionPerformed(ActionEvent e) {

			Font miFuente = new Font((String) cboOpciones.getSelectedItem(), Font.PLAIN, 18);

			lblTexto.setFont(miFuente);

		}

	}

}
