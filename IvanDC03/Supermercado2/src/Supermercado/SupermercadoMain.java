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
//Productos del supermercado
		ArrayList<String> productos = new ArrayList<>();
		productos.add("Tomate");
		productos.add("Aceite");
		productos.add("Pan");
		productos.add("Leche");
		productos.add("Yogur");
		productos.add("Queso");
		productos.add("Jamon");
		productos.add("Harina");
		productos.add("Champu");
		productos.add("Manzana");
		Opciones sc1 = new Opciones();
//Menu principal 
		System.out.println("***************Menu***************");
		System.out.println("1. Mostrar productos del supermercado");
		System.out.println("2. Añadir productos al supermercado");
		System.out.println("3. Mostrar carrito de la compra ordenado");
		System.out.println("4. Consultar productos del carrito");
		System.out.println("5. Cambiar un producto por otro");
		System.out.println("6. Salir");
		Menu sc2 = new Menu();
//Productos que el cliente a seleccionado y guardados en una lista
		ArrayList<String> cliente = new ArrayList<>();
//Nueva forma de mostrar el menu
		System.out.println("Introduce una opcion: ");
		int opcionAcesso = sc.nextInt();
		String cliente1 = " ";
		System.out.println("**********Acceso***********");
		System.out.println("1. Personal del Supermercado");
		System.out.println("2. Cliente");
		Acceso sc3 = new Acceso();
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
		MenuLogin sc4 = new MenuLogin();
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
		MenuCliente sc5 = new MenuCliente();
	}
}
