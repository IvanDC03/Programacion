package EjerciciosClaseU14;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		try {
			dividir();

		} catch (ArithmeticException e) {
			System.out.println("Error, has dividido entre 0");
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Hola estoy despuÃ©s del error");
		}

	}

	private static void dividir() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, resultado;

		System.out.println("Introduce el primer valor:");
		valor1 = sc.nextInt();
		System.out.println("Introduce el segundo valor:");
		valor2 = sc.nextInt();

		resultado = valor1 / valor2;

		System.out.println("Resultado de " + valor1 + "/" + valor2 + " : " + resultado);

	}

}
