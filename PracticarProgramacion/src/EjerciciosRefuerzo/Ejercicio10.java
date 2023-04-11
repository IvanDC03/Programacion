package EjerciciosRefuerzo;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int sumar = 0;
		int dividir;
		int contador = 0;
		do {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			if (numero >= 0) {
				sumar += numero;
				contador++;
			}
		} while (numero >= 0);
		dividir = sumar / contador;
		System.out.println("El resultado es: " + dividir);
	}

}
