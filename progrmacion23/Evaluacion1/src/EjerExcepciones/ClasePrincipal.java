package EjerExcepciones;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****** PROGRAMA EXCEPCIONES ******");
		System.out.println("1.Introducir nombre: ");
		String nombre = sc.nextLine();
		System.out.println("2.Introducir DNI sin letra: ");
		int DNI = sc.nextInt();
		System.out.println("3.Introducir edad: ");
		int edad = sc.nextInt();
		int años = 2023;
		int añoDeNacimiento = años - edad;
		System.out.println("4.El año de naciemto es: " + añoDeNacimiento);

	}

}
