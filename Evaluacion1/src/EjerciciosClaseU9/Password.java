package EjerciciosClaseU9;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Password {
    /*Haz una clase llamada Password que siga las siguientes condiciones:

	Que tenga los atributos longitud y contraseña . 
	
	Un constructor con la longitud que nosotros le pasemos. 
	Generara una contraseña aleatoria con esa longitud.
	
	Los métodos que implementa serán:
	esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe 
	tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
	
	generarPassword():  genera la contraseña del objeto con la longitud que tenga.
	
	Método get para contraseña y longitud.
	Método set para longitud.
	
	
	Crea una clase clase principal:

	Crea un array de Passwords con el tamaño que tu le indiques por teclado.
	Crea un bucle que cree un objeto para cada posición del array.
	Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte.
	Muestra la contraseña y si es o no fuerte */

	//ATRIBUTOS
	private int longitud;
	private String contrasena;
	
	//CONSTRUCTOR
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrasena = generaPassword();
	}
	
	//MÉTODOS
	public String generaPassword() {
		String password = "";
		
		for(int i=0; i<longitud;i++) {
			
			int eleccion = (int)(Math.random()*3+1);
			
			if(eleccion ==1) {
				//sacamos una minúscula al azar
				char minusculas = (char)((int)((Math.random()*(123-97)+97)));
				password+=minusculas;
			}
			else {
				if(eleccion == 2) {
					//mayúsculas
					char mayusculas = (char)((int)((Math.random()*(91-65)+65)));
					password+=mayusculas;
				}
				else {
					char numeros = (char)((int)((Math.random()*(58-48)+48)));
					password+=numeros;
				}
			}
		}
		
		return password;
	}
	
	public boolean esFuerte() {
		int contNumeros=0;
		int contMinusculas = 0;
		int contMayusculas = 0;
		
		for(int i=0; i<contrasena.length();i++) {
			if(contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122)
				contMinusculas++;
			else if (contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90)
				contMayusculas++;
			else
				contNumeros++;
		}
		
		if(contNumeros>=5 && contMinusculas>=1 && contMayusculas>=2) {
			return true;
		}
		else
			return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}


}
