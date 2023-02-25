package EjerciciosClaseU10;

import java.util.Arrays;

public class Coche {
//Atributos
private Ruedas [] ruedas;
private int cilindrada;
//Constructor
public Coche(int numRuedas, int cilindrada) {
	this.ruedas = new Ruedas[numRuedas];
	this.cilindrada = cilindrada;
	for (int i = 0; i < numRuedas; i++) {
		ruedas[i] = new Ruedas(65,185);
	}
}
@Override
public String toString() {
	return "Coche [ruedas=" + Arrays.toString(ruedas) + ", cilindrada=" + cilindrada + "]";
}
public Ruedas[] getRuedas() {
	return ruedas;
}
public void setRuedas(Ruedas[] ruedas) {
	this.ruedas = ruedas;
}
public int getCilindrada() {
	return cilindrada;
}
public void setCilindrada(int cilindrada) {
	this.cilindrada = cilindrada;
}
class Ruedas{
	private int perfil;
	private int anchura;

public Ruedas(int perfil,int anchura) {
	this.perfil = perfil;
	this.anchura = anchura;
	
}
}

}
