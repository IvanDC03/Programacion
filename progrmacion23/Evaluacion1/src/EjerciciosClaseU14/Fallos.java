package EjerciciosClaseU14;

import java.util.Scanner;

public class Fallos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int[] numeros = new int[5];

			numeros[0] = 5;
			numeros[1] = 15;
			numeros[2] = 53;
			numeros[3] = 22;
			numeros[4] = 3;
			numeros[5] = 54;

			for (int i = 0; i < 5; i++) {
				System.out.println("PosiciÃ³n: " + i + " valor: " + numeros[i]);
			}

			System.out.println("Que edad tienes?");
			int edad = sc.nextInt();
			System.out.println("Tienes " + edad + " aÃ±os");
		}

		catch (Exception e) {
			System.out.println("Ha habido una excepciÃ³n");
			e.printStackTrace();
		}

		/*
		 * catch(InputMismatchException e1) {
		 * System.out.println("Has introducido letras"); e1.printStackTrace(); }
		 */

		System.out.println("estoy despues de los catch");

	}

}
