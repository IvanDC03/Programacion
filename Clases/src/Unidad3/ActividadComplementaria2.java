package Unidad3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActividadComplementaria2 {

	public static void main(String[] args) {
		int[] numeros = new int[100];
		Random r = new Random();

		for (int i = 0; i < numeros.length; i++) {
			int numero = r.nextInt(0, 21);
			numeros[i] = numero;
		}
		System.out.println(Arrays.toString(numeros));
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor: ");
		int num = sc.nextInt();
		System.out.println("Introduce un valor: ");
		int num2 = sc.nextInt();
		for (int i = 0; i < numeros.length; i++) {
			if (num == numeros[i]) {
				numeros[i] = num2;
			}
		}
		System.out.println(Arrays.toString(numeros));
	}

}
