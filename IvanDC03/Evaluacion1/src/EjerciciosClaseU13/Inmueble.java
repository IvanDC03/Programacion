package EjerciciosClaseU13;

public class Inmueble {
	private int identificador;
	private int area;
	private String direccion;
	private double valorCompra;
	
	public Inmueble(int identificador, int area, String direccion) {
		this.identificador = identificador;
		this.area = area;
		this.direccion = direccion;
		calcularValorInmueble(this);
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
	
	
	
	public double getValorCompra() {
		return valorCompra;
	}

	public void calcularValorInmueble(Inmueble inm) {
		
		if(inm instanceof CasaRural || inm instanceof Apartaestudio)
			this.valorCompra=this.area*1500;
		else if(inm instanceof CasaConjuntoCerrado)
			this.valorCompra=this.area*2500;
		else if(inm instanceof CasaIndependiente || inm instanceof LocalComercial )
			this.valorCompra=this.area*3000;
		else if(inm instanceof ApartamentoFamiliar)
			this.valorCompra=this.area*2000;
		else if(inm instanceof Oficina);
			
}
