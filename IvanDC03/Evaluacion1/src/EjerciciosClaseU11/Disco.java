package EjerciciosClaseU11;

import java.util.ArrayList;

public class Disco {
	private String nombreDisco;
	private int anyo_pub;
	private double precio;
	private int num_canciones;
	private ArrayList<Cancion> canciones;

	public Disco(String nombreDisco, int anyo_pub, double precio, int num_canciones) {
		this.nombreDisco = nombreDisco;
		this.anyo_pub = anyo_pub;
		this.precio = precio;
		this.num_canciones = num_canciones;
		this.canciones = new ArrayList<>();

	}

	public String getNombreDisco() {
		return nombreDisco;
	}

	public int getAnyo_pub() {
		return anyo_pub;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNum_canciones() {
		return num_canciones;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Disco [nombreDisco=" + nombreDisco + ", anyo_pub=" + anyo_pub + ", precio=" + precio
				+ ", num_canciones=" + num_canciones + "]";
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void anyadirCancion(Cancion c) {
		canciones.add(c);
	}

}