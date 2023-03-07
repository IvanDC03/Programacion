package Actividad;

public class Alumno {
//Atributos
	private String nombre;
	private String curso;
	private int[] notas;
	private int asignaturas;

//Primer constructor con tres parametros
	public Alumno(String nombre, String curso, int asignaturas) {
		this.nombre = nombre;
		this.curso = curso;

	}

//Segundo constructor con dos parametros
	public Alumno(String nombre, String curso) {
	
		this(nombre,curso,5);
	}

//Tercer constructor con un parametro
	public Alumno(String nombre) {
		this(nombre,"DAM");
	}

}
