package javaCollectionsAll;

import java.util.Arrays;
import java.util.List;

public class need_of_Stream_api_Example {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

		// normal way of for loop...
//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}

		// enhanced for loops
//		for (int n : nums) {
//			System.out.println(n);
//		}

		// For Each way ...

		nums.forEach(n -> System.out.println(n));

//		int sum = 0;
//		for (int n : nums) {
//			if (n % 2 == 0) {
//				n = n * 2;
//				sum = sum + n;
//			}
//		}
//
//		System.out.println(sum);
	}
}
