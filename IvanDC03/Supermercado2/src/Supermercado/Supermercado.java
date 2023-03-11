package Supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Supermercado {
private String productos;
String productos1;
ArrayList<String> cliente = new ArrayList<>();
public static int opciones(int opcion,String productos1) {
	if (opcion==1) {
		System.out.println(productos1);
	}
	//Añadir productos al supermercado
	ArrayList<String> productos = new ArrayList<>(productos);
	if (opcion==2) {
productos.add(productos1);
	}
	//Mostrar carrito 
	else if (opcion==3) {
	productos.sort((Comparator<? super String>) productos);
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
	return opcion;
}
public static int menu(int menu,String productos1,String cliente) {
//Funcionalidad del menu 
	switch (menu) {
	case 1:
	    Collections.sort(productos1);
		System.out.println(productos1.toString());
		break;
	case 2:
		
		break;
	case 3:
		Collections.sort(productos1);
		System.out.println(cliente.toString());
		break;	
	case 4:
		cliente.
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
}
//Nueva forma de mostrar el menu
public int acceso(int opcionAcesso) {
	
	if (opcionAcesso==1) {
		System.out.println();
	}
	else if (opcionAcesso==2) {
		System.out.println();
	}
	return opcionAcesso;
}
}

