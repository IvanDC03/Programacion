package EjerciciosClaseU5;

import java.util.Scanner;

public class CambiarVocalesAMayusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase");

		String frase = sc.nextLine();

		StringBuilder frase2 = new StringBuilder(frase);

		System.out.println(cambiaVocales(frase2));

	}

	public static StringBuilder cambiaVocales(StringBuilder frase) {

		// recorrer el StringBuilder letra a letra

		for (int i = 0; i < frase.length(); i++) {

			char letra = frase.charAt(i); // "hola que tal"

			if ("aeiou".contains(String.valueOf(letra))) {

				frase.setCharAt(i, Character.toUpperCase(letra));

			}

		}

		return frase;

	}



	}


