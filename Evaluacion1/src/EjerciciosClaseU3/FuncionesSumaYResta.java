package EjerciciosClaseU3;

import java.util.Scanner;

public class FuncionesSumaYResta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero");

		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo numero");

		int num2 = sc.nextInt();

		int resultadoSuma = suma(num1, num2, 7);

		double resultadoResta = resta(5.5, num2);

		System.out.println("la suma es " + resultadoSuma);

		System.out.println("la resta es " + resultadoResta);

	}

	public static int suma(int a, int b, int c) {

		int resultado = a + b + c;

		return resultado;

	}

	// CREA UNA FUNCIÓN QUE HAGA LA RESTA DE DOS DOUBLE

	public static double resta(double x, double y) {

		return x - y;

	}

}
