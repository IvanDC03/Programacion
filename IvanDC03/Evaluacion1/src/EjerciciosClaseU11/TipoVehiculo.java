package EjerciciosClaseU11;

public enum TipoVehiculo {
	COCHE(20, 4), MOTO(10, 2), CAMION(100, 8);

	private int valorPeaje;
	private int numRuedas;

	private TipoVehiculo(int valorPeaje, int numRuedas) {
		this.valorPeaje = valorPeaje;
		this.numRuedas = numRuedas;
	}

	public int getValorPeaje() {
		return valorPeaje;
	}

	public void setValorPeaje(int valorPeaje) {
		this.valorPeaje = valorPeaje;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

}
