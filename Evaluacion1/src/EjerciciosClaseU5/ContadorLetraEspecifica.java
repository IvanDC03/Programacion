package EjerciciosClaseU5;

import java.util.Scanner;

public class ContadorLetraEspecifica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();

		System.out.println("Escribe una frase");

		String frase = sc.nextLine();

		System.out.println("Escribe una letra");

		char letra = sc.next().charAt(0);

		System.out.println("La letra " + letra + " se repite " + conteoLetra(frase, letra) + " veces.");

		}

		public static int conteoLetra(String frase, char letra) {

		int contador = 0;
		
		for (char l : frase.toCharArray()) {

		if(l == letra)

		contador++;

		}

		return contador;

		}

	}