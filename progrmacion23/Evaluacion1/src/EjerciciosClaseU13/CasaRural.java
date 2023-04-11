package EjerciciosClaseU13;

public class CasaRural extends Casa {
	private int distanciaNucleo;
	private int altitud;
	
	public CasaRural(int identificador, int area, String direccion, int numHab, 
			int numBanos, int distNucleo, int altitud) {
		super(identificador, area, direccion, numHab, numBanos);
		this.distanciaNucleo=distNucleo;
		this.altitud=altitud;
		
	}

	public int getDistanciaNucleo() {
		return distanciaNucleo;
	}

	public void setDistanciaNucleo(int distanciaNucleo) {
		this.distanciaNucleo = distanciaNucleo;
	}

	public int getAltitud() {
		return altitud;
	}

	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}
}
