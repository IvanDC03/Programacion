package EjerciciosClaseU10;

public class JugadorMain {

	public static void main(String[] args) {
		Jugador messi = new Jugador("messi",10,Posiciones.DELANTERO,);
		Jugador casillas = new Jugador("casillas",6,Posiciones.PORTERO);
		Jugador iniesta = new Jugador("Iniesta",4,Posiciones.DEFENSA);
		System.out.println(messi.toString());
		System.out.println(casillas.toString());
		System.out.println(iniesta.toString());
	}

}
