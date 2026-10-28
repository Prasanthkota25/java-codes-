package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();

		nums.add(5);
		nums.add(15);
		nums.add(55);
		nums.add(25);
		nums.add(10);

		Collections.sort(nums);
		System.out.println(nums);

	}
}
