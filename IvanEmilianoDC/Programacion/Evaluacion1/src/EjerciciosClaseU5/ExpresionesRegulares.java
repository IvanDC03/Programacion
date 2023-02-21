package EjerciciosClaseU5;

import java.util.Scanner;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*System.out.println("Introduce tu dni");

		String dni = sc.next();

		System.out.println(validarDNI(dni));*/

		//System.out.println(validarNombre("Jose Carlos"));

		System.out.println(validarNumero("6398"));

		}

		public static boolean validarDNI(String dni) {

		return dni.matches("^[0-9]{8}[A-Z]$");

		}

		public static boolean validarNombre(String nombre) {

		return nombre.matches("^([A-Z]{1}[a-z]+([ ]+)?){1,2}$");

		}

		public static boolean validarNumero(String numero) {

		return numero.matches("^([-]?){1}[0-9]{3}$");

		}

	}
