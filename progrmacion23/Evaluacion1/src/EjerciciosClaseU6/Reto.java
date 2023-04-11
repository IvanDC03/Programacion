package EjerciciosClaseU6;

import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList lista = new ArrayList();

		int desde, hasta, multi;

		System.out.println("Introduzca el numero inicial");

		desde = sc.nextInt();

		System.out.println("Introduzca el numero final");

		hasta = sc.nextInt();

		System.out.println("Introduzca el multiplo");

		multi = sc.nextInt();

		for(int i=desde; i<=hasta;i++)

		//lista.add(i);

		//for(int i=0; i<lista.size();i++)

		{

		//if(lista.get(i)%multi!=0)

		//lista.set(i, 0);

		}

		System.out.println("Los múltiplos son " + lista);

		}
	
	}