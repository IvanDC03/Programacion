package EjerciciosClaseU6;

import java.util.Scanner;

public class InvertirLista {

	public static void main(String[] args) {
		//PEDIR AL USUARIO 5 NOMBRES Y LOS GUARDAMOS EN UN ARRAYLIST

		//CREAMOS UNA FUNCIÓN QUE INVERTir LOS NOMBRES

		//EJEMPLO: LUIS ALEX ALEJANDRO JUAN GONZALO

		//SALIDA: GONZALO JUAN ALEJANDRO ALEX LUIS

		ArrayList nombres = new ArrayList();

		Scanner sc = new Scanner(System.in);

		for(int i =0; i<5; i++) {

		System.out.println("Introduce un nombre");

		//nombres.add(sc.next());

		}

		System.out.println(nombres);

		nombres = invertir(nombres);

		System.out.println(nombres);

		}

		private static ArrayList invertir(ArrayList nombres) {
		// TODO Auto-generated method stub
		return null;
	}

		public static ArrayList invertir1(ArrayList nombres){

		ArrayList resultado = new ArrayList();

		//for(int i = nombres.size()-1; i>=0; i--) {

		//resultado.add(nombres.get(i));

		//}

		return resultado;

		}

	}
