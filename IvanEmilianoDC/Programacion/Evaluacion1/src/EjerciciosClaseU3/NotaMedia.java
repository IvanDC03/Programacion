package EjerciciosClaseU3;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas notas vas a meter?");

		int numNotas = sc.nextInt();

		double notas[] = new double[numNotas];

		double media = 0;

		// rellenamos el array con las notas que diga el usuario

		for (int i = 0; i < notas.length; i++)

		{

			System.out.println("Introduce la nota " + (i + 1) + ":");

			notas[i] = sc.nextDouble();

			while (notas[i] < 0) {

				System.out.println("Nota incorrecta. Vuelvela a introducir");

				notas[i] = sc.nextDouble();

			}

			media = notas[i] + media;

		}

		media = media / numNotas;

		System.out.printf("Tu nota media es %.2f", media);

	}

}
