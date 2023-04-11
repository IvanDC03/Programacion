package EjerciciosClaseU12;

public class TPAviso extends TareaPeriodica {
	private String msg;

	public TPAviso(String msg, int periodoSegs) {
		super(periodoSegs);
		this.msg = msg;
	}

	public String leerMensaje() {
		return msg;
	}
}
