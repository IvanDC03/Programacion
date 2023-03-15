package Supermercado;

public class MenuLogin {
	private int opcion;
	private String salir;

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

		}
		if (opcion == 2) {

		}

		else if (opcion == 3) {

		}

		else if (opcion == 4) {

		} else if (opcion == 6) {
			System.out.println("Salir" + salir);
		}
		return opcion;
	}
}
