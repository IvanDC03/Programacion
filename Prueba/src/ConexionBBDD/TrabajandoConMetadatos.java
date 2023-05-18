package ConexionBBDD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TrabajandoConMetadatos {

	public static void main(String args[]) {
		verInformacionBBDD();
	}
	
	static void verInformacionBBDD(){
		
		Connection miConexion =null;
		
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/accesodatos","root","");
			
			DatabaseMetaData datosBBDD = miConexion.getMetaData();
			
			//mostramos informacion de la base de datos
			System.out.println("Gestor de BBDD: " + datosBBDD.getDatabaseProductName());
			System.out.println("Version del gestor BBDD: " + datosBBDD.getDatabaseProductVersion());
			System.out.println("Driver: " + datosBBDD.getDriverVersion());
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
