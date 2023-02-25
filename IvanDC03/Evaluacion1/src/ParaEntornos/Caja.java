package ParaEntornos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caja {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cant;
		double desc;
		double subtotal;
		double total;
		desc = 0;
		cant = Integer.parseInt(bufEntrada.readLine());
		subtotal = cant * 125;
		System.out.println("Este es el importe sin descuentos" + subtotal);
		if (cant > 1000) {
			desc = subtotal * 0.1;
		} else {
			if (cant > 100) {
				desc = subtotal * 0.5;
			}
		}
		total = subtotal - desc;
		System.out.println("El total de la compra es" + total + "Y le hemos aplicado un descuento de" + desc);
	}

}
