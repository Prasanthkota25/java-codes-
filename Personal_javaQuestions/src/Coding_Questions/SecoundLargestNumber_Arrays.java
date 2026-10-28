package Coding_Questions;

import java.util.Arrays;

public class SecoundLargestNumber_Arrays {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 5, 3, 15, 20 };
//
//		Arrays.sort(arr);
//		System.out.println("Secound largest Number  : " + arr[arr.length - 2]);

		Arrays.sort(arr);
		int n = arr.length;
		int largest = arr[n - 1];
		int secoundlarge = Integer.MIN_VALUE;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != largest) {
				secoundlarge = arr[i];
				break;
			}
		}
		if (secoundlarge == Integer.MIN_VALUE) {
			System.out.println("There is Secound_largest Number ....");
		} else {
			System.out.println("Secound_largest Number  is : " + secoundlarge);
		}

	}
}
