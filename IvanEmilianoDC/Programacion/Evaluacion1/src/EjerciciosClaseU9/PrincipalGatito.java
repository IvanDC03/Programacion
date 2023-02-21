package EjerciciosClaseU9;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalGatito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Como se llama el gato?");
		String nombre = sc.next();
		System.out.println("¿De que color es el gato?");
		String color = sc.next();
		System.out.println("¿De que raza es el gato?");
		String raza = sc.next();
		System.out.println("¿Es macho o hembra?");
		String sexo = sc.next();
		System.out.println("¿Cuantos años tiene?");
		String edad = sc.next();
		System.out.println("¿Cuanto pesa el gato?");
		String peso = sc.next();
//Creamos un objeto de tipo gatito
		Gatito migato = new Gatito(nombre, color, raza, sexo, edad, peso, peso);
		System.out.println(migato.toString() + migato.toString());
		//migato.comer();
		// creamos un segundo gatito
		Gatito nuevoGatito = new Gatito("Misifu", "naranja", "angora", "hembra", 6, 7);
		// hacer un for para crear tres gatos y guardarlos en un array liat de gatitos
		int numeros[] = new int[3];
		for (int i = 0; i == 3;) {
			Gatito miGato = new Gatito(nombre, color, raza, sexo, edad, peso, peso);
			numeros[i] = sc.nextInt();
		}

	}

}
