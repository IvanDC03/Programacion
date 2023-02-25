package EjerciciosClaseU3;

import java.util.Scanner;

public class MayorYMenor {

	public static void main(String[] args) {
		int mayor = Integer.MIN_VALUE; //mayor es el número más pequeño

		int menor = Integer.MAX_VALUE; //menor es el número mayor

		int n;

		int numeros [];

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos elementos tiene el array?");

		n = sc.nextInt();

		numeros = new int[n];

		//rellenamos el array con números aleatorios

		for(int i=0;i<n;i++) {

		numeros[i]=(int)(Math.random()*10000);

		System.out.print(numeros[i]+" ");

		}

		//hallo el número mayor y el menor

		for(int j=0;j<n;j++) {

		if(mayor<numeros[j])

		mayor=numeros[j];

		if(menor>numeros[j])

		menor=numeros[j];

		}

		System.out.println();

		System.out.println("NÚMERO MAYOR = " + mayor);

		System.out.println("NÚMERO MENOR = " + menor);

		}

	}


