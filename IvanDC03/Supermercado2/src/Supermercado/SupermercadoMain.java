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
//Productos del supermercado y inicializados con una lista 
SupermercadoEnum.values();
if (opcion==1) {
	System.out.println(productos);
}
//Añadir productos al supermercado
ArrayList<String> productos1 = new ArrayList<>(productos);
if (opcion==2) {
	productos1.addAll(productos);
}
//Mostrar carrito 
else if (opcion==3) {
	Collections.sort(productos);
	System.out.println(productos.toString());
}
//Consultar producto
else if (opcion==4) {
	
}
//Cambiar producto
else if (opcion==5) {
	
}
//Salir 
else if (opcion==6) {
	String salir = " ";
	System.out.println("Salir" + salir);
}
//Productos que el cliente a seleccionado
ArrayList<String> cliente = new ArrayList<>();
//Funcionalidad del menu 
int menu = 0;
switch (menu) {
case 1:
    Collections.sort(productos);
	System.out.println(productos.toString());
	break;
case 2:
	
	break;
case 3:
	Collections.sort(productos);
	System.out.println(cliente.toString());
	break;	
case 4:
	cliente.addAll(productos);
	break;	
case 5:
	
	break;
case 6:
	System.out.println("Fin");
	break;
default:
String salir1 = " ";
System.out.println("Salir" + salir1);
	break;
}	
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
	System.out.println("Cliente");
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
