package Supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JList;

public class SupermercadoMain {

	public static void main(String[] args) {

//Menu principal 
System.out.println("***************Menu***************");
System.out.println("1. Mostrar productos del supermercado");
System.out.println("2. Añadir productos al supermercado");
System.out.println("3. Mostrar carrito de la compra ordenado");
System.out.println("4. Consultar producto de carrito");
System.out.println("5. Cambiar un producto por otro");
System.out.println("6. Salir");
//Productos del supermercado y inicializados con un ArrayList
List<String> productos = Arrays.asList("Tomate","Aceite","Pan","Leche","Yogur","Queso","Jamon","Harina","Champu","Manzana");
ArrayList<String> productos1 = new ArrayList<>(productos);
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
	
	break;	
case 4:
	
	break;	
case 5:
	
	break;
case 6:
	
	break;
default:
	
	
	break;
}	
	
	}
}
