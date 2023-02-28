package EjerciciosClaseU11;

public class Disco {
	private String nombreDelDisco;
	private String año_publicacion;
	private double precio;
	private int num_canciones;
	private String cantante;

	public Disco(String nombreDelDisco, String año_publicacion, double precio, int num_canciones, String cantante) {
		this.nombreDelDisco = nombreDelDisco;
		this.año_publicacion = año_publicacion;
		this.precio = precio;
		this.num_canciones = num_canciones;
		this.cantante = cantante;
	}

	public String getNombreDelDisco() {
		return nombreDelDisco;
	}

	public String getAño_publicacion() {
		return año_publicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNum_canciones() {
		return num_canciones;
	}

	public String getCantante() {
		return cantante;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
