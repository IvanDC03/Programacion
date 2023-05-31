package ProyectoIntegrador;

import java.sql.*;

public class BBDD {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");

           
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectointegradortenis", "root", "");

            DatabaseMetaData datosBBDD = miConexion.getMetaData();
            ResultSet rs = datosBBDD.getTables("proyectointegradortenis", null, null, null);

            System.out.println("Conexión realizada a la base de datos con éxito.");

            
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
    }
}

