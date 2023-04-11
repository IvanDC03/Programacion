package Actividad;

public class TrabajadorProduccion {
	private String mañana;
	private String tarde;
	private String noche;

	public TrabajadorProduccion(String mañana, String tarde, String noche) {
		this.mañana = mañana;
		this.tarde = tarde;
		this.noche = noche;
	}

	public String getMañana() {
		return mañana;
	}

	public void setMañana(String mañana) {
		this.mañana = mañana;
	}

	public String getTarde() {
		return tarde;
	}

	public void setTarde(String tarde) {
		this.tarde = tarde;
	}

	public String getNoche() {
		return noche;
	}

	public void setNoche(String noche) {
		this.noche = noche;
	}

	@Override
	public String toString() {
		return "TrabajadorProduccion [mañana=" + mañana + ", tarde=" + tarde + ", noche=" + noche + ", getMañana()="
				+ getMañana() + ", getTarde()=" + getTarde() + ", getNoche()=" + getNoche() + "]";
	}

}
