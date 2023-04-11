package EjerciciosClaseU7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersecciones {

	public static void main(String[] args) {
		//1ª OPCIÓN. ARRAYS

		String conjuntoA [] = {"Luis", "Inés", "Ana", "Beto"};

		String conjuntoB [] = {"Pedro", "Ana", "Beto"};

		for (int i = 0; i < conjuntoA.length; i++) {

		for (int j = 0; j < conjuntoB.length; j++) {

		if(conjuntoA[i].equals(conjuntoB[j]))

		System.out.println(conjuntoA[i]);

		}

		}

		//2ª OPCIÓN CON LISTAS Y UN SOLO FOR

		List<String> conjuntoC = Arrays.asList(conjuntoA);

		List<String> conjuntoD = Arrays.asList(conjuntoB);

		ArrayList<String> resultado = new ArrayList<String>();

		for (int i = 0; i < conjuntoD.size(); i++) {

		if(conjuntoC.contains(conjuntoD.get(i)))

		resultado.add(conjuntoD.get(i));

		}

		System.out.println(resultado);

		}
	
		}