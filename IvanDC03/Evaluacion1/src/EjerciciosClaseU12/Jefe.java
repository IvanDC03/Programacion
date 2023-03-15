package EjerciciosClaseU12;

public class Jefe extends Empleado {

	private double bonus;

	public Jefe(String nombre, String apellidos, double sueldo, String antiguedad, double bonus) {
		super(nombre, apellidos, sueldo, antiguedad);
		this.bonus = bonus;
	}

	public void setBonus(double cantidad) {
		this.bonus = cantidad;
	}

	@Override
	public double getSueldo() {
		return super.getSueldo() + bonus;
	}

}
