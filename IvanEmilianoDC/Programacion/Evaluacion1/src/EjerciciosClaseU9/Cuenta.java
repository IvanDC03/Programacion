package EjerciciosClaseU9;

public class Cuenta {

	private String numero;
	private float saldo;
	private float interesAnual;

	public Cuenta(String numero, String titular, float saldo, float interesAnual) {
		this.numero = numero;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}

	public void ingreso(float cantidad) {
		saldo = saldo + cantidad;
	}

	public void reintegro(float cantidad) {
		saldo = saldo - cantidad;
	}

	public void ingresoInteres() {
		saldo = saldo + saldo * interesAnual;
	}

	public boolean enrojos() {
		return saldo < 0;
	}

	public float leerSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(float interesAnual) {
		this.interesAnual = interesAnual;
	}

}
