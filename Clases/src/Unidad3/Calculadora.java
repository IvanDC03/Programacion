package Unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		menu();
	}
    public static void menu() {
    	Scanner sc = new Scanner(System.in);
    	int numero = 0;
    	do {
	    	System.out.println("------MENU------");
	    	System.out.println("1.Suma");
	    	System.out.println("2.Resta");
	    	System.out.println("3.Division");
	    	System.out.println("4.Multiplicacion");
	    	System.out.println("Introduce una opcion: ");
	    	numero = sc.nextInt();
    	}while(numero > 4 || numero < 1);
    	
    	double num1 = pedirNumero(sc);
    	double num2 = pedirNumero(sc);
    	
    	switch(numero) {
    	case 1:
    		System.out.println("El resultado de la suma es:" + sumar(num1, num2));
    		break;
    	case 2:
    		System.out.println("El resultado de la resta es: " + resta(num1,num2));
    		break;
    	case 4:
    		System.out.println("El resultado de la multiplicacion es: " + multiplicar(num1,num2));
    		break;
    	case 3: 
    		System.out.println("El resultado de la division es: " + division(num1,num2));
    	}
    	
    }
    public static double sumar(double n1, double n2) {
    	return n1 + n2;
    }
    public static double resta(double n1, double n2) {
    	return n1 - n2;
    }
    public static double multiplicar(double n1, double n2) {
    	return n1 * n2;
    }
    public static double division(double n1, double n2) {
    	return n1 / n2;
    }
    
    
    
    
    
    public static double pedirNumero(Scanner sc) {
    	System.out.println("Introduce un numero: ");
    	double numero = sc.nextDouble();
    	return numero;
    }
}


