package Supermercado;

import java.util.Collections;

public class Menu {
	private int menu;
	private String productos;
	private String cliente;
	private String salir;

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

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
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
			System.out.println("Fin");
			break;
		default:
			System.out.println("Salir" + salir);
			break;
		}
		return menu;
	}
}
