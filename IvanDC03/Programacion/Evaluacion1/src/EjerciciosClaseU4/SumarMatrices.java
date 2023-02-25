package EjerciciosClaseU4;

import java.util.Scanner;

public class SumarMatrices {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Indica la dimension del array");

		int dimension = sc.nextInt();

		int matriz1[][] = rellenaMatriz(dimension);

		int matriz2[][] = rellenaMatriz(dimension);

		int resultado[][] = sumaArrays(matriz1, matriz2);

		imprimeMatriz(matriz1);

		System.out.println("+");

		imprimeMatriz(matriz2);

		System.out.println("=");

		imprimeMatriz(resultado);

	}

	public static void imprimeMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) { // recorre filas

			for (int j = 0; j < matriz[i].length; j++) { // columnas

				System.out.printf("%-5d", matriz[i][j]);

			}

			System.out.println();

		}

	}

	public static int[][] sumaArrays(int matriz1[][], int matriz2[][]) {

		int resultado[][] = new int[matriz1.length][matriz1[0].length];

		for (int i = 0; i < matriz1.length; i++) {

			for (int j = 0; j < matriz1[i].length; j++) {

				resultado[i][j] = matriz1[i][j] + matriz2[i][j];

			}

		}

		return resultado;

	}

	public static int[][] rellenaMatriz(int dimension) {

		// MATRIZ 1

		int matriz1[][] = new int[dimension][dimension];

		for (int i = 0; i < matriz1.length; i++) {

			for (int j = 0; j < matriz1[i].length; j++) {

				System.out.println("Valor para coordenada [" + i + ", " + j + "]");

				matriz1[i][j] = sc.nextInt();

			}

		}

		return matriz1;

	}

}
