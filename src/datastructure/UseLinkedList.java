package datastructure;
import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> list = new LinkedList<String>();

		list.add("NY");
		list.add("FL");
		list.add("AZ");
		list.add("JAPAN");
		list.add("INDIA");
		list.add("BANGLADESH");
		list.add("Sweden");
		list.add("Brazil");


		System.out.println(list + " ");
		list.remove("JAPAN");
		System.out.println("After Removing JAPAN From List: ");
		System.out.println("Elements are in List: "+list + " ");
		System.out.println("list.peek(): "+list.peek() + " ");
		System.out.println("list.peekFirst(): "+list.peekFirst() + " ");
		System.out.println("list.peekLast(): "+list.peekLast() + " ");

		Iterator<String> iterator = list.listIterator();
		System.out.println("Retriving List Data Using Iterator while loop..");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("Retriving List data using for for loop...");
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext(); ) {
			System.out.print(iterator2.next() + " ");
		}
	}

}
