package Actividad;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Creacion del coche
		Coche damcar = new Coche(4, 60);
//Velocidad hasta 100 km/h
		int velocidad = 0;
		int mas = 0;
		while (velocidad < 100) {
			System.out.println("Velocidad hasta 100 km/h" + mas++);
		}
//Reduccion de combustible en 20 litros
		int combustible = 0;
		int menos = 0;
		while (combustible == 20) {
			System.out.println("Reducion de conbustible hasta 20 km/h" + menos--);
		}
//Frena hasta los 60 km/h
		int frena = 0;
		while (frena == 60) {
			System.out.println("Frena hasta 60 km/h" + menos--);
		}
//Consulta de lo que queda de combustible 
		int cantidad = 0;
		System.out.println("Introduce la cantidad de combustible" + cantidad);
		if (combustible == 0) {
			System.out.println("No hay gasolina");
		} else if (combustible == 1) {
			System.out.println("Tiene la mitad del combustible");
		} else if (combustible == 2) {
			System.out.println("Tiene todo el combustible");
		}
//Acelera hasta 90 km/h
		while (velocidad < 90) {
			System.out.println("Acelera hasta 90 km/h" + mas++);
		}
//Reduce su combustible en 10 litros
		while (combustible == 10) {
			System.out.println("Reduce conbustible en 10 litros" + menos--);
		}
//Frena hasta parar el coche
		while (frena == 0) {
			System.out.println("Esta parado");
		}
//Se intenta acelerar hasta 130km/h
		while (velocidad < 130) {
			System.out.println("Intento de acelerar hasta 130 km/h" + mas++);
		}
//Consulta de lo que queda de combustible
		System.out.println("Introduce la cantidad de combustible" + cantidad);
		if (combustible == 0) {
			System.out.println("No hay gasolina");
		} else if (combustible == 1) {
			System.out.println("Tiene la mitad del combustible");
		} else if (combustible == 2) {
			System.out.println("Tiene todo el combustible");
		}

	}

}
