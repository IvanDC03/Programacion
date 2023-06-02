package proyectoIntegrador2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TenisMain {

	public static void main(String[] args) {

		// EL MAIN INICIA LA INTERFAZ DE INICIO DONDE EL USUARIO PODRÁ ACCEDER A TOAS LAS FUNCIONALIDADES
		
		// UBICACIÓN DIRÁ A LO LARGO DE TODO EL PROGRAMA LA UBICACIÓN DE LA INTERFÁZ DONDE SE ENCUENTRE EL USUARIO

		ubicacion();

		// SE LLAMA A LA CLASE INTERFAZ INICIO
		
		try

		{

			InterfazInicio inicio = new InterfazInicio();

			inicio.setVisible(true);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void ubicacion() {

		System.out.println("Inicio del programa");

	}

}
