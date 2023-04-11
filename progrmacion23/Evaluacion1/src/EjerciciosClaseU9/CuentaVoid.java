package EjerciciosClaseU9;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaVoid {

	public static void main(String[] args) {
		Scanner cuenta = new Scanner(System.in);
		Cuenta c = new Cuenta("123890023", "Miguel Perez", 1800.4F, (float) 0.25);
		Cuenta d = new Cuenta("123890023", "Antonio Gomez", 1800.4F, (float) 0.25);
		Cuenta e = new Cuenta("123890023", "Javier Sanchez", 1800.4F, (float) 0.25);
		System.out.println("HACEMOS INGRESO EN CUENTA");
		c.ingreso(300);
		d.ingreso(200);
		e.ingreso(100);
		System.out.println("saldo de la cuenta " + c.getNumero() + ": " + c.leerSaldo());
		System.out.println("saldo de la cuenta " + d.getNumero() + ": " + d.leerSaldo());
		System.out.println("saldo de la cuenta " + e.getNumero() + ": " + e.leerSaldo());
		System.out.println("Sacamos dinero de cada cuenta");
		c.reintegro(1000);
		d.reintegro(100);
		e.reintegro(50);
		System.out.println("saldo de la cuenta " + c.getNumero() + ": " + c.leerSaldo());
		System.out.println("saldo de la cuenta " + d.getNumero() + ": " + d.leerSaldo());
		System.out.println("saldo de la cuenta " + e.getNumero() + ": " + e.leerSaldo());
		System.out.println("Cuenta " + c.getNumero() + "Esta en rojo?" + c.enrojos());
		System.out.println("Cuenta " + d.getNumero() + "Esta en rojo?" + d.enrojos());
		System.out.println("Cuenta " + e.getNumero() + "Esta en rojo?" + e.enrojos());
/*ArrayList<Cuenta> cuentas = new ArrayList(); 
for (int i = 0; i < cuentas.size(); i++) {
	System.out.println("Hola" + cuentas.get(i).getTitular() + "cuanto quiers ingresar");
float ingreso = c.nextFloat();
}*/



	}

}
