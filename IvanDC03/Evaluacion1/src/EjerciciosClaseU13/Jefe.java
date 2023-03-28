package EjerciciosClaseU13;

import EjerciciosClaseU12.Empleado;

public class Jefe extends Empleado implements Jefatura {



	public Jefe(String nombre, String apellidos, int sueldo2, int antiguedad2) {
		super(nombre, apellidos, sueldo2, antiguedad2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tomarDecisones() {
		
		return null;
	}

	@Override
	public String AsistirAReuniones() {
		
		return null;
	}

	@Override
	public String HacerEntrevistas() {
		
		return null;
	}

}
