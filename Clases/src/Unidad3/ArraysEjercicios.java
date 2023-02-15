package Unidad3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEjercicios {

	public static void main(String[] args) {
int numeros [] = new int [5];
Scanner sc = new Scanner(System.in);
/*for (int i = 0; i < numeros.length; i++) {
	System.out.println("Introduce un numero: ");
	int numero = sc.nextInt();
	numeros[i] = numero;
}
// 1,3,5,6,7
// 7,1,3,5,6
int num = -1;
for(int i = numeros.length-1; i >= 0; i--) {
	if(i == numeros.length-1 ) {
		num = numeros[i]; //7
	}
	if(i > 0) {
		numeros[i] = numeros[i-1];
	}else {
		numeros[i] = num;
	}
}
for (int i = 0; i < numeros.length; i++) {
	System.out.println(numeros[i]);
}*/

////////////////////////
int[] semana = {12, 4, 67};

/*for(int i = 0 ;i < semana.length; i++) {
	System.out.println(semana[i]);
}*/

for(int dia : semana) {
	System.out.println(dia);
}
Arrays.sort(semana);
System.out.println(Arrays.toString(semana));

int posicion = Arrays.binarySearch(semana,2);
int pos = -1;

for(int i = 0 ;i < semana.length; i++) {
	if(semana[i] == 2) {
		pos = i;
	}
}
System.out.println(posicion);
System.out.println(pos);


	}

}
