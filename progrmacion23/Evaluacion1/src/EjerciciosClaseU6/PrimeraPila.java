package EjerciciosClaseU6;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class PrimeraPila {

	public static void main(String[] args) {
/*Creamos una pila de tipo stack en que guardamos strings
 * Metemos 5 strings en la pila
 * Imprimimos el contenido de la pila
 */
Scanner sc = new Scanner(System.in);
Stack<String> pila = new Stack();		
for (int i = 0; i < 5; i++) {
System.out.println("Introduce una palabra: ");	
pila.push(sc.next());
}
/*while (!pila.isEmpty()) {
	System.out.println(pila.peek());
}*/
for (int i = 0; i < pila.size(); i++) {
	System.out.println(pila.get(i));
}
/*Creamos una pila de ArrayDeque
 * Agregar 5 elementos
 * Sacar el primer elemento
 * Sacar el primer elemento
 * Elimninar el primer elemento 
 * Eliminar el primer elemento
 * Sacar primer elemento
 */
ArrayDeque<Integer> nombres = new ArrayDeque();










		
	}

}
