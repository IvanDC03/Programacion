package EjerciciosRefuerzo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce un numero: ");
			numero[i] = sc.nextInt();
		}
		Arrays.sort(numero);
		System.out.println(Arrays.toString(numero));
	}

}
