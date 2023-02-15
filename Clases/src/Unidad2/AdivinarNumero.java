package Unidad2;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		int numeroAleatorio = (int)(Math.random()*10);
		System.out.println(numeroAleatorio);
		Scanner sc = new Scanner(System.in);
		int numero = -1;
		int maxIntentos = 3;
		int intentos = 0;
		/*do {
			System.out.println("Introduce un numero (0-10): ");
			numero = sc.nextInt();
			intentos ++;
		} while (numero != numeroAleatorio && intentos < maxIntentos);
		*/
		
		/*for (int i = 1; i <= maxIntentos && numero != numeroAleatorio ; i++) {
			System.out.println("Introduce un numero (0-10): ");
			numero = sc.nextInt();
		}*/
		
		/*while (numero != numeroAleatorio && intentos < maxIntentos) {
			System.out.println("Introduce un numero (0-10): ");
			numero = sc.nextInt();
			intentos ++;
		}*/
		
		if(numero == numeroAleatorio) {
			System.out.println("Enhorabuena has ganado");
		}else {
			System.out.println("Intentos maximos alcanzados");
		}
		
		
	}

}
