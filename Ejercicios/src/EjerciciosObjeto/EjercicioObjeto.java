package EjerciciosObjeto;

import java.util.ArrayList;
import java.util.List;

public class EjercicioObjeto {
private String nombre;
private int edad;
private String dni;
private char sexo;
private double peso;
private double altura;
public EjercicioObjeto() {
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
	this.sexo = sexo;
	this.peso = peso;
	this.altura = altura;
}
public EjercicioObjeto(String nombre, int edad, char sexo) {
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
}
public EjercicioObjeto(String nombre, int edad, String dni, char sexo, double peso, double altura) {
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
	this.sexo = sexo;
	this.peso = peso;
	this.altura = altura;
}
public int EjercicioObjeto() {
	double operacion = peso/(altura * altura);
	if (operacion<20) {
	return -1;
	}
	else if (operacion>=20 && operacion<=25) {
		return 0;
	}
	else if (operacion>25) {
		return 1;
	}
	return edad;
}
public boolean esMayorDeEdad() {
	if (edad>=18) {
		return true; 
	}
	else {
		return false;
	}
}
public void ComprobarSexo(char sexo) {
	if (sexo=='m' || sexo=='h') {
	this.sexo = sexo;
	}
	else {
		this.sexo = 'h';
	}

}

@Override
public String toString() {
	return "EjercicioObjeto [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
		+ ", altura=" + altura + ", EjercicioObjeto()=" + EjercicioObjeto() + ", esMayorDeEdad()=" + esMayorDeEdad()
			+ "]";
}
public void generarDni() {
char [] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
List<Integer> aleatorio = new ArrayList<>(8);
for (int i = 0; i <=8; i++) {
	int numero = (int) Math.floor((Math.random()) * 9);
aleatorio.add(numero);
}
int posicion = (int) Math.floor((Math.random()) * chars.length);
char letra = chars[posicion];
for (int i = 0; i <=7; i++) {
	this.dni = this.dni + "" + aleatorio.get(i);
}
this.dni = this.dni + letra;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public void setAltura(double altura) {
	this.altura = altura;
}

}
