package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ranking extends JFrame {

	private JPanel contentPane;
	private JTextField txtRankingJugadoresY;
	private JTable table;
	private JTable table_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ranking frame = new Ranking();
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
	public Ranking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRankingJugadoresY = new JTextField();
		txtRankingJugadoresY.setBackground(new Color(255, 255, 0));
		txtRankingJugadoresY.setEditable(false);
		txtRankingJugadoresY.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtRankingJugadoresY.setText("Ranking Jugadores y Jugadoras Tenis");
		txtRankingJugadoresY.setBounds(235, 11, 425, 49);
		contentPane.add(txtRankingJugadoresY);
		txtRankingJugadoresY.setColumns(10);

		String[] columnNames = {"Nombre", "Posición", "Puntos", "Edad", "Nacionalidad"};
		Object[][] data = new Object[20][5];

		table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(44, 121, 383, 281);
		contentPane.add(scrollPane);

		table_1 = new JTable(data, columnNames);
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(464, 122, 383, 281);
		contentPane.add(scrollPane_1);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(396, 129, 17, 281);
		contentPane.add(scrollBar);
		scrollPane.setVerticalScrollBar(scrollBar);

		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(811, 129, 17, 281);
		contentPane.add(scrollBar_1);
		scrollPane_1.setVerticalScrollBar(scrollBar_1);
		
		btnNewButton = new JButton("<- Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal princpi = new Principal();
		        princpi.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setBounds(691, 418, 156, 34);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 255));
		panel.setBounds(44, 91, 383, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Masculino");
		lblNewLabel.setBackground(new Color(248, 248, 255));
		lblNewLabel.setBounds(139, 0, 92, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(464, 91, 383, 34);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFemenino = new JLabel("Femenino");
		lblFemenino.setBackground(new Color(0, 0, 0));
		lblFemenino.setBounds(148, 0, 92, 25);
		panel_1.add(lblFemenino);
		lblFemenino.setForeground(new Color(0, 0, 0));
		lblFemenino.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
}
