package Questions;

import java.util.ArrayList;
import java.util.Collection;

public class All {
	public static void main(String[] args) {
		Collection<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(6);

		for (Object n : num) {
			int nu = (Integer) n;
			System.out.println(nu * 2);
		}
	}
}
