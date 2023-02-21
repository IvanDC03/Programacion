package EjerciciosClaseU10;

public class Jugador {
private String nombre;
private int numero;
private Posiciones posiciones;
public Jugador(String nombre, int numero, Posiciones posiciones) {
	this.nombre = nombre;
	this.numero = numero;
	this.posiciones = posiciones;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public Posiciones getPosiciones() {
	return posiciones;
}
public void setPosiciones(Posiciones posiciones) {
	this.posiciones = posiciones;
}
@Override
public String toString() {
	return "Jugador [nombre=" + nombre + ", numero=" + numero + ", posiciones=" + posiciones.name() + "y pertenece a equipo:" +  ];
}

}
