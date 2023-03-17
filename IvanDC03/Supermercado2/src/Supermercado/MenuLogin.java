package Supermercado;

import java.util.ArrayList;

public class MenuLogin {
	private int opcion;
	private String salir;
	static ArrayList<String> productos = new ArrayList<>();

	public MenuLogin() {
		this.opcion = opcion;
		this.salir = salir;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public String getSalir() {
		return salir;
	}

	public void setSalir(String salir) {
		this.salir = salir;
	}

	public static int MenuLogin(int opcion, String salir) {
		if (opcion == 1) {
			System.out.println("Productos" + productos);
		}
		if (opcion == 2) {
			System.out.println("Añadir productos" + productos);
		} else if (opcion == 3) {
			System.out.println("Eliminar producto" + productos);
		} else if (opcion == 4) {
			System.out.println("Modificar producto" + productos);
		} else if (opcion == 5) {
			System.out.println("Salir" + salir);
		}
		return opcion;
	}
}
