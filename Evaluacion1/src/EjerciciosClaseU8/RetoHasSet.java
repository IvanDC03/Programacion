package EjerciciosClaseU8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetoHasSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String numero;

		Integer digito;

//creamos el hashmap

		HashMap<Integer, Integer> numeros = new HashMap<>();

		System.out.println("Introduce un numero");

		numero = sc.next();

//al ser un string puedo recorrer cada uno de los dígitos del string

		for (int i = 0; i < numero.length(); i++) { // 7896655

			digito = Character.getNumericValue(numero.charAt(i));

//comprobamos si el dígito está en el diccionario en las claves

			if (numeros.containsKey(digito))

				numeros.put(digito, numeros.get(digito) + 1);

			else

				numeros.put(digito, 1);

		}

//mostramos el mapa

		for (Map.Entry<Integer, Integer> n : numeros.entrySet()) {

			System.out.println(n.getKey() + " -> " + n.getValue());

		}

	}

}