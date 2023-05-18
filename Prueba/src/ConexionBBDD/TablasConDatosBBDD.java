package ConexionBBDD;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class TablasConDatosBBDD {

	public static void main(String[] args) {
		
		MarcoDatosBBDD marco = new MarcoDatosBBDD();
	}

}

class MarcoDatosBBDD extends JFrame{
	
	private JComboBox nombreTablas;
	private Connection miConexion;
	private ResultSet rs;
	private DatabaseMetaData datosBBDD;
	private ResultSetModeloTabla modelo;
	private Statement st;
	
	
	public MarcoDatosBBDD() {
		setTitle("DAtos tablas BBDD");
		setBounds(300,300,800,400);
		BorderLayout milayout = new BorderLayout();
		setLayout(milayout);
		
		JPanel pnlNorte = new JPanel();
		
		nombreTablas = new JComboBox();
		
		
		
		//conexion
		
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/accesodatos","root","");
			
			datosBBDD = miConexion.getMetaData();
			rs = datosBBDD.getTables("accesodatos", null, null, null);
			
			while(rs.next()) {
				nombreTablas.addItem(rs.getString("TABLE_NAME"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		nombreTablas.addActionListener(new ActionListener() {

			JTable tabla = new JTable(modelo);
			JScrollPane scroll = new JScrollPane(tabla);
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String tablaSeleccionada = (String)nombreTablas.getSelectedItem();
				String sql = "SELECT * FROM " + tablaSeleccionada;
				
				try {
					st = miConexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
					rs = st.executeQuery(sql);
					
					
					modelo = new ResultSetModeloTabla(rs);
					tabla.setModel(modelo);
					
					
					
					add(scroll, BorderLayout.CENTER);
					validate(); //para que pinte la tabla
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		
		
		
		pnlNorte.add(nombreTablas);
		add(pnlNorte, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

class ResultSetModeloTabla extends AbstractTableModel{

	private ResultSet rsRegistros;
	private ResultSetMetaData rsMeta;
	
	public ResultSetModeloTabla(ResultSet rs) {
		this.rsRegistros=rs;
		
		try {
			this.rsMeta = rsRegistros.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {

		try {
			rsRegistros.last();
			return rsRegistros.getRow();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int getColumnCount() {
		
		try {
			return rsMeta.getColumnCount();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		try {
			rsRegistros.absolute(rowIndex+1);
			return rsRegistros.getObject(columnIndex+1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
