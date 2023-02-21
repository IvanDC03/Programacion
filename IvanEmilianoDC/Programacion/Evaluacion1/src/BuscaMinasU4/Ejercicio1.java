package BuscaMinasU4;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] tablero = new String[5][5];
		cargarTablero(tablero);
		
		System.out.println("Introduzca la fila a comprobar:");
		int fila = sc.nextInt();
		System.out.println("Introduzca la columna a comprobar:");
		int columna = sc.nextInt();
		
		int bombas = contarBombas(tablero, fila, columna);
		System.out.println(bombas);
	}
	
	public static int contarBombas(String [][] tablero, int fila, int columna) {
		int contador = 0;
		//Calculo límites de filas y columnas
		int inicioFila = fila - 1;
		int limiteFila = fila + 1;
		if(inicioFila < 0) {
			inicioFila = 0;
		}
		if(limiteFila > 4) {
			limiteFila = 4;
		}
		int inicioColumna = columna - 1;
		int limiteColumna = columna + 1;
		if(inicioColumna < 0) {
			inicioColumna = 0;
		}
		if(limiteColumna > 4) {
			limiteColumna = 4;
		}
		for(int i = inicioFila; i <= limiteFila; i++ ) {
			for(int x = inicioColumna; x <= limiteColumna; x++ ) {
				if(tablero[i][x].equals("*")) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	public static void cargarTablero(String[][] tablero) {
		String valor = "";
		for(int i = 0; i < tablero.length; i++) {
			for(int x = 0; x < tablero[i].length; x++) {
				System.out.println("Introduzca coordenada (" + i + ", " + x + "):");
				valor = sc.next();
				tablero[i][x] = valor;
			}
		}
	}

}		