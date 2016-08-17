package datastructure;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("John");
		ob.add("Nahreen");
		ob.add("Kaya");
		ob.add("Sohan");
		ob.add("Jawad");
		ob.add("Asef");
		ob.add("John");

		//System.out.println(ob);
		System.out.println(ob.get(2));
		ob.add("New_Student");
		System.out.println(ob);
		System.out.println("Removing Sohan From List"+ob.remove(2));

		//ob.clear();
		System.out.println(ob);
		System.out.println(ob.indexOf("Student5"));
		System.out.println(ob.size());
		ob.add(1, "Shakir");
		System.out.println(ob);

		for (Object student : ob) {
			System.out.println(student);
		}
		System.out.println("Previous Students Database: " + ob.size());
		ob.remove(3);
		System.out.println("Students' database updated.");
		for (Object student : ob) {
			System.out.println(ob);
		}
		Iterator it = ob.iterator();
		System.out.println("List of Students: ");

		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		System.out.println("After database has been published: " + ob.size());

	}
}


