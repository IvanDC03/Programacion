package proyectoIntegrador2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// FALTA TERMINAR

public class InterfazAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private JTextField textUsuario;
	private JPasswordField textPass;
	private JButton btnBaja;
	private JButton btnAlta;
	private JButton btnModificador;

	private Connection connection;
	
	private static String usuarioRegistrado;
	private static String contraseñaRegistrada;

	public InterfazAdmin(String usuarioRegistrado, String contraseñaRegistrada) {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				ubicacion();
				
			}
		});
		
		this.usuarioRegistrado = usuarioRegistrado;
		this.contraseñaRegistrada = contraseñaRegistrada;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Interfaz administrador");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String url = "jdbc:mysql://localhost:3306/integradortenis?useUnicode=true&characterEncoding=utf8&user=dck";

		try {

			connection = DriverManager.getConnection(url);
			String selectQuery = "SELECT *FROM usuario";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(selectQuery);
			ResultSet resultSet = statement.executeQuery();

			ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();

			resultSet.last();
			int rowCount = resultSet.getRow();
			resultSet.beforeFirst();

			Object[][] data = new Object[rowCount][columnCount];
			String[] columnNames = new String[columnCount];

			for (int i = 1; i <= columnCount; i++) {
				columnNames[i - 1] = metaData.getColumnName(i);
			}

			int row = 0;

			while (resultSet.next()) {

				for (int i = 1; i <= columnCount; i++) {

					data[row][i - 1] = resultSet.getObject(i);

				}

				row++;

			}

			statement.close();
			connection.close();

			table = new JTable(data, columnNames);
			JScrollPane scrollPane = new JScrollPane(table);
			
			table.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mousePressed(MouseEvent e) {
					textUsuario.setText((String) modelo.getValueAt(table.getSelectedRow(), 0));
					textPass.setText((String) modelo.getValueAt(table.getSelectedRow(), 1));
					actualizaAlta();
					actualizaBaja();
					actualizaModificar();
				}
			});
			
			scrollPane.setBounds(44, 121, 785, 279);
			contentPane.add(scrollPane);

			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(396, 129, 17, 281);
			contentPane.add(scrollBar);

		} catch (SQLException e) {

			System.out.println("Error al obtener datos: " + e.getMessage());
		}
		
		/*JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
		});
		scrollPane.setBounds(66, 66, 292, 97);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textUsuario.setText((String) modelo.getValueAt(table.getSelectedRow(), 0));
				textPass.setText((String) modelo.getValueAt(table.getSelectedRow(), 1));
				actualizaAlta();
				actualizaBaja();
				actualizaModificar();
			}
		});

		modelo = new DefaultTableModel(new Object[][] { { usuarioRegistrado, contraseñaRegistrada },
				{ "Tomás", "123456789" }, { "Hola", "Soy Lola" } }, new String[] { "Usuario", "Contraseña" });
		table.setModel(modelo);
		scrollPane.setViewportView(table);*/

		btnAlta = new JButton("Registrar");
		btnAlta.setEnabled(false);
		btnAlta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				modelo.addRow(new String[] { textUsuario.getText(), textPass.getText() });
				
				String queryUsuario = "INSERT INTO `usuario`(`nombre`, `contraseña`, `monedero`) VALUES ('" + textUsuario.getText() + "','" + textPass.getText() + "', 0 )";
				
				try {
		        	
		            PreparedStatement statementUsuarios = connection.prepareStatement(queryUsuario);
		            statementUsuarios.executeUpdate();
		            
		            JOptionPane.showMessageDialog(null, "Registrado correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
		            
		        } catch (SQLException e1) {
		        	
		            e1.printStackTrace();
		            
		        }
				
				actualizaAlta();
				actualizaBaja();
				actualizaModificar();
				textUsuario.setText(null);
				textPass.setText(null);
				actualizaAlta();
				
			}
		});
		
		btnAlta.setBounds(10, 231, 91, 23);
		contentPane.add(btnAlta);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(337, 231, 91, 23);
		contentPane.add(btnSalir);

		btnBaja = new JButton("Eliminar");
		btnBaja.setEnabled(false);
		btnBaja.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (table.getSelectedRow() != 0) {
					modelo.removeRow(table.getSelectedRow());
					actualizaAlta();
					actualizaBaja();
					actualizaModificar();
					textUsuario.setText(null);
					textPass.setText(null);
					actualizaAlta();
					
				} else {
					JOptionPane.showMessageDialog(null, "No puedes eliminar el usuario Admin",
							"Error al eliminar un usuario", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnBaja.setBounds(111, 231, 91, 23);
		contentPane.add(btnBaja);

		btnModificador = new JButton("Modificar");
		btnModificador.setEnabled(false);
		btnModificador.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (table.getSelectedRow() != 0) {
					
					String queryMUsuario = "UPDATE `usuario` SET `nombre`='" + textUsuario.getText() + "',`contraseña`='" + textPass.getText() + "',`monedero`= 0 WHERE 1";
					
					try {
			        	
			            PreparedStatement statementUsuarios = connection.prepareStatement(queryMUsuario);
			            statementUsuarios.executeUpdate();
			            
			            JOptionPane.showMessageDialog(null, "Registrado correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
			            
			        } catch (SQLException e1) {
			        	
			            e1.printStackTrace();
			            
			        }
					
					modelo.setValueAt(textUsuario.getText(), table.getSelectedRow(), 0);
					modelo.setValueAt(textPass.getText(), table.getSelectedRow(), 1);
					actualizaAlta();
					actualizaBaja();
					actualizaModificar();
					textUsuario.setText(null);
					textPass.setText(null);
					actualizaAlta();
					
				} else {
					JOptionPane.showMessageDialog(null, "No puedes modificar el usuario Admin",
							"Error al modificar un usuario", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnModificador.setBounds(212, 231, 115, 23);
		contentPane.add(btnModificador);

		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				actualizaAlta();
				actualizaBaja();
				actualizaModificar();
				actualizaAlta();
			}
		});
		textUsuario.setBounds(66, 186, 136, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);

		textPass = new JPasswordField();
		textPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				actualizaAlta();
				actualizaBaja();
				actualizaModificar();
			}
		});
		textPass.setBounds(212, 186, 146, 20);
		contentPane.add(textPass);
		textPass.setColumns(10);

	}

	protected void actualizaAlta() {

		if (textUsuario.getText().length() == 0 || textPass.getText().length() == 0) {

			btnAlta.setEnabled(false);

		}

		else {

			btnAlta.setEnabled(true);

		}

	}

	private void actualizaBaja() {

		if (table.getSelectedRow() == -1) {

			btnBaja.setEnabled(false);

		}

		else {

			btnBaja.setEnabled(true);

		}

	}

	private void actualizaModificar() {

		if (textUsuario.getText().length() == 0 || textPass.getText().length() == 0 || table.getSelectedRow() == -1) {

			btnModificador.setEnabled(false);

		}

		else {

			btnModificador.setEnabled(true);

		}

	}

	private void ubicacion() {
		
		System.out.println("Te encuentras en la interfaz Administrador");
		
	}
	
}
