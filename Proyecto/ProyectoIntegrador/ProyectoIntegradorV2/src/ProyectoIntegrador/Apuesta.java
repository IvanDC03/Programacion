package ProyectoIntegrador;

public class Apuesta {

	private double multiplicador;
	private double apuesta;
	private double dineroGanado;
	private boolean ganada;
	private boolean cobrado;
	private boolean finalizada;

	public Apuesta(double multiplicador, boolean cobrado, boolean finalizada) {

		this.multiplicador = multiplicador;
		this.cobrado = cobrado;
		this.finalizada = finalizada;

	}

	public double getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(double multiplicador) {
		this.multiplicador = multiplicador;
	}

	public double getApuesta() {
		return apuesta;
	}

	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}

	public double getDineroGanado() {
		return dineroGanado;
	}

	public void setDineroGanado(double dineroGanado) {
		this.dineroGanado = dineroGanado;
	}

	public boolean isGanada() {
		return ganada;
	}

	public void setGanada(boolean ganada) {
		this.ganada = ganada;
	}

	public boolean isCobrado() {
		return cobrado;
	}

	public void setCobrado(boolean cobrado) {
		this.cobrado = cobrado;
	}

	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}

	public void cobrar() {

		if (this.ganada == true && this.finalizada == true && this.cobrado == false) {

			this.cobrado = true;

			this.dineroGanado = this.apuesta * this.multiplicador;

		}

	}

}
