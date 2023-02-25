package EjerciciosClaseU11;

public class Peaje {
	private String nombre;
	private String provincia;
	private int totalPeaje;
	private int totalCamiones;
	private int totalMotos;
	private int totalCoches;

	public Peaje(String nombre, String provincia) {
		this.nombre = nombre;
		this.provincia = provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
