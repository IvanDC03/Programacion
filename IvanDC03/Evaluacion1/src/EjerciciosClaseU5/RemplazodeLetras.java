package EjerciciosClaseU5;

import java.util.Scanner;

public class RemplazodeLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce algo");

		String palabra = sc.next();

		if(palabra.contains("%20") || palabra.contains("%3A") 

		|| palabra.contains("%3D"))

		{

		palabra = palabra.replace("%20", " ");

		palabra = palabra.replace("%3D", ".");

		palabra = palabra.replace("%3A", "?");

		}

		System.out.println(palabra);

		System.out.println((int)'a');

		}

	}