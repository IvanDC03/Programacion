package Supermercado;

import java.util.Comparator;

public class Opciones {
	private int opcion;
	private String productos;
	private String salir;

	public Opciones() {
		this.opcion = opcion;
		this.productos = productos;
		this.salir = salir;
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

	public static int Opciones(int opcion, String productos, String salir) {

		if (opcion == 1) {

		}
		if (opcion == 2) {

		}

		else if (opcion == 3) {

		}

		else if (opcion == 4) {

		}

		else if (opcion == 5) {

		}

		else if (opcion == 6) {
			System.out.println("Salir" + salir);
		}
		return opcion;

	}
}
