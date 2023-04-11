package EjerciciosRefuerzo;

import java.util.Scanner;

public class Ejercicio5Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		System.out.println("La ultima cifra es: " + palabra.charAt(palabra.length() - 1));
	}
}
