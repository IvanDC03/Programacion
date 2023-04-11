package EjerciciosClaseU12;

import java.util.Comparator;

public abstract class Gato implements Comparable {
private String nombre;
private int edad;
private double peso;


@Override
public String toString() {
	return "Gato [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", getNombre()=" + getNombre()
			+ ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + "]";
}
public Gato(String nombre, int edad, double peso) {
	this.nombre = nombre;
	this.edad = edad;
	this.peso = peso;
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
public int compareTo(Gato g) {
return(this.getNombre().compareTo(g.getNombre()))* -1;
}


}