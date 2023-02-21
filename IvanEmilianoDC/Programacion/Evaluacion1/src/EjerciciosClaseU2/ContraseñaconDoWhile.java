package EjerciciosClaseU2;

import java.util.Scanner;

public class ContraseñaconDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// DECLARAR VARIABLES/CONSTANTES

		final String contrasena = "Iván";

		String clave = "";

		int contador = 0;

		do {

			System.out.println("Introduce la contraseña");

			clave = sc.nextLine();

			contador++;

		} while (!clave.equals(contrasena) && contador < 3);

		if (contador <= 3)

			System.out.println("Contraseña correcta");

		else

			System.out.println("Contraseña incorrecta");
	}

}
