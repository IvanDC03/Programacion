package EjerciciosRefuerzo;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura: ");
		double altura = sc.nextDouble();
		while (altura == 0) {
			System.out.println("Introduce otro valor");
		}
		double g = 9.81;
		double operacion = Math.sqrt(2 * altura / 9.81);
		System.out.println(operacion);
	}
}