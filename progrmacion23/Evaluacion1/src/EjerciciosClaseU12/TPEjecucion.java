package EjerciciosClaseU12;

public class TPEjecucion extends TareaPeriodica {
	private String cmd;

	public TPEjecucion(int periodoSegs, String cmd) {
		super(periodoSegs);
		this.cmd = cmd;
	}

	public String LeerCmd() {
		return cmd;
	}
}
