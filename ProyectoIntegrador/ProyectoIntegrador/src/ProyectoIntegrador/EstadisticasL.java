package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EstadisticasL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstadisticasL frame = new EstadisticasL();
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
	public EstadisticasL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columnNames = {"Nombre", "%Saque", "%1Serv", "%Puntos", "%Gana"};
		Object[][] data = new Object[20][5];
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 147, 279, 272);
		contentPane.add(scrollPane);
		
				JTable table = new JTable(data, columnNames);
				scrollPane.setViewportView(table);
				
				
				
		
				String[] columnNames2 = {"Nombre", "%Saque", "%1Serv", "%Puntos", "%Gana"};
				Object[][] data2 = new Object[20][5];
				JScrollPane scrollPane2 = new JScrollPane();
				scrollPane2.setBounds(299, 147, 289, 272);
				contentPane.add(scrollPane2);
				
						JTable table2 = new JTable(data2, columnNames2);
						scrollPane2.setViewportView(table2);
						
						
						
						String[] columnNames3 = {"Nombre", "%Saque", "%1Serv", "%Puntos", "%Gana"};
						Object[][] data3 = new Object[20][5];
						JScrollPane scrollPane3 = new JScrollPane();
						scrollPane3.setBounds(598, 147, 293, 272);
						contentPane.add(scrollPane3);
						
						
								JTable table3 = new JTable(data3, columnNames3);
								scrollPane3.setViewportView(table3);
								
								JPanel panel = new JPanel();
								panel.setBackground(new Color(255, 255, 0));
								panel.setBounds(274, 29, 345, 41);
								contentPane.add(panel);
								panel.setLayout(null);
								
								JLabel lblNewLabel = new JLabel("Estadisticas Tenistas");
								lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
								lblNewLabel.setBounds(78, 11, 189, 19);
								panel.add(lblNewLabel);
								
								JPanel panel_1 = new JPanel();
								panel_1.setBackground(new Color(255, 0, 255));
								panel_1.setBounds(10, 119, 279, 28);
								contentPane.add(panel_1);
								panel_1.setLayout(null);
								
								JLabel lblNewLabel_1 = new JLabel("Líderes Servicio");
								lblNewLabel_1.setBackground(new Color(238, 130, 238));
								lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
								lblNewLabel_1.setBounds(69, 11, 128, 14);
								panel_1.add(lblNewLabel_1);
								
								JPanel panel_1_1 = new JPanel();
								panel_1_1.setBackground(new Color(135, 206, 235));
								panel_1_1.setBounds(299, 119, 289, 28);
								contentPane.add(panel_1_1);
								panel_1_1.setLayout(null);
								
								JLabel lblNewLabel_2 = new JLabel("Líderes Devolución");
								lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
								lblNewLabel_2.setBounds(58, 11, 153, 14);
								panel_1_1.add(lblNewLabel_2);
								
								JPanel panel_1_1_1 = new JPanel();
								panel_1_1_1.setBackground(new Color(127, 255, 212));
								panel_1_1_1.setBounds(598, 119, 293, 28);
								contentPane.add(panel_1_1_1);
								panel_1_1_1.setLayout(null);
								
								JLabel lblNewLabel_3 = new JLabel("Líderes Bajo Presión");
								lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
								lblNewLabel_3.setBounds(53, 11, 168, 14);
								panel_1_1_1.add(lblNewLabel_3);
								
								JButton btnNewButton = new JButton("<- Atrás");
								btnNewButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										Principal princpi = new Principal();
								        princpi.setVisible(true);
									}
								});
								btnNewButton.setBounds(739, 430, 126, 30);
								contentPane.add(btnNewButton);
				
		
	}
}
