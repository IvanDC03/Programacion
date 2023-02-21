package EjerciciosClaseU2;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("De qué número quieres la tabla de multiplicar?");

		int n = sc.nextInt();

		System.out.println("TABLA DEL " + n);

		System.out.println("--------------");

		for (int i = 1; i <= 10; i++)

		{

			System.out.println(n + " * " + i + " = " + (n * i));

		}

	}

}
