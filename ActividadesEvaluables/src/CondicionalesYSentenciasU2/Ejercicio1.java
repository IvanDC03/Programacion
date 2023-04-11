package CondicionalesYSentenciasU2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una hora (0-23): ");
		int hora = sc.nextInt();
		if (hora <= 12) {
			System.out.println("Buenos dias");
		}
		if (hora <= 20) {
			System.out.println("Buenas tardes");
		} else if (hora <= 23) {
			System.out.println("Buenas noches");
		}
		if (hora > 23) {
			System.out.println("Incorrecto");
		}
	}

}
