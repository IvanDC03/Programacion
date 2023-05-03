package EjerciciosClaseU15.Componentes;

import java.awt.BorderLayout;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JCheckBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.SwingConstants;

public class TrabajandoRadioButtons {

	public static void main(String[] args) {

		MarcoRadio marco = new MarcoRadio();

	}

}

class MarcoRadio extends JFrame {

	public MarcoRadio() {

		setTitle("Radio Buttons");

		setBounds(300, 300, 400, 300);

		LaminaRadio lamina = new LaminaRadio();

		add(lamina);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

}

class LaminaRadio extends JPanel {

	private JLabel lblTexto;

	public LaminaRadio() {

		BorderLayout disp = new BorderLayout();

		setLayout(disp);

//creamos lbl para el texto

		Font miFuente = new Font("Copperplate", Font.PLAIN, 18);

		lblTexto = new JLabel("ESTUDIANDO SWING", SwingConstants.CENTER);

		lblTexto.setFont(miFuente);

//creamos el grupo para los radiobuttons

		ButtonGroup grpRadio = new ButtonGroup();

//creamos los radiobuttons

		JRadioButton btnGrande = new JRadioButton("Grande", false);

		JRadioButton btnMediano = new JRadioButton("Mediano", false);

		JRadioButton btnPequeño = new JRadioButton("Pequeño", false);

//añadimos los radiobuttons al grupo

		grpRadio.add(btnGrande);

		grpRadio.add(btnMediano);

		grpRadio.add(btnPequeño);

//creamos panel para la zona sur

		JPanel pnlSur = new JPanel();

//agregamos los botones a la lámina sur

		pnlSur.add(btnGrande);

		pnlSur.add(btnMediano);

		pnlSur.add(btnPequeño);

//agregamos los componentes a la lámina principal

		add(lblTexto, BorderLayout.CENTER);

		add(pnlSur, BorderLayout.SOUTH);

//ponemos a la escucha los botones

		OyenteRadioButton oyente = new OyenteRadioButton();

		btnGrande.addActionListener(oyente);

		btnMediano.addActionListener(oyente);

		btnPequeño.addActionListener(oyente);

	}

	private class OyenteRadioButton implements ActionListener {

		@Override

		public void actionPerformed(ActionEvent e) {

			Font miFuente;

//detectamos la opcion que hemos pulsado

			switch (e.getActionCommand())

			{

			case "Grande":

				miFuente = new Font("Copperplate", Font.PLAIN, 26);

				lblTexto.setFont(miFuente);

				break;

			case "Mediano":

				miFuente = new Font("Copperplate", Font.PLAIN, 18);

				lblTexto.setFont(miFuente);

				break;

			case "Pequeño":

				miFuente = new Font("Copperplate", Font.PLAIN, 10);

				lblTexto.setFont(miFuente);

				break;

			}

		}

	}

}