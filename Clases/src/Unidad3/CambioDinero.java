package Unidad3;

import java.util.Scanner;

public class CambioDinero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros: ");
		double dinero = sc.nextDouble();
		System.out.println("A que moneda quieres cambiar Dolares,Yenes y Libras: ");
		String cambio = sc.next();
		cambioDivisa(dinero,cambio);
	}
        public static void cambioDivisa(double cantidad,String cambio) {
        	double dolares = 1.28611;
        	double yenes = 129.852;
        	double libras = 0.86;
        	if (cambio.equals("d")) {
				System.out.println(cantidad*dolares);
			}
        	if (cambio.equals("y")) {
				System.out.println(cantidad*yenes);
			}
        	if (cambio.equals("l")) {
				System.out.println(cantidad*libras);
			}
        }
}
