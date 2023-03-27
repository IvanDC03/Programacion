package Actividad;

public class TrabajadorDistribucion {
	private String zona;

	public TrabajadorDistribucion(String zona) {
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "TrabajadorDistribucion [zona=" + zona + ", getZona()=" + getZona() + "]";
	}

}
