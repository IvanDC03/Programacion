package Unidad2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*int numero = 8;
		System.out.println((numero % 2 == 0) ? "Es par": "Es impar");
		
		if(numero % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es ïmpar");
		}*/
		
		//---------
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int dia = sc.nextInt();
		
		if(dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miercoles");
		}else if(dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5) {
			System.out.println("Viernes");
		}else if(dia == 6) {
			System.out.println("Sabado");
		}else if(dia == 7) {
			System.out.println("Domingo");
		}else{
			System.out.println("Numero incorrecto");
		}
		
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero incorrecto");
			break;
		}
		
		
		int num = 20;
		
		num--;
		num++;
		num = num -1;
		num = num +1;
		num -= 1;
		num += 1;*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int numero = sc.nextInt();
		/*while (true) {
			System.out.println(numero + " ");
			numero--;
			if (numero==0) {
				break;
			}
		}*/
		
		/*while(numero > 0) {
			System.out.println(numero + " ");
			numero--;
		}*/
		/*while (numero-- > 0) {
			if (numero % 2 !=0) {
				continue;
			}
			System.out.println(numero + " ");
		}*/
		
		while (numero-- > 0) {
			if (numero % 2 ==0) {
				System.out.println(numero + " ");
			}
		}
		
	}

}
