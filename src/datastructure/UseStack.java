package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Stack stack = new Stack();
		stack.push("Mumbai");
		stack.push("New York");
		stack.push("Paris");
		stack.push("Rio");
		stack.push("London");
		stack.push("Tokyo");

		System.out.println("Elements are in Stack: "+stack);
		System.out.println("Remove Element From Stack: "+stack.pop());

		System.out.println("After Removing Element From Stack: "+stack);
		System.out.println("Adding an Element in Stack..");
		stack.push("Madrid");
		System.out.println("Elements are in Stack: "+stack);
		System.out.println("Current Element in Stack: "+stack.peek());
		System.out.println("Elements are in Stack: "+stack);

		System.out.println(stack.search("Paris"));



	}
}