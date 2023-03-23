package EjerciciosClaseU12;

public class CasaRural extends Casa {
private int distanciaNucleo;
private int altitud;
	public CasaRural(int identificador, int area, String direccion,int distanciaNucleo,int altitud) {
		super(identificador, area, direccion);
this.altitud = altitud;
this.distanciaNucleo = distanciaNucleo;
	}

}
