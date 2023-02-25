package EjerciciosClaseU7;

import java.util.Iterator;
import java.util.TreeSet;

public class EjercicioTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer>claves =new TreeSet<Integer>();

		claves.clear();// Elimina todos los elementos. 

		/* ¿El árbol está vacío? */ 

		System.out.println(claves.isEmpty());// true 

		claves.add(100);// Ingresa 100 

		claves.add(10);// Ingresa 10 

		claves.add(50);// Ingresa 50 

		claves.add(1);// Ingresa 1 

		claves.add(13);// Ingresa 13

		System.out.println(claves);// Imprime [1, 10, 13, 50, 100] 

		claves.remove(10);// Elimina clave 10 

		System.out.println(claves);// Imprime [1, 13, 50, 100] 

		System.out.println(claves.contains(50));// Imprime true 

		System.out.println(claves.headSet(50));// claves < 50, Salida [1, 13] 

		System.out.println(claves.tailSet(50));// claves >= 50, Salida [50, 100] 

		// Muestra todos los elementos 

		Iterator<Integer>it =claves.iterator();

		while(it.hasNext()) {

		System.out.println(it.next());

		}

		}
	
	}
