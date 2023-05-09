package EjerciciosClaseU16.Hipoteca;

public class ModeloImpl implements Modelo {
	private Vista vista;
	private double cantidad;
	private int tiempo;
	private double interes;
	private double cuota;
	
	public ModeloImpl(){
		super();
	}
	public void setVista(Vista vista){
		this.vista = vista;
	}
	public synchronized void setDatos(double cantidad, int tiempo, double interes){
		this.cantidad = cantidad;
		this.tiempo = tiempo;
		this.interes = interes;
		calculaCuota();
		vista.cuotaActualizada();
	}
	private void calculaCuota(){
		double n = interes/1200;
		cuota = cantidad*n/(1-(1/Math. pow(1+n, 12*tiempo)));
	}
	synchronized public double getCuota(){
		return cuota;
	}
}
