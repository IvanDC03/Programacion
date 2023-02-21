package EjerciciosClaseU7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PrimerTreeSet {

	public static void main(String[] args) {
		//creamos un treeset

		TreeSet<Integer> conjunto = new TreeSet<>();

		conjunto.add(8);

		conjunto.add(13);

		conjunto.add(5);

		conjunto.add(88);

		conjunto.add(22);

		conjunto.add(4);

		System.out.println("Nombres del conjunto: " + conjunto);

		//accedemos al primer elemento:

		Integer primero = conjunto.first();

		System.out.println("El primer elemento es " + primero);

		//accedemos al último elemento

		Integer ultimo = conjunto.last();

		System.out.println("El último elemento es " + ultimo);

		}

	}
