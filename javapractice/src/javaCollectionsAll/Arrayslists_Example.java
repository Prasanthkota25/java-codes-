package javaCollectionsAll;

import java.util.ArrayList;
import java.util.List;

public class Arrayslists_Example {

	public static void main(String[] args) {
//		Collection<Integer> nums = new ArrayList<Integer>();
//
//		nums.add(5);
//		nums.add(10);
//		nums.add(15);
//		nums.add(20);
//
//		for (int n : nums) {
//			int num = (Integer) n;
//			System.out.println(num);
//		}

		List<Integer> nums = new ArrayList<Integer>();

		nums.add(5);
		nums.add(10);
		nums.add(15);
		nums.add(20);

//		for (int n : nums) {
//			int num = (Integer) n;
//			System.out.println(num);
//		}

		System.out.println(nums.indexOf(5));
		System.out.println(nums.get(2));
	}
}
