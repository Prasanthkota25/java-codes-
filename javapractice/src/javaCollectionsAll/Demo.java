package javaCollectionsAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		Comparator<Integer> c = new Comparator<Integer>() {

			public int compare(Integer i, Integer j) {

				if (i % 10 > j % 10) {
					return 1;
				} else {
					return -1;
				}
			}

		};
		List<Integer> nums = new ArrayList<>();

		nums.add(5);
		nums.add(22);
		nums.add(11);
		nums.add(34);
		nums.add(13);

		// sorting
		Collections.sort(nums, c);
		System.out.println(nums);

	}
}
