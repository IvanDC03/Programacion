package Supermercado;

import java.util.ArrayList;
import java.util.Collections;

public class Menu {
	private int menu;
	private String cliente;
	private String salir;
	ArrayList<String> productos = new ArrayList<>();
	private static String cambiar;
	public Menu() {
		this.menu = menu;
		this.productos = productos;
		this.cliente = cliente;
		this.salir = salir;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public ArrayList<String> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<String> productos) {
		this.productos = productos;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSalir() {
		return salir;
	}

	public void setSalir(String salir) {
		this.salir = salir;
	}

	public static int menu(int menu, String productos, String cliente, String salir) {

		switch (menu) {
		case 1:
System.out.println("Mostrar productos del supermercado" + productos);
			break;
		case 2:
System.out.println("Añadir productos al supermercados" + productos);
			break;
		case 3:
Collections.sort(productos);
System.out.println(productos.toString());
			break;
		case 4:
System.out.println("Consultar productos del carrito" + productos);
			break;
		case 5:
System.out.println("Cambiar un producto por otro" + cambiar);
			break;
		default:
			System.out.println("Salir" + salir);
			break;
		}
		return menu;
	}
}
