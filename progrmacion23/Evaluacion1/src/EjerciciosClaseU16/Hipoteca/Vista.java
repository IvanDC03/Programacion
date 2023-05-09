package EjerciciosClaseU16.Hipoteca;

import java.awt.Container;

public interface Vista {
	public void setControlador(Controlador controlador);
	public void setModelo(Modelo modelo);
	public Container getContenedor();
	public double getCantidad();
	public int getTiempo();
	public double getInteres();
	public void cuotaActualizada();
	
}
