package EjerciciosClaseU9;

public class Humano {
	private String nombre;
	private int edad;
	private double peso;
	private double estatura;

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + "]";
	}

	public Humano(String nombre, int edad, double peso, double estatura) {
		this.edad = edad;
		this.nombre = nombre;
		this.peso = peso;
		this.estatura = estatura;
	}

	public void cumplirAños() {
		this.edad = this.edad + 1;
	}

	public void cambiarPeso(double cambioPeso) {
		this.peso = this.peso + cambioPeso;
	}

	public void cambiarEstatura(double estatura) {
		this.estatura = this.estatura + estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}
