package CondicionalesYSentenciasU2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayor = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Introduce un numero: ");
			System.out.println();
			int numero = sc.nextInt();
			if (mayor >= numero) {
				System.out.println("El numero mayor es: " + numero);
			}
		}
	}

}
