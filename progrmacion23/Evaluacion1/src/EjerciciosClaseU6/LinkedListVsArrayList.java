package EjerciciosClaseU6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		List<String> listaArray = (List<String>) new ArrayList();

		List<String> listalinked = new LinkedList<String>();

		long tiempo;

		for (int i = 0; i < 10000; i++) {

		listaArray.add("Palabra " + i); 

		listalinked.add("Palabra " + i);

		}

		System.out.println("Tiempo invertido en insertar un String en listaarray (en nanosegundos):");

		tiempo = System.nanoTime();

		listaArray.add(0, "Nueva palabra");

		System.out.println(System.nanoTime() - tiempo);

		System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");

		tiempo = System.nanoTime();

		listalinked.add(0, "Nueva palabra"); 

		System.out.println(System.nanoTime() - tiempo);

		}

	}