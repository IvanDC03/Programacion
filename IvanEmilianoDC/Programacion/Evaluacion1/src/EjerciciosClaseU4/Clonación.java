package EjerciciosClaseU4;

import java.util.Arrays;

public class Clonación {

	public static void main(String[] args) {
		int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };

		int[] copia = new int[primos.length];

		int[] clonado = new int[primos.length];

		// 1. EN COPIA COPIAMOS EL ARRAY PRIMOS

		// System.arraycopy(primos, 0, copia, 0, primos.length);

		copia = primos;

		// 2. EN CLONADO CLONAMOS EL ARRAY PRIMOS

		clonado = primos.clone();

		// 3. MOSTTRAMOS LOS ARRAYS POR CONSOLA

		System.out.println("PRIMOS: " + Arrays.toString(primos));

		System.out.println("COPIA: " + Arrays.toString(copia));

		System.out.println("CLONADO: " + Arrays.toString(clonado));

		// 4. CAMBIAMOS UN ELEMENTO DE CLONADO

		clonado[3] = 100;

		System.out.println("DESPUES DE CAMBIAR CLONADO");

		System.out.println("PRIMOS: " + Arrays.toString(primos));

		System.out.println("CLONADO: " + Arrays.toString(clonado));

		// 5. CAMBIAMOS UN ELEMENTO DE COPIA

		copia[3] = 300;

		System.out.println("DESPUES DE CAMBIAR COPIA");

		System.out.println("PRIMOS: " + Arrays.toString(primos));

		System.out.println("COPIA: " + Arrays.toString(copia));

		// 5. CAMBIAMOS UN ELEMENTO DE PRIMOS

		primos[5] = 500;

		System.out.println("DESPUES DE CAMBIAR primos");

		System.out.println("PRIMOS: " + Arrays.toString(primos));

		System.out.println("COPIA: " + Arrays.toString(copia));

		System.out.println("CLONADO: " + Arrays.toString(clonado));

	}
}
