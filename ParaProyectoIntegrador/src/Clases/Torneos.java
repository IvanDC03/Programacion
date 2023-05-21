package Clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Color;

public class Torneos extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Torneos frame = new Torneos();
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
	public Torneos() {
		setTitle("Torneos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Boton 1");
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBounds(20, 69, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.BLUE);
		JButton btnNewButton = new JButton("Boton 2");
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBounds(242, 69, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(Color.BLUE);
		JButton btnNewButton_3 = new JButton("Boton 3");
		btnNewButton_3.setForeground(Color.ORANGE);
		btnNewButton_3.setBounds(481, 69, 85, 21);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setBackground(Color.BLUE);
		JButton btnNewButton_4 = new JButton("Boton 4");
		btnNewButton_4.setForeground(Color.ORANGE);
		btnNewButton_4.setBounds(20, 123, 85, 21);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setBackground(Color.BLUE);
		JButton btnNewButton_5 = new JButton("Boton 5");
		btnNewButton_5.setForeground(Color.ORANGE);
		btnNewButton_5.setBounds(242, 123, 85, 21);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.setBackground(Color.BLUE);
		JButton btnNewButton_6 = new JButton("Boton 6");
		btnNewButton_6.setForeground(Color.ORANGE);
		btnNewButton_6.setBounds(481, 123, 85, 21);
		contentPane.add(btnNewButton_6);
		btnNewButton_6.setBackground(Color.BLUE);
		JButton btnNewButton_7 = new JButton("Boton 7");
		btnNewButton_7.setForeground(Color.ORANGE);
		btnNewButton_7.setBounds(20, 179, 85, 21);
		contentPane.add(btnNewButton_7);
		btnNewButton_7.setBackground(Color.BLUE);
		JButton btnNewButton_8 = new JButton("Boton 8");
		btnNewButton_8.setForeground(Color.ORANGE);
		btnNewButton_8.setBounds(242, 179, 85, 21);
		contentPane.add(btnNewButton_8);
		btnNewButton_8.setBackground(Color.BLUE);
		JButton btnNewButton_9 = new JButton("Boton 9");
		btnNewButton_9.setForeground(Color.ORANGE);
		btnNewButton_9.setBounds(481, 179, 85, 21);
		contentPane.add(btnNewButton_9);
		btnNewButton_9.setBackground(Color.BLUE);
		JButton btnNewButton_3_1 = new JButton("Boton 10");
		btnNewButton_3_1.setForeground(Color.ORANGE);
		btnNewButton_3_1.setBounds(242, 233, 85, 21);
		contentPane.add(btnNewButton_3_1);
		btnNewButton_3_1.setBackground(Color.BLUE);
	}

	}

