package EjerciciosClaseU3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la primera palabra");

		String palabra1 = sc.next();

		System.out.println("Introduce la segunda palabra");

		String palabra2 = sc.next();

		char[] arrayPalabra1 = ordenaArray(palabra1);

		char[] arrayPalabra2 = ordenaArray(palabra2);

		/*
		 * if (sonIguales(arrayPalabra1, arrayPalabra2)) {
		 * 
		 * System.out.println("Es un anagrama");
		 * 
		 * }
		 * 
		 * else
		 * 
		 * System.out.println("No es un anagrama");
		 */

		System.out.println(sonIguales(arrayPalabra1,

				arrayPalabra2) ? "Es anagrama" : "No es anagrama");

	}

	public static char[] ordenaArray(String palabra) {

		char[] array = palabra.toCharArray();

		Arrays.sort(array);

		return array;

	}

	public static boolean sonIguales(char[] array1, char[] array2) {

		return Arrays.equals(array1, array2);

	}
}
