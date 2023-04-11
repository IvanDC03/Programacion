package EjerciciosClaseU10;

public class Humano {
private String nombre;
private int edad;
private static int poblacion;
public Humano(String nombre) {
	this.nombre = nombre;
	this.edad = edad;
	Humano.poblacion ++;
}
public void crecer() {
	this.edad++;
}
@Override
public String toString() {
	return "Humano [nombre=" + nombre + ", edad=" + edad + "]";
}


}
