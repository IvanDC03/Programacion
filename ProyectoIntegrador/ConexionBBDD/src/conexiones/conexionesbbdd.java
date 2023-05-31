package conexiones;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;



public class conexionesbbdd {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver"; 
	private static final String URL = "jdbc:mysql://localhost:3306/bd_login\",\"root\",\"mysql";
	private static final String USUARIO = "root";
	private static final String CLAVE = "mysql";
	
	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	
	public Connection Conectar() {
		Connection conexion = null;
		try {
			
			DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conexion Establecida");
		} catch (SQLException e) {
			
			System.out.println("Error de conexion ");
			e.printStackTrace();
		}
		return conexion;
	}
public static void main(String[] args) {


}
}
