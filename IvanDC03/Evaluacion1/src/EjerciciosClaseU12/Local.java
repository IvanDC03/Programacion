package EjerciciosClaseU12;

public class Local extends Inmueble {
private Localizacion localizacion;
	public Local(int identificador, int area, String direccion) {
		super(identificador, area, direccion, Localizacion localizacion);
		this.localizacion = localizacion;
	}

}
