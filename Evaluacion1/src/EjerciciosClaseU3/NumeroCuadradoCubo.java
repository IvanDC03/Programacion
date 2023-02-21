package EjerciciosClaseU3;

public class NumeroCuadradoCubo {

	public static void main(String[] args) {
		int numero[] = new int[20];

		int cuadrado[] = new int[20];

		int cubo[] = new int[20];

		System.out.printf("%-20s %-20s %-20s", "NUMERO", "CUADRADO", "CUBO");

		for (int i = 0; i < numero.length; i++)

		{

			numero[i] = (int) (Math.random() * 100);

			cuadrado[i] = (int) (Math.pow(numero[i], 2));

			cubo[i] = (int) (Math.pow(numero[i], 3));

			System.out.printf("\n%-20d %-20d %-20d", numero[i], cuadrado[i], cubo[i]);

		}

	}

}
