package Supermercado;

import java.util.Collections;

public class MenuCliente {
	private int opcion;
	private String productos;
	private String salir;
	private static String eliminar;

	public MenuCliente() {
		this.opcion = opcion;
		this.productos = productos;
		this.salir = salir;
	}

	public static int getEliminar() {
		return eliminar;
	}

	public static void setEliminar(int eliminar) {
		MenuCliente.eliminar = eliminar;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public String getSalir() {
		return salir;
	}

	public void setSalir(String salir) {
		this.salir = salir;
	}

	public static int MenuCliente(int opcion, String productos, String salir) {

		if (opcion == 1) {
			System.out.println("Productos del supermercado" + productos);
		}
		if (opcion == 2) {
			System.out.println("Añadir productos del supermercado" + productos);
		} else if (opcion == 3) {
			Collections.sort(productos);
			System.out.println(productos.toString());
		} else if (opcion == 4) {
			System.out.println("Consultar producto del carrito" + productos);
		} else if (opcion == 5) {
			System.out.println("Eliminar producto" + eliminar);
		} else if (opcion == 6) {
			System.out.println("Salir" + salir);
		}
		return opcion;
	}
}
