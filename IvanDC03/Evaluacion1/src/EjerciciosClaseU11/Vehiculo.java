package EjerciciosClaseU11;

public class Vehiculo {
	private String matricula;
	private TipoVehiculo tipoVehiculo;
	private String marca;

	public Vehiculo(String matricula, TipoVehiculo tipoVehiculo, String marca) {
		this.matricula = matricula;
		this.tipoVehiculo = tipoVehiculo;
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tipoVehiculo=" + tipoVehiculo + ", marca=" + marca
				+ ", getMatricula()=" + getMatricula() + ", getTipoVehiculo()=" + getTipoVehiculo() + ", getMarca()="
				+ getMarca() + "]";
	}


}
