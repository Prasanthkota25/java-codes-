package javaCollectionsAll;

import java.util.HashMap;
import java.util.Map;

public class map_Example {
	public static void main(String[] args) {

		Map<String, Integer> students = new HashMap<>();

		students.put("prasanth", 25);
		students.put("Bhavi", 23);
		students.put("Anil", 24);
		students.put("ravi", 30);
		students.put("shiva", 32);

		System.out.println(students.keySet());

		for (String name : students.keySet()) {
			System.out.println(name + " : " + students.get(name));
		}

	}
}
