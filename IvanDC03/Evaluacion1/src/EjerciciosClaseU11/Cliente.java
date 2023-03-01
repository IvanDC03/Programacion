package EjerciciosClaseU11;

public class Cliente {
private String nombre;
private String apellidos;
private String direccion;
private String localidad;
public Cliente(String nombre, String apellidos, String direccion, String localidad) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direccion = direccion;
	this.localidad = localidad;
}
@Override
public String toString() {
	return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", localidad="
			+ localidad + "]";
}

}
