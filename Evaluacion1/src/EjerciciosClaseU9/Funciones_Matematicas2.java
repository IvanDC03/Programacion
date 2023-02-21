package EjerciciosClaseU9;

import java.util.Scanner;

public class Funciones_Matematicas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

				
			System.out.println("Introduce un número");
			String num = sc.nextLine();
			
			Funciones_Matematicas miNumero = new Funciones_Matematicas(num);
			int opcion = 0;
			
			
			while(opcion!=5) {
				opcion = menu();
				
				switch(opcion) {
				case 1:
					System.out.println("El numero " + miNumero.getNumero() + 
							" es capicua? " + miNumero.esCapicua()) ;
					break;
				case 2:
					System.out.println("El numero " + miNumero.getNumero() + 
							" es primo? " + miNumero.esPrimo()) ;
					break;
				case 3:
					System.out.println("Introduce el exponente al que vas a elevar la base");
					int exp = sc.nextInt();
					System.out.println(miNumero.potencia(exp));
					break;
				case 4:
					System.out.println("El numero " + miNumero.getNumero() + 
							" tiene " + miNumero.digitos() + " digitos") ;
					break;
				case 5:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción incorrecta");
				}
			}
		

		}
		
		public static int menu() {
			System.out.println("1. Comprobar capicua");
			System.out.println("2. Comprobar primo");
			System.out.println("3. Calcular potencia");
			System.out.println("4. Contar digitos");
			System.out.println("5. Salir");
			System.out.println("Introduce la opcion");
			Scanner sc1 = null;
			int opcion = sc1.nextInt();
			return opcion;

	}

}
