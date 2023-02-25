package EjerciciosClaseU11;

public class Cantante {
	private String nombre;
	private String apellidos;
	private String nombreArtistico;
	private int edad;
	private int numDiscos;
	private EstiloMusical estilo;

	public Cantante() {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreArtistico = nombreArtistico;
		this.edad = edad;
		this.numDiscos = numDiscos;
		this.estilo = estilo;
	}

	public Cantante(String nombreArtistico,EstiloMusical estilo) {
		this.nombreArtistico = nombreArtistico;
		this.estilo = estilo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public int getEdad() {
		return edad;
	}

	public int getNumDiscos() {
		return numDiscos;
	}

	public EstiloMusical getEstilo() {
		return estilo;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNumDiscos(int numDiscos) {
		this.numDiscos = numDiscos;
	}

	public void setEstilo(EstiloMusical estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", apellidos=" + apellidos + ", nombreArtistico=" + nombreArtistico
				+ ", edad=" + edad + ", numDiscos=" + numDiscos + ", estilo=" + estilo + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getNombreArtistico()=" + getNombreArtistico()
				+ ", getEdad()=" + getEdad() + ", getNumDiscos()=" + getNumDiscos() + ", getEstilo()=" + getEstilo()
				+ "]";
	}

}
