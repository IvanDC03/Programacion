package EjerciciosClaseU13;

public class Oficina extends Local{

	private boolean perteneceGobierno;
	
	public Oficina(int identificador, int area, String direccion, 
			Localizacion localizacion, boolean gobierno) {
		super(identificador, area, direccion, localizacion);
		this.perteneceGobierno=gobierno;
	}

	
	
		

}
