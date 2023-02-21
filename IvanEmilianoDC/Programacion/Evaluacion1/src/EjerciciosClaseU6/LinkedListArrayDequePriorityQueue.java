package EjerciciosClaseU6;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListArrayDequePriorityQueue {

	public static void main(String[] args) {
		ArrayDeque <Integer> colaArrayDeque = new ArrayDeque<>();

		LinkedList <Integer> colaLinkedList = new LinkedList<>();

		PriorityQueue <Integer> colaPriority = new PriorityQueue<>();

		//añadir elementos dos elementos a principio

		colaArrayDeque.offer(100);

		colaArrayDeque.offer(50);

		colaArrayDeque.offer(120);

		colaLinkedList.offer(100);

		colaLinkedList.offer(50);

		colaLinkedList.offer(120);

		colaPriority.offer(100);

		colaPriority.offer(50);

		colaPriority.offer(120);

		//imprimirColas(colaArrayDeque, colaLinkedList, colaPriority);

		//DEVOLVEMOS EL PRIMER ELEMENTO

		System.out.println();

		System.out.println("PRIMER ELEMENTO DEQUE: " + colaArrayDeque.peek());

		System.out.println("PRIMER ELEMENTO LINKEDLIST: " + colaLinkedList.peek());

		System.out.println("PRIMER ELEMENTO PRIORITY: " + colaPriority.peek());

		//VOLVEMOS A IMPRIMIR

		//imprimirColas(colaArrayDeque, colaLinkedList, colaPriority);

		//SACAMOS EL PRIMER ELEMENTO DE CADA LISTA

		System.out.println("SACAMOS 1ER ELEMENTO DEQUE:" + colaArrayDeque.poll());

		System.out.println("SACAMOS 1ER ELEMENTO LINKED:" + colaLinkedList.poll());

		System.out.println("SACAMOS 1ER ELEMENTO PRIORITY:" + colaPriority.poll());

		//VOLVEMOS A IMPRIMIR

		    ///imprimirColas(colaArrayDeque, colaLinkedList, colaPriority);

		   //DEVOLVEMOS EL ÚLTIMO ELEMENTO

		    System.out.println("DEVOLVEMOS ULTIMO ELEMENTO DEQUE:" + colaArrayDeque.getLast());

		System.out.println("DEVOLVEMOS ULTIMO ELEMENTO LINKED:" + colaLinkedList.getLast());

		// System.out.println("SACAMOS ULTIMO ELEMENTO PRIORITY:" + colaPriority.getLast()); 

		  //SACAMOS EL ÚLTIMO ELEMENTO

		    System.out.println("SACAMOS ULTIMO ELEMENTO DEQUE:" + colaArrayDeque.pollLast());

		System.out.println("SACAMOS ULTIMO ELEMENTO LINKED:" + colaLinkedList.pollLast());

		// System.out.println("SACAMOS ULTIMO ELEMENTO PRIORITY:" + colaPriority.pollLast());  

		//VOLVEMOS A IMPRIMIR

		   //imprimirColas(colaArrayDeque, colaLinkedList, colaPriority);

		 

		//añadimos un elemento nulo al final

		//System.out.println("AÑADIMOS ULTIMO ELEMENTO DEQUE:" + colaArrayDeque.offerLast(null));

		System.out.println("AÑADIMOS ULTIMO ELEMENTO LINKED:" + colaLinkedList.offerLast(null));

		// System.out.println("AÑADIMOS ULTIMO ELEMENTO PRIORITY:" + colaPriority.pollLast());  

		//VOLVEMOS A IMPRIMIR

		   //imprimirColas(colaArrayDeque, colaLinkedList, colaPriority);

		//SACAMOS LOS ELEMENTOS DE CADA LISTA

		System.out.print("\nSACAMOS ELEMENTOS DE ARRAY DEQUE: ");

		    while (!colaArrayDeque.isEmpty())

		      System.out.print(colaArrayDeque.poll() + "-");

		   System.out.print("\nSACAMOS ELEMENTOS DE LINKED LIST: ");

		    while (!colaLinkedList.isEmpty())

		      System.out.print(colaLinkedList.poll() + "-");

		   System.out.print("\nSACAMOS ELEMENTOS DE PRIORITY: ");

		    while (!colaPriority.isEmpty())

		      System.out.print(colaPriority.poll() + "-");

		  //VOLVEMOS A IMPRIMIR

		    //imprimirColas(colaArrayDeque, colaLinkedList, colaPriority);

		}

		public static void imprimirColas(Queue<Integer> a, Queue<Integer> b, Queue<Integer> c) {

		System.out.println();

		    System.out.println();

		    System.out.println("ARRAY DEQUE:" + a);  

		    System.out.println("COLA LINKED LIST:" + b);

		    System.out.println("PRIORITY:" + c);

		    System.out.println();

		}

	}