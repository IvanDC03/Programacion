package EjerciciosClaseU11;

public class Cantante {
	private String nombre;
	private String apellidos;
	private String nombre_artistico;
	private int edad;
	private int numDiscos;
	private EstiloMusical estilo;
	private Disco disco;

	public Cantante(String nombre, String apellidos, String nombre_artistico, int edad, EstiloMusical estilo,
			Disco disco) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombre_artistico = nombre_artistico;
		this.edad = edad;
		this.numDiscos = 0;
		this.estilo = estilo;
		this.disco = disco;
	}

	public Cantante(String nombre_artistico, EstiloMusical estilo) {
		this.nombre_artistico = nombre_artistico;
		this.estilo = estilo;
	}

	public String getNombre() {
		return nombre;
	}

	public Disco getDisco() {
		return disco;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombre_artistico() {
		return nombre_artistico;
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

	public void setNombre_artistico(String nombre_artistico) {
		this.nombre_artistico = nombre_artistico;
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

	public String imprimirDatos() {
		String texto = "El cantante " + nombre_artistico + " tiene una edad de " + edad + " aÃ±os y " + " su disco "
				+ disco.getNombreDisco() + " tiene las siguientes canciones: \n";

		String textoCancion = "";
		for (Cancion c : this.disco.getCanciones()) {
			textoCancion += c.imprimirDatos() + "\n";
		}

		texto = texto + textoCancion;

		return texto;

	}

}