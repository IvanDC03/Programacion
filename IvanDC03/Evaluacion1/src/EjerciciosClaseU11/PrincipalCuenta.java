package EjerciciosClaseU11;

import java.util.Date;
import java.util.Scanner;

public class PrincipalCuenta {

	public static void main(String[] args) {
Cliente cliente1 = new Cliente("Alberto","Perez","Madrid","Las Rozas");
Cuenta cuenta1 = new Cuenta(101245022428168L,0.01f,cliente1);
Cuenta.Movimiento mov = cuenta1.new Movimiento(new Date(), 'I', 250F);

	
	}

}
