package ProyectoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfazTorneoAdmin extends JFrame {

	private String usuario;
	
	private JPanel contentPane;

	public InterfazTorneoAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
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
