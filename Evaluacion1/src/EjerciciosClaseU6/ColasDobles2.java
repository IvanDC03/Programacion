package EjerciciosClaseU6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ColasDobles2 {

	public static void main(String[] args) {
/*creamos una lista generica de enteros 
 * creamos un linkedlist en el que guardamos la lista generica 
 * añadimos al principio ele elemento 2 a la linked
 * imprimimos
 * añadimos el elemento 1 al principio
 * añadimos alfinal el elemento 10
 * quitamos el primer elemento
 * quitamos el ultimo elemento 
 * quitamos el primer elemento 
 * quitamos el ultimo elemento 
 * imprimimos
 */
List<Integer> numeros = Arrays.asList(3,4,65,6,7,8);
LinkedList<Integer>lista = new LinkedList<>();		
System.out.println("Inicial: " +  lista);	
lista.addFirst(2);		
System.out.println(lista);		
lista.addLast(9);
System.out.println(lista);
lista.offerFirst(1);
System.out.println(lista);

		
	}

}
