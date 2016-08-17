package datastructure;


import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		////// Using Map
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Class1", "X");
		map1.put("Class2", "Y");
		map1.put("Class3", "Z");

//        System.out.println(map.get("Class1"));
//        System.out.println(map.get("Class2"));

		for (Map.Entry<String, String> entry:map1.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		////using ListMap
		List<String> studentsOfClass1 = new ArrayList<>();
		studentsOfClass1.add("X1");
		studentsOfClass1.add("X2");
		studentsOfClass1.add("X3");


		List<String> studentsOfClass2 = new ArrayList<>();
		studentsOfClass2.add("Y1");
		studentsOfClass2.add("Y2");
		studentsOfClass2.add("Y3");



		List<String> studentsOfClass3 = new ArrayList<>();
		studentsOfClass3.add("Z1");
		studentsOfClass3.add("Z2");
		studentsOfClass3.add("Z3");

		Map<String, List<String>> map = new LinkedHashMap<>();
		map.put("Class1", studentsOfClass1);
		map.put("Class2", studentsOfClass2);
		map.put("Class3", studentsOfClass3);
		map.remove("Class1", studentsOfClass1);

		System.out.println("Using for Loop");
		for (Map.Entry<String, List<String>> entry:map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("Using while loop");
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry data = (Map.Entry)it.next();
			System.out.println(data.getKey()+" : "+data.getValue());
		}
	}

}
