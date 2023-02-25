package EjerciciosClaseU7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumerosRepetidos {

	public static void main(String[] args) {
		ArrayList <Integer> repetidos = new ArrayList<>();

		//arraylist

		ArrayList<Integer> numeros = new ArrayList();

		//rellenamos el array con números aleatorios del 0 al 10

		for (int i = 0; i < 10; i++) {

		int aleatorio = (int)(Math.random()*11);

		numeros.add(aleatorio);

		}

		//Imprimimos el array

		System.out.println(numeros);

		//Mostramos los números que no están repetidos

		for (int i = 0; i < numeros.size(); i++) {

		for (int j = i+1; j < numeros.size(); j++) {

		if(numeros.get(i)==numeros.get(j))

		repetidos.add(numeros.get(i));

		}

		}

		numeros.removeAll(repetidos);

		System.out.println(numeros);

		}

		}