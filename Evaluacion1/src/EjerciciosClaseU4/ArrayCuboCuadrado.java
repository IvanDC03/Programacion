package EjerciciosClaseU4;

public class ArrayCuboCuadrado {

	public static void main(String[] args) {

		int matrizNumerica[][] = new int[3][4];

		for (int i = 0; i < matrizNumerica.length; i++) { // filas

			for (int j = 0; j < matrizNumerica[i].length; j++) { // columnas

				matrizNumerica[0][j] = (int) (Math.random() * 10);

				matrizNumerica[1][j] = (int) (Math.pow(matrizNumerica[0][j], 2));

				matrizNumerica[2][j] = (int) (Math.pow(matrizNumerica[0][j], 3));

			}

			System.out.println();

		}

		imprimeMatriz(matrizNumerica);

	}

	public static void imprimeMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) { // recorre filas

			for (int j = 0; j < matriz[i].length; j++) { // columnas

				System.out.printf("%-5d", matriz[i][j]);

			}

			System.out.println();

		}

	}

}
