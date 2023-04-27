package EjerciciosClaseU14.EjerExcepciones;

public class DNI_Incorrecto {

	public static void main(String[] args) {
		int dni = 0;
		if (dni >= 8) {
			System.out.println("El DNI tiene mas de ocho cifras");
		} else {
			System.out.println("El DNI no tiene mas de ocho cifras");
		}
	}

}
