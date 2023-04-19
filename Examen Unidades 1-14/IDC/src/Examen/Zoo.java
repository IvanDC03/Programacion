package Examen;

import java.util.ArrayList;

public class Zoo {
	static ArrayList<String> habitats = new ArrayList<>();
	static ArrayList<String> animales = new ArrayList<>();

	public static void main(String[] args) {
//Lista de habitats
		ArrayList<String> habitats = new ArrayList<>();
	}

//Metodos para agregar y eliminar habitats y animales
	public static void AgregarHabitats() {
		habitats.add("selva");
		habitats.add("rio");
		habitats.add("oceano");
		habitats.add("mar");
	}

	public static void EliminarHabitats() {
		habitats.clear();
	}

	public static void AgregarAnimales() {
		animales.add("hipopotamo");
		animales.add("ballena");
		animales.add("tiburon");
		animales.add("delfin");
	}

	public static void EliminarAnimales() {
		animales.clear();
	}
}
