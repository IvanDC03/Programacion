package Supermercado;

public class Acceso {
	private int opcionAcceso;

	public Acceso() {
		this.opcionAcceso = opcionAcceso;
	}

	public int getOpcionAcceso() {
		return opcionAcceso;
	}

	public void setOpcionAcceso(int opcionAcceso) {
		this.opcionAcceso = opcionAcceso;
	}

	public int acceso(int opcionAcesso) {

		if (opcionAcesso == 1) {
			System.out.println("Personal del Supermercado");
		} else if (opcionAcesso == 2) {
			System.out.println("Cliente");
		}
		return opcionAcesso;
	}
}
