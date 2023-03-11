package Supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SupermercadoMain {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce una opcion: ");
int opcion = sc.nextInt();
//Menu principal 
System.out.println("***************Menu***************");
System.out.println("1. Mostrar productos del supermercado");
System.out.println("2. Añadir productos al supermercado" );
System.out.println("3. Mostrar carrito de la compra ordenado");
System.out.println("4. Consultar productos del carrito");
System.out.println("5. Cambiar un producto por otro");
System.out.println("6. Salir");
//Productos del supermercado
SupermercadoEnum.values();
//Productos que el cliente a seleccionado y guardados en una lista
ArrayList<String> cliente = new ArrayList<>();
//Nueva forma de mostrar el menu
System.out.println("Introduce una opcion: ");
int opcionAcesso = sc.nextInt();
System.out.println("**********Acceso***********");
System.out.println("1. Personal del Supermercaado");
System.out.println("2. Cliente");
if (opcionAcesso==1) {
	System.out.println();
}
else if (opcionAcesso==2) {
	System.out.println();
}
//Menu login 
System.out.println("Introduzca usuario y contraseña: ");
String usuario = sc.nextLine();
int contraseña = sc.nextInt();
System.out.println("***************Menu***************");
System.out.println("1. Mostrar productos del Supermercado");
System.out.println("2. Añadir productos");
System.out.println("3. Eliminar producto");
System.out.println("4. Modificar producto");
System.out.println("5. Salir");
//Llamar funciones 

//Menu del cliente
System.out.println("Elije una opcion: ");
int opcion4 = sc.nextInt();
System.out.println("***************Menu***************");
System.out.println("1. Ver productos del supermercado");
System.out.println("2. Añadir productos al supermercado");
System.out.println("3. Mostarr carrito de la compra ordenado");
System.out.println("4. Consultar producto de carrito");
System.out.println("5. Eliminar producto");
System.out.println("6. Salir");
	}
}
