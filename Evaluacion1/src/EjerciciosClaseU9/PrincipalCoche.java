package EjerciciosClaseU9;

import java.util.Scanner;

public class PrincipalCoche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Preguntamos al usuario por el color,la potencia,las puertas...
		System.out.println("De que color es tu ferrari?: ");
		String color = sc.next();
		
		
		Coche ferrari = new Coche(false, 2, "Rojo", 615);
		Coche fiesta = new Coche(false, 4, "Azul", 100);

		
		System.out.println("Mi coche es automatico? " + ferrari.isAutomatico());
		System.out.println("Tiene " + ferrari.getRuedas() + " ruedas");
		System.out.println("Es de color: " + ferrari.getColor());
		System.out.println("Tiene " + ferrari.getPuertas() + " puertas");
		ferrari.setColor("Negro");
		System.out.println("Es de color: " + ferrari.getColor());

		System.out.println("Mi coche es automatico? " + fiesta.isAutomatico());
		System.out.println("Tiene " + fiesta.getRuedas() + " ruedas");
		System.out.println("Es de color: " + fiesta.getColor());
		System.out.println("Tiene " + fiesta.getPuertas() + " puertas");
		fiesta.setColor("Negro");
		System.out.println("Es de color: " + fiesta.getColor());
	}

}
