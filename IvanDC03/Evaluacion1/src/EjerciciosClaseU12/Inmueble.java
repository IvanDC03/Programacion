package EjerciciosClaseU12;

public class Inmueble {
private int identificador;
private int area;
private String direccion;
public Inmueble(int identificador, int area, String direccion) {
	this.identificador = identificador;
	this.area = area;
	this.direccion = direccion;
}
public int getIdentificador() {
	return identificador;
}
public void setIdentificador(int identificador) {
	this.identificador = identificador;
}
public int getArea() {
	return area;
}
public void setArea(int area) {
	this.area = area;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public void CalcularValorInmueble(Inmueble inm) {
	//Tabla 
	if (inm instanceof CasaRural) {
		this.valorCompra = this.area * 1500;
		
	}
	else if (inm instanceof CasaConjuntoCerrado) {
		
	}
	else if (inm instanceof CasaConjuntoCerrado) {
		
	}	
	else if (inm instanceof CasaConjuntoCerrado) {
		
	}
	
	
	
	
	
}

}
