package EjerciciosClaseU16.Hipoteca;

public class ControladorImpl implements Controlador {
	private Modelo modelo;
	private Vista vista;
	
	public ControladorImpl(){
		super();
	}
	public void setModelo(Modelo modelo){
		this.modelo = modelo;
	}
	public void setVista(Vista vista){
		this.vista = vista;
	}
	public void solicitadoCalculo(){
		double cantidad = vista.getCantidad();
		int tiempo = vista. getTiempo();
		double interes = vista.getInteres();
		modelo.setDatos(cantidad, tiempo, interes);
	}
}