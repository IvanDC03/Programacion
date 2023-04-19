package Examen;

import java.util.Scanner;

public class Zoologico {

	public static void main(String[] args) {
//Creacion de menu
		Scanner sc = new Scanner(System.in);
		// Menu para ver las opciones
		System.out.println("****Menu****");
		System.out.println("1.Agregar y eliminar animales del zoologico");
		System.out.println("2.Agregar y eliminar habitats del zoologico");
		System.out.println("3.Agregar y eliminar cuidadores del zoologico");
		System.out.println("4.Asignar animales a habitats especificos");
		System.out.println("5.Asignar cuidadores a animales especificos");
		System.out.println("6.Mostrar informacion detallada de cada animal,habitat y cuidador");
		System.out.println("7.Mostrar los animales del zoo ordenados por edad");
		System.out.println("8.Salir");
		System.out.println("****Fin Menu****");
		// Menu usable
		System.out.println("****Menu****");
		System.out.println("1.Agregar y eliminar animales del zoologico");
		String animales = sc.nextLine();
		System.out.println("2.Agregar y eliminar habitats del zoologico");
		String habitats = sc.nextLine();
		System.out.println("3.Agregar y eliminar cuidadores del zoologico");
		String cuidadores = sc.nextLine();
		System.out.println("4.Asignar animales a habitats especificos");
		String asignarAnimales = sc.nextLine();
		System.out.println("5.Asignar cuidadores a animales especificos");
		String asignarCuidadores = sc.nextLine();
		System.out.println("6.Mostrar informacion detallada de cada animal,habitat y cuidador");
		String mostrarInformacion = sc.nextLine();
		System.out.println("7.Mostrar los animales del zoo ordenados por edad");
		String mostrarAnimales = sc.nextLine();
		System.out.println("8.Salir");
		String salir = sc.nextLine();
		System.out.println("****Fin Menu****");
	}

//Metodos para que funcione el menu
	public static void animales(int agregar, int eliminar, int animal) {
		if (animal == agregar) {
			agregar++;
		} else {
			eliminar--;
		}
	}

	public static void habitats(int agregar, int eliminar, int habitats) {
		if (habitats == agregar) {
			agregar++;
		} else {
			eliminar--;
		}
	}

	public static void cuidadores(int agregar, int eliminar, int cuidadores) {
		if (cuidadores == agregar) {
			agregar++;
		} else {
			eliminar--;
		}
	}

	public static void AsignarAnimales(String animal, String especie) {
		if (animal == especie) {
			System.out.println("Su asignacion es" + especie);
		}
	}

	public static void AsignarCuidadores(String cuidador, String animal) {
		if (cuidador == animal) {
			System.out.println("Su asignacion es" + animal);
		}
	}

	public static void mostrarInformacion(String animal, String habitat, String cuidador) {
		System.out.println("Informacion detallada de animal" + animal);
		System.out.println("Informacion detallada del habitat" + habitat);
		System.out.println("Informacion detallada del cuidador" + cuidador);
	}

	public static void mostrarAnimales() {
		int edadAnimales[] = new int[100];
		System.out.println("Animales ordenados por edad" + edadAnimales.toString());
	}

	public static void salir(int opcion, String salir) {
		if (opcion == 8) {
			System.out.println("Salir" + salir);
		}
	}
}
