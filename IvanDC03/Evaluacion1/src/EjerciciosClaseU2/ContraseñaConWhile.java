package EjerciciosClaseU2;

import java.util.Scanner;

public class ContraseñaConWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// DECLARAR VARIABLES/CONSTANTES

		final String contrasena = "Iván";

		String clave = "";

		int contador = 0;

		while (!clave.equals(contrasena) && contador < 3) // mientras el usuario

		// no acierte la contraseña entro en el bucle

		{

			if (contador == 0)

				System.out.println("Introduce tu contraseña");

			else

				System.out.println("Contraseña incorrecta. Vuelvela a introducir:");

			clave = sc.nextLine();

			contador++;

			System.out.println("Muy mal. Te quedan " + (3 - contador) + " intentos");

		}

		if (contador <= 3)

			System.out.println("Contraseña correcta");

		else

			System.out.println("Contraseña incorrecta");

	}

}
