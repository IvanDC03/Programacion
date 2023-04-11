package EjerciciosClaseU13;

public class CasaConjuntoCerrado extends CasaUrbana {
	private double valorAdministracion;
	private boolean zonasComunes;
	
	public CasaConjuntoCerrado(int identificador, int area, String direccion, 
			int numHab, int numBanos, double valor, boolean zonas) {
		super(identificador, area, direccion, numHab, numBanos);
		this.valorAdministracion=valor;
		this.zonasComunes=zonas;
}
}
