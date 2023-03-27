package EjerciciosClaseU13;

public class LocalComercial extends Local {
private String centroComercial;
	
	public LocalComercial(int identificador, int area, 
			String direccion, Localizacion localizacion, String cc) {
		super(identificador, area, direccion, localizacion);
		this.centroComercial=cc;
		
	}
}
