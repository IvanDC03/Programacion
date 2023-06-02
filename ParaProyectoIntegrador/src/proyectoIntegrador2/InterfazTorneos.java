package proyectoIntegrador2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Color;
import java.awt.event.ActionListener;

public class InterfazTorneos extends JFrame {

	private String usuario;
	
	private JPanel contentPane;

	public InterfazTorneos() {
		
		setTitle("Torneos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 500, 590, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnTorneo1 = new JButton("Torneo 1");
		btnTorneo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos1 = new TorneosDentro();
				torneos1.setVisible(true);
			}
		});
		btnTorneo1.setForeground(new Color(0, 0, 0));
		btnTorneo1.setBounds(20, 69, 146, 21);
		contentPane.add(btnTorneo1);
		btnTorneo1.setBackground(new Color(240, 248, 255));
		JButton btnTorneo2 = new JButton("Torneo 2");
		btnTorneo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos12 = new TorneosDentro();
				torneos12.setVisible(true);
			}
		});
		btnTorneo2.setForeground(new Color(0, 0, 0));
		btnTorneo2.setBounds(212, 69, 146, 21);
		contentPane.add(btnTorneo2);
		btnTorneo2.setBackground(new Color(240, 248, 255));
		JButton btnTorneo3 = new JButton("Torneo 3");
		btnTorneo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos13 = new TorneosDentro();
				torneos13.setVisible(true);
			}
		});

		btnTorneo3.setForeground(new Color(0, 0, 0));
		btnTorneo3.setBounds(411, 69, 155, 21);
		contentPane.add(btnTorneo3);
		btnTorneo3.setBackground(new Color(240, 248, 255));
		JButton btnTorneo4 = new JButton("Torneo 4");
		btnTorneo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos15 = new TorneosDentro();
				torneos15.setVisible(true);
			}
		});
		btnTorneo4.setForeground(new Color(0, 0, 0));
		btnTorneo4.setBounds(20, 123, 146, 21);
		contentPane.add(btnTorneo4);
		btnTorneo4.setBackground(new Color(240, 248, 255));
		JButton btnTorneo5 = new JButton("Torneo 5");
		btnTorneo5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos17 = new TorneosDentro();
				torneos17.setVisible(true);
			}
		});
		btnTorneo5.setForeground(new Color(0, 0, 0));
		btnTorneo5.setBounds(212, 123, 146, 21);
		contentPane.add(btnTorneo5);
		btnTorneo5.setBackground(new Color(240, 248, 255));
		JButton btnTorneo6 = new JButton("Torneo 6");
		btnTorneo6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos19 = new TorneosDentro();
				torneos19.setVisible(true);
			}
		});
		btnTorneo6.setForeground(new Color(0, 0, 0));
		btnTorneo6.setBounds(411, 123, 155, 21);
		contentPane.add(btnTorneo6);
		btnTorneo6.setBackground(new Color(240, 248, 255));
		JButton btnTorneo7 = new JButton("Torneo 7");
		btnTorneo7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos14 = new TorneosDentro();
				torneos14.setVisible(true);
			}
		});
		btnTorneo7.setForeground(new Color(0, 0, 0));
		btnTorneo7.setBounds(20, 179, 146, 21);
		contentPane.add(btnTorneo7);
		btnTorneo7.setBackground(new Color(240, 248, 255));
		JButton btnTorneo8 = new JButton("Torneo 8");
		btnTorneo8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos22 = new TorneosDentro();
				torneos22.setVisible(true);
			}
		});
		btnTorneo8.setForeground(new Color(0, 0, 0));
		btnTorneo8.setBounds(212, 179, 146, 21);
		contentPane.add(btnTorneo8);
		btnTorneo8.setBackground(new Color(240, 248, 255));
		JButton btnTorneo9 = new JButton("Torneo 9");
		btnTorneo9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos32 = new TorneosDentro();
				torneos32.setVisible(true);
			}
		});
		btnTorneo9.setForeground(new Color(0, 0, 0));
		btnTorneo9.setBounds(411, 179, 155, 21);
		contentPane.add(btnTorneo9);
		btnTorneo9.setBackground(new Color(240, 248, 255));
		JButton btnTorneo10 = new JButton("Torneo 10");
		btnTorneo10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos40 = new TorneosDentro();
				torneos40.setVisible(true);
			}
		});
		btnTorneo10.setForeground(new Color(0, 0, 0));
		btnTorneo10.setBounds(212, 233, 146, 21);
		contentPane.add(btnTorneo10);
		btnTorneo10.setBackground(new Color(240, 248, 255));

		JButton btnAtras = new JButton("<- Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cerrar();

			}
		});
		btnAtras.setForeground(Color.BLACK);
		btnAtras.setBackground(new Color(240, 248, 255));
		btnAtras.setBounds(420, 323, 146, 29);
		contentPane.add(btnAtras);
	}
	
	public void cerrar() {
		
		setVisible(false);
		
	}
	
	public void actualizaNombre(String usuario) {
		
		this.usuario = usuario;
		
		if (!this.usuario.equals("")) {
			
			setTitle("Interfaz Torneos - Usuario: " + this.usuario);
			
		}
		
	}
	
	public void ubicacion() {
		
		System.out.println("Te encuentras en la interfaz Torneos");
		
	}
	
}
