package EjerciciosClaseU4;

import java.util.Scanner;

public class Excel {

	static int fila;
	static int columna;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[][] = new int [4][5];

		//LEO LOS DATOS POR TECLADO

		System.out.println("Introduzca los valores del array");

		for(fila=0;fila<num.length;fila++) {

		for(columna=0;columna<num[0].length;columna++) {

		System.out.println("Fila " + fila + " , columna " + columna + ": ");

		num[fila][columna]=sc.nextInt();

		}

		}

		sumaFilas(num);

		sumaColumnas(num);

		System.out.println();

		}

		public static void sumaFilas(int array[][]) {

		//mostrar los datos y las sumas parciales de las filas

		int sumaFila;

		for(fila=0;fila<array.length;fila++) {

		sumaFila=0;

		for(columna=0;columna<array[fila].length;columna++) {

		System.out.printf("%7d ", array[fila][columna]);

		sumaFila+=array[fila][columna];

		}

		System.out.printf("%7d\n",sumaFila);

		}

		}

		public static void sumaColumnas(int array[][]) {

		//mostrar las sumas parciales de las columnas

		for(columna=0;columna<array[0].length;columna++) {

		System.out.print("---------");

		}

		System.out.println("------------------");

		int sumaColumna;

		int sumaTotal = 0;

		for(columna=0;columna<array[0].length;columna++) {

		sumaColumna=0;

		for(fila=0;fila<array.length;fila++) {

		sumaColumna +=array[fila][columna];

		}

		sumaTotal += sumaColumna;

		System.out.printf("%7d ",sumaColumna);

		}

		System.out.printf("%7d ",sumaTotal);

		}

	}