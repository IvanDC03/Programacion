package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Principal extends JFrame {

	protected static final String Display = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(214, 11, 378, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Proyecto Integrador Tenis");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(120, 83, 610, 47);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Torneos");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Jugadores");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Jugadores jugador = new Jugadores();
		        jugador.setVisible(true);
		    }
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Estadisticas");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Apuestas\r\n");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1_1_1);
		
				
				JButton btnNewButton_2 = new JButton("Usuario");
				btnNewButton_2.setBounds(10, 11, 89, 23);
				contentPane.add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("Ranking");
				btnNewButton_3.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        Ranking rank = new Ranking();
				        rank.setVisible(true);
				    }
				});
				btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_3.setBounds(182, 156, 490, 41);
				contentPane.add(btnNewButton_3);
				
				String[] columnNames = {"Nombre", "Posición", "Puntos", "Edad", "Nacionalidad"};
				Object[][] data = new Object[20][5];
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(88, 233, 671, 186);
				contentPane.add(scrollPane);
				
						JTable table = new JTable(data, columnNames);
						scrollPane.setViewportView(table);

		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstadisticasL princpi4 = new EstadisticasL();
		        princpi4.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Torneos torn = new Torneos();
				torn.setVisible(true);
				
			}
		});
		
	}
}
