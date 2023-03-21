package EjerciciosClaseU12;

public class AppGestorTareas {

	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica();
		TPAviso tpa = new TPAviso("Estudiar tema de herencia", 2);
		while (!tp.necesitaEjecucion()) {
			System.out.println("Esperando la ejecucion de la tarea peridoca...");
			tp.ejecutarTarea();
		}
		while (!tp.necesitaEjecucion()) {
			System.out.println("Esperando ejecucion de aviso...");
			System.out.println("Aviso: " + tpa.leerMensaje());
		}

	}
}
