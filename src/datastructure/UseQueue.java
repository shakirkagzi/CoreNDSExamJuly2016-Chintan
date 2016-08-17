package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Number 1");
		queue.add("Number 2");
		queue.add("Number 3");
		queue.add("Number 4");
		queue.add("Number 5");
		queue.add("Number 6");
		queue.add("Number 7");
		queue.add("Number 8");
		queue.add("Number 9");
		queue.add("Number 10");


		System.out.println("Current Element in Queue: "+queue.peek());
		System.out.println("First Element in Queue :"+queue.element());
		System.out.println("Total Elements in Queue:"+queue.size());
		System.out.println("Poll in Queue: "+queue.poll());
		System.out.println("Removing Element from Queue: "+queue.remove());
		System.out.println("After Removing Element in Queue :"+queue.peek());


	}
}

