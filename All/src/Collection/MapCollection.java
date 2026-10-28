package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {
		Map<String, Integer> Students = new HashMap<>();

		Students.put("Prasanth", 25);
		Students.put("Ravi", 29);
		Students.put("AnilKumar", 25);
		Students.put("shiva", 30);
		Students.put("shiva", 35);

		System.out.println(Students.keySet());

	}
}
