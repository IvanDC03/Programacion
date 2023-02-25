package EjerciciosClaseU7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Correo {

	public static void main(String[] args) {
		String correosIniciales = "uno@hotmail.com;dos@gmail.com;tres@yahoo.es;cuatro@gmail.com;cinco@yahoo.com;seis@hotmail.com";

		String [] correos = correosIniciales.split(";");

		HashSet<String> dominios = new HashSet<String>();

		dominios = separarDominios(correos);

		mostrarDominios(dominios);

		}

		public static HashSet<String> separarDominios(String [] c) {

		String emailParts[];

		HashSet<String> dominios = new HashSet<String>();

		for (int i = 0; i < c.length; i++) {

		emailParts = c[i].split("@");

		if(emailParts.length==2)

		dominios.add(emailParts[1]);

		}

		return dominios;

		}

		public static void mostrarDominios(HashSet<String> dominios) {

		Iterator <String> it = dominios.iterator();

		while(it.hasNext()) {

		System.out.println(it.next());

		}

		}

		
	}
