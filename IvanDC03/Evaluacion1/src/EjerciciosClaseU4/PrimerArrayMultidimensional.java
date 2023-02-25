package EjerciciosClaseU4;

import java.util.Arrays;

public class PrimerArrayMultidimensional {

	public static void main(String[] args) {
		// ventas de 5 comerciales en 10 ciudades diferentes

		// int [][] ventas = new int[10][5];

		// ventas de 5 comerciales en 10 ciudades diferentes

		// int [][][] ventas = new int[20][10][5]; //años, ciudades, comerciales

		// ventas[19][1][1]=5000;

		// ventas[19][1][2]=3000;

		// crear matriz de 4X3 de enteros

		int matriz[][] = new int[4][3];

		matriz[0][0] = 15;

		matriz[0][1] = 99;

		matriz[0][2] = 34;

		matriz[1][0] = 23;

		matriz[1][1] = 54;

		matriz[1][2] = 87;

		matriz[2][0] = 87;

		matriz[2][1] = 56;

		matriz[2][2] = 11;

		matriz[3][0] = 13;

		matriz[3][1] = 3;

		matriz[3][2] = 6;

		int matriz2[][] = {

				{ 1, 2, 3, 8 },

				{ 8, 7, 5, 4 },

				{ 3, 87, 98, 72 },

		};

		int matriz3[][] = new int[4][];

		matriz3[0] = new int[4];

		matriz3[1] = new int[2];

		matriz3[2] = new int[3];

		matriz3[3] = new int[1];

		int matriz4[][] = {

				{ 1, 2, 3, 4 },

				{ 5, 6 },

				{ 10, 11, 12 },

				{ 3 }

		};

		int matriz5[][] = {

				{ 1, 3, 5, 7 },

				{ 5, 4, 1, 16 },

				{ 7, 9, 61, 13 }

		};

		// for(int i=0; i<matriz5.length;i++)

		// System.out.println(Arrays.toString(matriz5[i]));

		int ejemplo[][] = {

				{ 10, 9, 8 },

				{ 3, 4 },

				{ 1 },

				{ 5, 4, 3, 7 }

		};

		for (int i = 0; i < ejemplo.length; i++) // filas

			System.out.println(Arrays.toString(ejemplo[i]));

		for (int i = 0; i < ejemplo.length; i++)

		{

			System.out.println("La fila " + (i + 1) + " tiene " + ejemplo[i].length + " columnas");

		}

	}

}
