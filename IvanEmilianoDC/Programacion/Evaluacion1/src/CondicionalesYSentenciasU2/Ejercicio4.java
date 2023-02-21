package CondicionalesYSentenciasU2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Importe del prestamo: ");
		int importe = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Cantidad aportada: ");
		int aportada = sc.nextInt();
		int resultado = importe - aportada;
		System.out.printf("El resultado es: " + resultado);
	}

}
