package EjerciciosClaseU9;

/**
 * 
 * @author Iván
 * 
 */
public class Persona {
	private String nombre;
	private Cuenta cuenta;
	private String apellidos;

	public Persona(String nombre) {
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
