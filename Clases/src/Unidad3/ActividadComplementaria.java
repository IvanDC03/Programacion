package Unidad3;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadComplementaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[15];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero: ");
			int numero = sc.nextInt();
			numeros[i] = numero;

		}
		int[] resultado = moverUnaPosicion(numeros);
		System.out.println(Arrays.toString(numeros));
		System.out.println();
		System.out.println(Arrays.toString(resultado));
	}

	public static int[] moverUnaPosicion(int[] numeros) {

		int[] resultado = new int[numeros.length];
		resultado[0] = numeros[numeros.length - 1];
		for (int i = 1; i < numeros.length; i++) {
			resultado[i] = numeros[i - 1];
		}
		return resultado;
	}

}
