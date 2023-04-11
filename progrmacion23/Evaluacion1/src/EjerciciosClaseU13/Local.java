package EjerciciosClaseU13;

public class Local extends Inmueble {
private Localizacion localizacion;
	
	public Local(int identificador, int area, String direccion,
			Localizacion localizacion) {
		super(identificador, area, direccion,localizacion);
		this.localizacion=localizacion;
		
}
}
