package EjerciciosClaseU15.Componentes;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class TrabajandoCheckBoxes {

	public static void main(String[] args) {

		MarcoCheck marco = new MarcoCheck();

	}

}

class MarcoCheck extends JFrame {

	public MarcoCheck() {

		setTitle("Check Box");

		setBounds(300, 300, 300, 450);

		LaminaCheck lamina = new LaminaCheck();

		add(lamina);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

}

class LaminaCheck extends JPanel {

	private JLabel lblTexto;

	private JCheckBox chkNegrita, chkCursiva;

	public LaminaCheck() {

		BorderLayout disposicion = new BorderLayout();

		setLayout(disposicion);

//creo un estilo de fuente

		Font miLetra = new Font("Comic Sans MS", Font.PLAIN, 24);

		lblTexto = new JLabel("Voy a aprobar programación");

		lblTexto.setFont(miLetra);

		chkNegrita = new JCheckBox("Negrita");

		chkCursiva = new JCheckBox("Cursiva");

//creamos una lamina para la zona sur de tipo grid

//y le agregramos los checks (por defecto la disposición es flowlayout)

		JPanel laminaChecks = new JPanel();

		laminaChecks.add(chkNegrita);

		laminaChecks.add(chkCursiva);

//añadimos los componentes a la lámina principal

		add(lblTexto, BorderLayout.NORTH);

		add(laminaChecks, BorderLayout.SOUTH);

//ponemos a la escucha los cheks

		OyenteCheck oyente = new OyenteCheck();

		chkCursiva.addActionListener(oyente);

		chkNegrita.addActionListener(oyente);

	}

	private class OyenteCheck implements ActionListener {

		@Override

		public void actionPerformed(ActionEvent e) {

			int estilo = 0;

			if (chkNegrita.isSelected())

				estilo += Font.BOLD;

			if (chkCursiva.isSelected())

				estilo += Font.ITALIC;

			Font nuevaFuente = new Font("Comic Sans MS", estilo, 24);

			lblTexto.setFont(nuevaFuente);

		}

	}

}
