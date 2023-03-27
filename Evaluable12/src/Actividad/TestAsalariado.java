package Actividad;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAsalariado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Trabajador distribucion
		TrabajadorDistribucion trabajador1 = new TrabajadorDistribucion(null);
		TrabajadorProduccion trabajador2 = new TrabajadorProduccion(null, null, null);
//Turnos
		ArrayList<String> turnos = new ArrayList<>();
		turnos.add("Mañana");
		turnos.add("Tarde");
		turnos.add("Noche");
//nombres
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("José");
		nombres.add("Francisco");
//dni
		ArrayList<String> dni = new ArrayList<>();
		dni.add("47854216V");
		dni.add("21549638F");
		System.out.println(turnos.toString());
		System.out.println(nombres.toString());
		System.out.println(dni.toString());
	}

}
