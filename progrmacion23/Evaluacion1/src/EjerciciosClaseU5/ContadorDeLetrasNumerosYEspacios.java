package EjerciciosClaseU5;

import java.util.Scanner;

public class ContadorDeLetrasNumerosYEspacios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = sc.nextLine();

		conteo(frase);

		}

		public static void conteo(String frase) {

		int numDigitos=0;

		int numLetras=0;

		int numEspacios = 0;

		for(int i=0;i<frase.length();i++) {

		char letra = frase.charAt(i);

		if(Character.isDigit(letra))

		numDigitos++;

		else if (Character.isLetter(letra))

		numLetras++;

		else if (Character.isWhitespace(letra))

		numEspacios++;

		}

		System.out.println("Numeros: " + numDigitos);

		System.out.println("Letras: " + numLetras);

		System.out.println("Espacios: " + numEspacios);

		}

	}
