package EjerciciosClaseU11;

public class PrincipalCantantes {

	public static void main(String[] args) {

		// 2 discos
		Disco disco1 = new Disco("Disco pepin", 2020, 20, 12);
		Disco disco2 = new Disco("Disco carlitos", 2019, 22, 15);

		// canciones
		Cancion c1 = new Cancion("Pin pon es un muÃ±eco", 3);
		Cancion c2 = new Cancion("Pin pon se va a la granja", 3);
		Cancion c3 = new Cancion("Pin pon en la discoteca", 5);
		Cancion c4 = new Cancion("Pin pon y sus amigos", 4);

		disco1.anyadirCancion(c1);
		disco1.anyadirCancion(c2);
		disco2.anyadirCancion(c3);
		disco2.anyadirCancion(c4);

		// 2 cantantes
		Cantante cantante1 = new Cantante("Pepito", "Perez", "El pepe", 25, EstiloMusical.FLAMENCO, disco1);
		Cantante cantante2 = new Cantante("Carlitos", "Martinez", "El carlos", 33, EstiloMusical.TRAP, disco2);

		// imprimimos datos
		System.out.println(cantante1.imprimirDatos());
		System.out.println(cantante2.imprimirDatos());
	}
}
