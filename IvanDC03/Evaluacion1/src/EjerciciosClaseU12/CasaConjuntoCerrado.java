package EjerciciosClaseU12;

public class CasaConjuntoCerrado extends CasaUrbana {
private double valorAdministracion;
private boolean zonasComunes;
	public CasaConjuntoCerrado(int identificador, int area, String direccion,double valorAdminitracion,boolean zonasComunes) {
		super(identificador, area, direccion);
this.valorAdministracion = valorAdministracion;
this.zonasComunes = zonasComunes;
	}

}
