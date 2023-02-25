package Actividad;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		PruebaCuentaCorriente cc = new PruebaCuentaCorriente();
		cc.imposicion(200);
		cc.reIntegro(300);
		System.out.println(cc.getSaldo());
	}

}
