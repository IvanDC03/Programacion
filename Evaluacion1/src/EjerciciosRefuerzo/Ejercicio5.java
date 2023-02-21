package EjerciciosRefuerzo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		System.out.println("La ultima cifra es: " + numero % 10);
		
	}
}
