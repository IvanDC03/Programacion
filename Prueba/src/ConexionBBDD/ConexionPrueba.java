package ConexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionPrueba {

	public static void main(String[] args) {
		try {
			Connection miConexion = DriverManager.getConnection("");
			Statement miStatement = miConexion.createStatement();
			ResultSet miResulset = miStatement.executeQuery("Select * from alumno");
			while (miResulset.next()) {
				System.out.println(miResulset.getString("nombre") + "" + miResulset.getString("apellido1"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se ha podido conectar con la BBDD");
		}

	}

}
