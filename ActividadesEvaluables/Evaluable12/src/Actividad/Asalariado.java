package Actividad;

public class Asalariado {
	private String nombre;
	private long dni;
	private int numDias;

	public Asalariado(String nombre, long dni, int numDias) {
		this.nombre = nombre;
		this.dni = dni;
		this.numDias = numDias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

}
