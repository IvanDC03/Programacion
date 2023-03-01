package EjerciciosClaseU11;

import java.util.ArrayList;
import java.util.Date;

public class Cuenta {
/*Numero
 * saldo
 * interes Anual
 */
private long numero;
private float saldo;
private float interesAnual;
private String cliente;
private Cliente titular;
private ArrayList <Movimiento> movimiento;
public Cuenta(long numero, float interesAnual, String cliente) {
	this.numero = numero;
	this.interesAnual = interesAnual;
	this.cliente = cliente;
	this.saldo = 0;
	this.movimiento = new ArrayList<>(); 
}
public Cuenta(long numero) {
	this(numero,0.1f,null);
}
public void ingreso(float cantidad) {
	Movimiento mov = new Movimiento(new Date(),'I',cantidad);
	movimiento.add(mov);
	this.saldo += cantidad; 
}
public void reintegro(float cantidad) {
	Movimiento mov = new Movimiento(new Date(),'I',cantidad);
	movimiento.add(mov);
	this.saldo -= cantidad; 
}
public String getCliente() {
	return cliente;
}
public void setCliente(String cliente) {
	this.cliente = cliente;
}
public long getNumero() {
	return numero;
}
public float getSaldo() {
	return saldo;
}
public Cliente getTitular() {
	return titular;
}



}
