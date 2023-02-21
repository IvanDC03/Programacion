package EjerciciosClaseU3;

public class ParesEImpares {

	public static void main(String[] args) {
		int numeros[] = new int[150];

		int contPares = 0, contImpares = 0;

		for (int i = 0; i < numeros.length; i++) {

			int aleatorio = (int) (Math.random() * 100);

			numeros[i] = aleatorio;

			if (aleatorio % 2 == 0) // si es par

				contPares++;

			else

				contImpares++;

			System.out.print(numeros[i] + " ");

		}

		// voy a crear los arrays para los pares y los impares

		int pares[] = new int[contPares];

		int impares[] = new int[contImpares];

		// voy a rellenar los arrays de pares e impares

		int j = 0, k = 0, suma = 0;

		for (int i = 0; i < numeros.length; i++) {

			suma += numeros[i]; // suma = suma + numeros[i]

			if (numeros[i] % 2 == 0) {

				pares[j] = numeros[i];

				j++;

			}

			else {

				impares[k] = numeros[i];

				k++;

			}

		}

		System.out.println();

		System.out.println("SUMA: " + suma);

		System.out.println("PARES: " + contPares);

		System.out.println("PARES: " + contImpares);

	}

}
