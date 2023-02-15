package Unidad3;

import java.util.Arrays;

public class Actividad2 {

	public static void main(String[] args) {
		Math.random();
		int[] arrNum = new int[5];
		System.out.println(Arrays.toString(arrNum));
		generarArrayEntero(arrNum);
		
		System.out.println(Arrays.toString(arrNum));
		System.out.println(sumaArray(arrNum));
	}
public static void generarArrayEntero(int[]arrayNumeros){
	for (int i = 0; i < arrayNumeros.length; i++) {
		arrayNumeros[i] = (int) (Math.random() * 10);
	}
}
public static int sumaArray(int[]arraySuma) {
	int total = 0;
	for (int i = 0; i < arraySuma.length; i++) {
		total = total + arraySuma[i];
	}
	return total;
	
}

}