package EjerciciosClaseU11;

import java.util.Scanner;

public class PrincipalCuenta {

	public static void main(String[] args) {
Cliente cliente1 = new Cliente("Alberto","Perez","Madrid","Las Rozas");
Cuenta cuenta1 = new Cuenta(101245022428168L,0.01f,cliente1);
Scanner sc = new Scanner(System.in);
System.out.println("******Menu*******");
System.out.println("Ingresar dinero: ");
int ingresarDinero = sc.nextInt();
System.out.println("Sacar dinero: ");
int sacarDinero = sc.nextInt();
int resultado = ingresarDinero - sacarDinero;
for (int i = 0; i<0; i++) {
	System.out.println("Te quedan: " + resultado);
	System.out.println("Estas en numeros Rojos");
}
String palabra = "";
System.out.println("Salir (Introduce cualquier palabra): " + palabra);
String palabra1 = sc.next();


	}

}
