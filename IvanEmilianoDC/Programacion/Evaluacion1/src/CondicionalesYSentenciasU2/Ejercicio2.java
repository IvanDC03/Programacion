package CondicionalesYSentenciasU2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero (1-1000000): ");
		int numero = sc.nextInt();
		int digitos;
		int cantidad = numero;
		int digitos1 = numero / cantidad;
		while (numero>=10) {
			System.out.println(numero/10);
			System.out.println("EL numero tiene: " + digitos1 + " " + "digitos");
		break;
		}
		
	}

}
