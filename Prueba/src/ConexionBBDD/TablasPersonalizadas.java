package ConexionBBDD;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TablasPersonalizadas {

	public static void main(String[] args) {
		MarcoTablaPersonalizada marco = new MarcoTablaPersonalizada();

	}

}

class MarcoTablaPersonalizada extends JFrame{
	
	public MarcoTablaPersonalizada() {
		
		setTitle("Tablas personalizadas");
		setBounds(300,300, 400,200);
		
		TableModel modelo = new ModeloTablaPersonalizada();
		JTable miTabla = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(miTabla);
		
		add(scroll);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class ModeloTablaPersonalizada extends AbstractTableModel{

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		int z = rowIndex +1;
		int y = columnIndex + 1;
		
		return " " + z + " " + y;
	}

	@Override
	public String getColumnName(int column) {
		
		String [] nombres = {"Nombre", "apellido", "edad"};
		
		
		return nombres[column];
	}
	

}
