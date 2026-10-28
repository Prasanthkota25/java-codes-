package javaCollectionsAll;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_Example {
	public static void main(String[] args) {
//		Set<Integer> nums = new HashSet<Integer>();
//
//		nums.add(5);
//		nums.add(10);
//		nums.add(15);
//		nums.add(20);
//		nums.add(25);
//		nums.add(30);
//
//		for (int n : nums) {
//			System.out.println(n);
//		}

		// for Sorted values ....

//		Set<Integer> nums = new TreeSet<Integer>();
//
//		nums.add(10);
//		nums.add(20);
//		nums.add(15);
//		nums.add(25);
//		nums.add(30);
//		nums.add(10);
//
//		for (int n : nums) {
//			System.out.println(n);
//		}

		Collection<Integer> nums = new TreeSet<Integer>();

		nums.add(10);
		nums.add(20);
		nums.add(15);
		nums.add(25);
		nums.add(30);
		nums.add(10);

		Iterator<Integer> values = nums.iterator();

		while (values.hasNext()) {
			System.out.println(values.next());
		}
//		for (int n : nums) {
//			System.out.println(n);
//		}
	}
}
