package ArraysU3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		int[] notas;
		notas = new int[1];
		int nota = sc.nextInt();
		int notamasalta = 8;
		int notamasbaja = 7;
		int diferencia = notamasalta - notamasbaja;
		while (nota >= 0) {
			System.out.println(diferencia);
			break;
		}
	}
}
