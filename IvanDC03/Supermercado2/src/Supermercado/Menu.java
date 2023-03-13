package Supermercado;

import java.util.Collections;

public class Menu {
	private int menu;
	private String productos;
	private String cliente;
	private String salir;

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
