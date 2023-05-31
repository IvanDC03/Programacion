package ProyectoIntegrador;

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

		JButton btnNewButton_1 = new JButton("Boton 1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos1 = new TorneosDentro();
				torneos1.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(20, 69, 146, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		JButton btnNewButton = new JButton("Boton 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos12 = new TorneosDentro();
				torneos12.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(212, 69, 146, 21);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_3 = new JButton("Boton 3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos13 = new TorneosDentro();
				torneos13.setVisible(true);
			}
		});

		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBounds(411, 69, 155, 21);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_4 = new JButton("Boton 4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos15 = new TorneosDentro();
				torneos15.setVisible(true);
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(20, 123, 146, 21);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_5 = new JButton("Boton 5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos17 = new TorneosDentro();
				torneos17.setVisible(true);
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setBounds(212, 123, 146, 21);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_6 = new JButton("Boton 6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos19 = new TorneosDentro();
				torneos19.setVisible(true);
			}
		});
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setBounds(411, 123, 155, 21);
		contentPane.add(btnNewButton_6);
		btnNewButton_6.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_7 = new JButton("Boton 7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos14 = new TorneosDentro();
				torneos14.setVisible(true);
			}
		});
		btnNewButton_7.setForeground(new Color(0, 0, 0));
		btnNewButton_7.setBounds(20, 179, 146, 21);
		contentPane.add(btnNewButton_7);
		btnNewButton_7.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_8 = new JButton("Boton 8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos22 = new TorneosDentro();
				torneos22.setVisible(true);
			}
		});
		btnNewButton_8.setForeground(new Color(0, 0, 0));
		btnNewButton_8.setBounds(212, 179, 146, 21);
		contentPane.add(btnNewButton_8);
		btnNewButton_8.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_9 = new JButton("Boton 9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos32 = new TorneosDentro();
				torneos32.setVisible(true);
			}
		});
		btnNewButton_9.setForeground(new Color(0, 0, 0));
		btnNewButton_9.setBounds(411, 179, 155, 21);
		contentPane.add(btnNewButton_9);
		btnNewButton_9.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_3_1 = new JButton("Boton 10");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorneosDentro torneos40 = new TorneosDentro();
				torneos40.setVisible(true);
			}
		});
		btnNewButton_3_1.setForeground(new Color(0, 0, 0));
		btnNewButton_3_1.setBounds(212, 233, 146, 21);
		contentPane.add(btnNewButton_3_1);
		btnNewButton_3_1.setBackground(new Color(240, 248, 255));

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
