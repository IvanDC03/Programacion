package EjerciciosClaseU12;

public class Empleado {
	private String nombre;
	private String apellidos;
	private double sueldo;
	private String antiguedad;

	public Empleado(String nombre, String apellidos, double sueldo2, String antiguedad2) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Empleado(String nombre, String apellidos, double sueldo, int antiguedad2) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void SubirSueldo() {
		this.sueldo += sueldo * 0.05;

	}
}
