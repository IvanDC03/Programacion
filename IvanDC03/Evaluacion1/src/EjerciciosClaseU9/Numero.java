package EjerciciosClaseU9;

public class Numero {
/*Todo objeto de numero esta compuesto por un numero
 * metodos
 * 1º escapicua
 * 2ºesprimo
 * 3ºpotencia
 * 4ºdigitos
 */
	
public int getEscapicua() {
		return escapicua;
	}
	public void setEscapicua(int escapicua) {
		this.escapicua = escapicua;
	}
	public int getEsprimo() {
		return esprimo;
	}
	public void setEsprimo(int esprimo) {
		this.esprimo = esprimo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getDigitos() {
		return digitos;
	}
	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}
int escapicua;
int esprimo;
int potencia;
int digitos;
public Numero() {
	this.digitos = digitos;
	this.escapicua = escapicua;
	this.esprimo = esprimo;
	this.potencia = potencia;
	
}
}
