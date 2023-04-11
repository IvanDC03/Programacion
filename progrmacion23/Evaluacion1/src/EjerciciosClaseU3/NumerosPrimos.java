package EjerciciosClaseU3;

public class NumerosPrimos {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

	// funcion que me diga si un número es o no primo

	public static boolean esPrimo(int n) {

		for (int i = 2; i < n - 1; i++)

		{

			if (n % i == 0)

				return false;

		}

		return true;

	}

	// función para rellenar un array de numeros primos

	public static int[] rellenarArrayPrimos() {

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {

			int aleatorio = (int) (Math.random() * 1000);

			while (esPrimo(aleatorio) == false) {

				aleatorio = (int) (Math.random() * 1000);

			}

			array[i] = aleatorio;

		}

		return array;

	}

}
