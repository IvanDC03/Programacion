package EjerciciosClaseU4;

import java.util.Arrays;
import java.util.Scanner;

public class CopiaDeArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] aux = new int[numeros.length];

		System.out.println("Cuantos elementos a la derecha quiere desplazarse");

		int k = sc.nextInt();

		if (k > numeros.length)

			k = k % numeros.length;

		System.out.println("Numeros original: " + Arrays.toString(numeros));

		System.arraycopy(numeros, 0, aux, k, numeros.length - k);

		System.out.println("Array auxiliar: " + Arrays.toString(aux));

		System.arraycopy(numeros, numeros.length - k, numeros, 0, k);

		System.out.println("Array original primera parte: " + Arrays.toString(numeros));

		System.arraycopy(aux, k, numeros, k, numeros.length - k);

		System.out.println("Array final: " + Arrays.toString(numeros));

	}

}
