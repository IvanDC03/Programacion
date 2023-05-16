package ConexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionPrueba {

	public static void main(String[] args) {
		//1. CREAMOS EL OBJETO CONNECTION

		try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/accesodatos","root","");

		//2. CREAMOS EL OBJETO STATEMENT

		Statement miStatement = miConexion.createStatement();

		//3. ejecutar la sentencia de inserción

		String sqlInsercion = "INSERT INTO alumno (id, nombre, apellido1, apellido2, dni) VALUES ('3323', 'Silvia', 'Orenes', 'Quinones', '23242342B')";

		//4. EJECUCTAR LA SENTENCIA SQL

		miStatement.executeUpdate(sqlInsercion);

		System.out.println("Datos insertados correctamente");

		//3. EJECUTAMOS SQL

		/*	ResultSet miResultset = miStatement.executeQuery("SELECT * FROM alumno");

		 //4. LEER EL RESULTSET

		 while(miResultset.next()) {

		 System.out.println(miResultset.getString("nombre") + " " +miResultset.getString("apellido1") );

		 }*/

		} catch (SQLException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		System.out.println("No se ha podido conectar con la BBDD");

		} catch (ClassNotFoundException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		}
	
}