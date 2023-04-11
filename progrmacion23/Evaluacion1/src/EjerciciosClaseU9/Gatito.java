package EjerciciosClaseU9;

public class Gatito {
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String isCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	/* atributos */
	private String nombre;
	private String color;
	private String raza;
	private String sexo;
	private String edad;
	private String castrado;
	private String peso;

//Constructor nombre edad castrado y peso
	public Gatito(String nombre, String color, String raza, String sexo, String edad, String castrado, String peso) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.castrado = castrado;
		this.peso = peso;
	}

	public Gatito(String string, String string2, String string3, String string4, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gatito [nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad
				+ ", castrado=" + castrado + ", peso=" + peso + ", getNombre()=" + getNombre() + ", getColor()="
				+ getColor() + ", getRaza()=" + getRaza() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad()
				+ ", isCastrado()=" + isCastrado() + ", getPeso()=" + getPeso() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void maullar() {
		System.out.println("Miauuuu");
	}

	public void ronronear() {
		System.out.println("rrrrrrrr");
	}

public void comer(String comida) {
	if (comida.equalsIgnoreCase("Pescado")) {
		System.out.println("MMM,muchas gracias");
	}
	else {
		System.out.println("No pienses comer esa " + comida);
	}
	/*Metodo pelear
	 * (recibe por argumento a otro gato
	 * si mi gatito es hembra y el otro gato es hembra --> "No me gusta pelear
	 * si mi gato es macho y el otro gato es hembra --> no peleo con gatitas
	 * si los dos son machos --> ven aqui que te vas a enterar
	 */
	
//}

//public void pelear(gatito,otro gato) {
	if (this.sexo.equalsIgnoreCase("Hembra")) {
		System.out.println("MMM, muchas gracias");
	}
	else if (this.sexo.equalsIgnoreCase("Hembra")) {
		
	}
	
	
	
	else {
		System.out.println("Ven a aqui que te vas a enterar");
	}
}
}
