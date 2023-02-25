package EjerciciosClaseU9;

public class Mundo {

	public static void main(String[] args) {
//Creamos dos humanos 
		Humano Mario = new Humano("Mario",20,70,80);
		Humano Maria = new Humano("Maria",25,55,1.66);
		Maria.toString();
		Mario.toString();
		Mario.cumplirAños();
		Mario.cambiarPeso(-5);
		Maria.cambiarPeso(2);
		Mario.cambiarEstatura(0.05);
	System.out.println(Mario.toString());
	System.out.println(Maria.toString());
	}

}
