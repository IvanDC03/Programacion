package EjerciciosClaseU9;

public class Coche {
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	// Atributos
	private int puertas;
	private int ruedas;
	private boolean automatico;
	private String color;
	private int potencia;
	// constructor siempre son publicos
	/* Pones el nombre de la clase despues del public */

	public Coche(boolean automatico, int puertas, String color, int potencia) {
		this.ruedas = 4;
		this.automatico = automatico;
		this.puertas = puertas;
		this.color = color;
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Coche [puertas=" + puertas + ", ruedas=" + ruedas + ", automatico=" + automatico + ", color=" + color
				+ ", potencia=" + potencia + "]";
	}
	

}
