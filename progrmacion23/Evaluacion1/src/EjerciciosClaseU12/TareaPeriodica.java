package EjerciciosClaseU12;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TareaPeriodica {
	private int periodoSegs;
	private Date ultimaej;
	private boolean activa;

	public TareaPeriodica(int periodoSegs) {
		this.periodoSegs = periodoSegs;
		this.activa = true;
		actualizarReloj();
	}

	public TareaPeriodica() {
		this(1);
	}

	public void actualizarReloj() {
		ultimaej = new Date();
	}

	public boolean necesitaEjecucion() {
		if (!activa) {
			return false;
		}
		Calendar calProximaEjec = new GregorianCalendar();
		calProximaEjec.setTime(ultimaej);
		calProximaEjec.add(Calendar.SECOND, periodoSegs);
		Calendar calAhora = new GregorianCalendar();
		return (calProximaEjec.before(calAhora));
	}

	public void ejecutarTarea() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Ejecucion de tarea genérica!!!");
		}
	}

	public void activar() {
		activa = true;
	}

	public void desactivar() {
		activa = false;
	}
}
