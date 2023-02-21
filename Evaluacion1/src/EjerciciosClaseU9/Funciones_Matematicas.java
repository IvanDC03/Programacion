package EjerciciosClaseU9;

import java.util.Iterator;

public class Funciones_Matematicas {
	//1. ATRIBUTOS
	
		private String numero;
		
		//2. CONSTRUCTOR
		public Funciones_Matematicas(String numero) {
			this.numero=numero;
		}
		
		//3. MÉTODOS
		public boolean esCapicua() {
			StringBuilder numReves = new StringBuilder(numero);
			
			if(numero.equals(numReves.reverse().toString()))
				return true;
			else
				return false;
		}
		
		public String getNumero()
		{
			return numero;
		}
		
		public boolean esPrimo() {
			boolean primo = true;
			int num = Integer.parseInt(numero);
			
			for(int i=2; i<num; i++) {
				if(num%i==0)
				{
					primo = false;
					break;
				}
			}
			
			return primo;
		}
		
		public double potencia(int exp) {
			int num = Integer.parseInt(numero);
			return Math.pow(num, exp);
		}
		
		public int digitos() {
			return numero.length();
		}
	}

