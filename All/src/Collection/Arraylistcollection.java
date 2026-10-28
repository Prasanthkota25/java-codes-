package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylistcollection {
	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(10);
		nums.add(55);
		nums.add(20);
		nums.add(25);

		for (int n : nums) {
			int num = (Integer) n;
			System.out.println(n);
		}

//		System.out.println(nums);
	}
}
