package EjerciciosClaseU3;

import java.util.Scanner;

public class FuncionMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area = 0;

		double base = 0, altura = 0;

		int opcion = menu();

		switch (opcion) {

		case 1:

			System.out.println("Introduce el lado del cuadrado");

			double lado = sc.nextDouble();

			area = Math.pow(lado, 2);

			break;

		case 2:

			System.out.println("Introduce la base");

			base = sc.nextDouble();

			System.out.println("Introduce la altura");

			altura = sc.nextDouble();

			area = base * altura;

			break;

		case 3:

			System.out.println("Introduce la base");

			base = sc.nextDouble();

			System.out.println("Introduce la altura");

			altura = sc.nextDouble();

			area = (base * altura) / 2;

			break;

		case 4:

			System.out.println("Introduce el radio");

			double radio = sc.nextDouble();

			area = Math.PI * Math.pow(radio, 2);

			break;

		default:

			System.out.println("Eres tonto");

		}

		if (opcion >= 1 && opcion <= 4)

			System.out.println("El area de tu figura es: " + area);

		sc.close();

	}

	public static int menu() {

		System.out.println("  MENÚ  ");

		System.out.println("1. Cuadrado");

		System.out.println("2. Rectángulo");

		System.out.println("3. Triángulo");

		System.out.println("4. Círculo");

		System.out.println("Escoge una opción");

		Scanner sc = null;
		int opcion = sc.nextInt();

		return opcion;

	}

}
