package EjerciciosClaseU13;

public class Apartamento extends Inmueble {
private double valorAdministracion;
	
	public Apartamento(int identificador, int area, String direccion, int numHab, 
			int numBanos, double valor) {
		super(identificador, area, direccion, numHab, numBanos);
		this.valorAdministracion=valor;
}
}
