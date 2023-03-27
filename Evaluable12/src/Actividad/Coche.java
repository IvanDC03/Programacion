package Actividad;

public class Coche extends Vehiculo {
	private int combustible;

	public Coche(int ruedas, int combustible) {
		super(ruedas, combustible);
		this.combustible = combustible;
	}

	public Coche() {
		this.combustible = 0;
	}

	public void repostar(int mas) {
		if (combustible < 60) {
			mas++;
		}
	}

	public void consumir(int menos) {
		if (combustible >= 0) {
			menos--;
		}
	}

	public int getCombustible() {
		return combustible;
	}

}
