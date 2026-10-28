package javaQ;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
//		int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		int[] arr = { 5, 6, 2, 3, 4, 1 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
