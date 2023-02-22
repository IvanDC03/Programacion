package com.utad.dawe.model;

public class JugadorBalonMano {
private String nombre;
private int dorsal;
private int anotacion;
private int bloqueo;
private int tiempoJugado;
public JugadorBalonMano(String nombre, int dorsal) {
	this.nombre = nombre;
	this.dorsal = dorsal;
}
public int getTiempoJugado() {
	return tiempoJugado;
}
public void setTiempoJugado(int tiempoJugado) {
	this.tiempoJugado = tiempoJugado;
}
public void setAnotacion(int anotacion) {
	this.anotacion = anotacion;
}
public void setBloque(int bloqueo) {
	this.bloqueo = bloqueo;
}
@Override
public String toString() {
	return "JugadorBalonMano [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
			+ bloqueo + ", tiempoJugado=" + tiempoJugado + "]";
}

}
