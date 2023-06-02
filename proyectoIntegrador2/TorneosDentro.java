package proyectoIntegrador2;

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
	
	public TorneosDentro() {
		setBackground(Color.WHITE);
		setTitle("Parte interna de Torneos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 387);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Boton 1");
		btnNewButton_1.setBounds(207, 75, 126, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_2 = new JButton("Boton 2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(34, 75, 126, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(240, 248, 255));
		JButton btnNewButton_3 = new JButton("Boton 3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(374, 75, 126, 21);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(240, 248, 255));
		
		String[] columnNames = {"Nombre", "Posición", "Puntos", "Edad", "Nacionalidad"};
		Object[][] data = new Object[20][5];

		table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(34, 120, 466, 202);
		contentPane.add(scrollPane);
				
		
				JButton btnNewButton = new JButton("Atras");
				btnNewButton.setBounds(34, 27, 110, 29);
				btnNewButton.setBackground(new Color(240, 248, 255));
				btnNewButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						setVisible(false);
						
					}
				});
				
				contentPane.add(btnNewButton);
		
	}
}
