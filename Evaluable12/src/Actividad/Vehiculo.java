package Actividad;

public class Vehiculo {
private int ruedas;
private int velocidad;
public Vehiculo(int ruedas, int velocidad) {
	this.ruedas = ruedas;
	this.velocidad = velocidad;
}
public Vehiculo() {
	this.ruedas = 0;
	this.velocidad = 0;
}
public void acelerar(int mas) {
	if (velocidad<120) {
		mas ++;
	}
}
public void frenar(int menos) {
	if (velocidad>=0) {
		menos --;
	}
}
public int getRuedas() {
	return ruedas;
}
public int getVelocidad() {
	return velocidad;
}




}
