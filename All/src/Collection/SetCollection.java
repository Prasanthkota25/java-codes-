package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String[] args) {
		Set<Integer> num = new TreeSet<Integer>();
		num.add(5);
		num.add(10);
		num.add(55);
		num.add(200);
		num.add(25);

		Iterator<Integer> valus = num.iterator();

		while (valus.hasNext()) {
			System.out.println(valus.next());
		}

//		for (int n : num) {
//			System.out.println(n);
//		}
//		System.out.println(num);

	}
}
