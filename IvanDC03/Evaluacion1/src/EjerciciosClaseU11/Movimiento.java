package EjerciciosClaseU11;

import java.util.Date;

public class Movimiento {

private Date fecha;
private char tipo;
private float importe;
public Movimiento(Date fecha, char tipo, float importe) {
	this.fecha = fecha;
	this.tipo = tipo;
	this.importe = importe;
}
@Override
public String toString() {
	return "Movimiento [fecha=" + fecha + ", tipo=" + tipo + ", importe=" + importe + "]";
}



}
