package EjerciciosClaseU11;

import java.io.InputStream;

public class Cancion {
private String nombre;
private int duracion;
public Cancion(String nombre, int duracion) {
	this.nombre = nombre;
	this.duracion = duracion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}

}
