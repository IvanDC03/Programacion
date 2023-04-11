package ActividadesComplementariasEntornos;

public class Actividad2 {

	public static void main(String[] args) {
		//throws IOException {
	}
			
/*			int numero;
			System.out.println("Introduzca un numero: ");
			int numero;
			System.out.println(procesarnumero(numero));
		}*/

		public static int procesarnumero(int num) {
			int respuesta = 0;
			if (num % 2 == 0) {
				if (num > 10) {
					if (num < 100) {
						respuesta = 5;
					} else {
						respuesta = 4;
						respuesta = 3;
					}
				} else {
					if (num >= 0) {
						respuesta = 2;
					} else {
						respuesta = 1;
					}
				}
			}
			return respuesta;
		
	


	
	}

}
