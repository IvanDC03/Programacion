package Actividad;

public class DobleNumero {
//Atributos
	private int numero;

//Constructores
	public DobleNumero(int numero) {
		this.numero = numero;
	}

	void setValue(int n) {
		this.numero = n;
	}

	int getValue() {
		return numero * 2;
	}
}
