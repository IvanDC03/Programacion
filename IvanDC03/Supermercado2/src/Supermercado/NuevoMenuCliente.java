package Supermercado;

import java.util.Collections;

public class NuevoMenuCliente {
	private static int precios;
	private static String carrito;
	private String eliminar;
	private static String caja;
	private String salir;

	public static int getPrecios() {
		return precios;
	}

	public static void setPrecios(int precios) {
		NuevoMenuCliente.precios = precios;
	}

	public static String getCarrito() {
		return carrito;
	}

	public static void setCarrito(String carrito) {
		NuevoMenuCliente.carrito = carrito;
	}

	public String getEliminar() {
		return eliminar;
	}

	public void setEliminar(String eliminar) {
		this.eliminar = eliminar;
	}

	public static String getCaja() {
		return caja;
	}

	public static void setCaja(String caja) {
		NuevoMenuCliente.caja = caja;
	}

	public String getSalir() {
		return salir;
	}

	public void setSalir(String salir) {
		this.salir = salir;
	}

	public NuevoMenuCliente(String eliminar, String salir) {
		this.eliminar = eliminar;
		this.salir = salir;
	}

	public static int MenuCliente(int opcion, String productos, String salir) {

		if (opcion == 1) {
			System.out.println("Ver productos del supermercado" + precios);
		}
		if (opcion == 2) {
			System.out.println("Ver productos de una sección determinada" + precios);
		} else if (opcion == 3) {
			System.out.println("Añadir productos" + carrito);
		} else if (opcion == 4) {
			Collections.sort(carrito);
			System.out.println(carrito.toString());
		} else if (opcion == 5) {
			System.out.println("Consultar producto" + carrito);
		} else if (opcion == 6) {
			System.out.println("Salir" + salir);
		} else if (opcion == 7) {
			System.out.println("Pasar por" + caja);
		} else if (opcion == 8) {
			System.out.println("Salir" + salir);
		}
	}
}
