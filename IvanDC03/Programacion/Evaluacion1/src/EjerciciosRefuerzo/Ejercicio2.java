package EjerciciosRefuerzo;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto vale a?: ");
		double a = sc.nextDouble();
		System.out.println("¿Cuanto vale b?: ");
		double b = sc.nextDouble();
		System.out.println(-b / a);
	}

}