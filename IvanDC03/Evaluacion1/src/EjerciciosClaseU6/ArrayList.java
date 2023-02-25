package EjerciciosClaseU6;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		ArrayList numeros = rellenaArrayList1();

		System.out.println("La suma del arraylist es " + sumaArray(numeros));

		}

		private static String sumaArray(ArrayList numeros) {
		// TODO Auto-generated method stub
		return null;
	}

		private static ArrayList rellenaArrayList1() {
		// TODO Auto-generated method stub
		return null;
	}

		public static ArrayList rellenaArrayList(){

		Scanner sc = new Scanner(System.in);

		ArrayList numeros = new ArrayList();

		int numero=0;

		for (int i = 0; i < 10; i++) {

		System.out.println("Introduce el elemento " + (i+1));

		numero = sc.nextInt();

		numeros.add(numero);

		}

		System.out.println(numeros);

		return numeros;

		}

		private void add(int numero) {
			// TODO Auto-generated method stub
			
		}

		public static int sumaArray1(ArrayList nums) {

		int suma = 0;

		for (int i = 0; i < nums.size(); i++) {

		//suma += nums.get(i); //suma = suma + nums.get(i);

		}

		return suma;

		}

		int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void add(String next) {
			// TODO Auto-generated method stub
			
		}

		public String get(int i) {
			// TODO Auto-generated method stub
			return null;
		}

	}