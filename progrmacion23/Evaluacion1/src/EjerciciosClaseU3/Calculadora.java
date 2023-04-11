package EjerciciosClaseU3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos elementos quieres en el array");

		int num = sc.nextInt();

		int array[] = rellenaArray(num);

		String op = menu();

		int resultado = Calculadora(array, op);

		System.out.println("El resultado es: " + resultado);

	}

	public static int Calculadora(int[] a, String operacion) {

		int resultado = 0;

		switch (operacion.toLowerCase()) {

		case "sumar":

			for (int i = 0; i < a.length; i++)

			{

				resultado = resultado + a[i];

			}

			break;

		case "restar":

			for (int i = 0; i < a.length; i++)

			{

				resultado = resultado - a[i];

			}

			break;

		case "contar":

			for (int i = 0; i < a.length; i++)

			{

				if (a[i] % 2 == 0)

					resultado++;

			}

			break;

		case "multiplicar":

			resultado = 1;

			for (int i = 0; i < a.length; i++)

			{

				resultado = resultado * a[i];

			}

			break;

		default:

			System.out.println("Eres tonto");

		}

		return resultado;

	}

	public static String menu() {

		System.out.println("Sumar");

		System.out.println("Restar");

		System.out.println("Contar");

		System.out.println("Multiplicar");

		System.out.println("Escoge una opcion");

		Scanner sc = null;
		String opcion = sc.nextLine();

		Scanner sc1 = null;
		if (opcion.isEmpty())

			opcion = sc1.nextLine();

		return opcion;

	}

	public static int[] rellenaArray(int num) {

		int array[] = new int[num];

		for (int i = 0; i < array.length; i++)

		{
			array[i] = (int) (Math.random() * 100);
		}
		return array;

	}

	public int divide() {
		// TODO Auto-generated method stub
		return 0;
	}
}
