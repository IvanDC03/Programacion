package Clases;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class TorneosDentro extends JFrame {

	private JPanel contentPane;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TorneosDentro frame = new TorneosDentro();
					frame.setVisible(true);
					frame.setBackground(Color.CYAN);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TorneosDentro() {
		setBackground(Color.WHITE);
		setTitle("Parte interna de Torneos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Boton 1");
		btnNewButton_1.setBounds(34, 99, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.BLUE);
		JButton btnNewButton_2 = new JButton("Boton 2");
		btnNewButton_2.setBounds(209, 99, 85, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setBackground(Color.BLUE);
		JButton btnNewButton_3 = new JButton("Boton 3");
		btnNewButton_3.setBounds(389, 99, 85, 21);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setBackground(Color.BLUE);
		String[] columnNames = {"Nombre", "Posición", "Puntos", "Edad", "Nacionalidad"};
		Object[][] data = new Object[20][5];
				JTable table_1 = new JTable(data, columnNames);
				table_1.setBounds(34, 151, 466, 162);
				contentPane.add(table_1);
				table_1.setBackground(Color.WHITE);
				table_1.setVisible(true);
				JButton btnNewButton = new JButton("Atras");
				btnNewButton.setBounds(20, 28, 110, 35);
				btnNewButton.setBackground(Color.RED);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				contentPane.add(btnNewButton);
		
	}
}
