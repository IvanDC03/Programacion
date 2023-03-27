package EjerciciosClaseU13;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalInmueble {

	static Scanner sc = new Scanner(System.in);
	
	public static int menu(String titulo, String opcion1, String opcion2) {
		
		System.out.println("*** MENU " + titulo + " ***");
		System.out.println("1. Crear " + opcion1);
		System.out.println("2. Crear " + opcion2);
		System.out.println("Introduce una opcion:");
		int opcion = sc.nextInt();
		return opcion;
		
	}
	
	public static int menuPrincipal() {
		System.out.println("*** MENU INMUEBLE ***");
		System.out.println("1. Crear Inmueble Vivienda");
		System.out.println("2. Crear Local");
		System.out.println("3. Salir");
		System.out.println("Introduce una opcion:");
		int opcion = sc.nextInt();
		return opcion;
	}
	
		
	public static void main(String[] args) {
		
		ArrayList <Inmueble> inmuebles = new ArrayList<>();
		
		int opInmueble = 0;
		while((opInmueble = menuPrincipal())!= 3) {
			if(opInmueble == 1) {
				int opVivienda = menu("Vivienda", "Casa", "Apartamento");
				
				if(opVivienda == 1) {
					int opCasa = menu("Casa", "Casa Rural", "Casa Urbana");
					
					if (opCasa == 2)
					{
						int opCasaUrb = menu("Casa Urbana", "Casa Conjunto Cerrada", "Casa Independiente");
						
						if (opCasaUrb == 2)
						{
							CasaIndependiente casaind = new CasaIndependiente(1, 250, "Av. del oeste, 23", 5, 3);
							inmuebles.add(casaind);
							opInmueble = menu("Inmuebles", "Inmueble Vivienda", "Local");
						}
					}
					
					else if (opCasa == 1)
					{
						CasaRural casarural = new CasaRural(2,500,"Urbanizacion Parque 22", 5,3, 500, 600);
						inmuebles.add(casarural);					
					}
				}
				else if(opVivienda == 2) {
					int opApartamento = menu("Apartamento", "Apartamento Familiar", "Apartaestudio");
				}
					
			}
			else if (opInmueble == 2) {
				int opLocal = menu("Local", "Comercial", "Oficina");
			}
		}
				
		for(Inmueble i: inmuebles)
		{
			if(i instanceof CasaIndependiente)
			{
				CasaIndependiente c = (CasaIndependiente)i;
				System.out.println("Valor compra: " + c.getValorCompra());
			}
			
			if(i instanceof CasaRural)
			{
				CasaRural c = (CasaRural)i;
				System.out.println("Nivel del mar: " + c.getAltitud());
			}
		}
		
		
			
	}

}
