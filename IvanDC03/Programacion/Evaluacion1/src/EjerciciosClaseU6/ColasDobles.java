package EjerciciosClaseU6;

import java.util.ArrayDeque;

public class ColasDobles {

	public static void main(String[] args) {
int []listadoInicial = {1,2,3,4,5,6,7,8,9,10};
ArrayDeque<Integer> listadoFinal = new ArrayDeque<>();
int elemento = 0;
for (int i = 0; i < listadoInicial.length; i++) {
if (elemento%2==0) {
listadoFinal.addFirst(elemento);

listadoFinal.addLast(elemento);
}
System.out.println("Lista Final: " + listadoFinal);
	
	
}



	}
}
