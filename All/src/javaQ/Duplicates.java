package javaQ;

public class Duplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 30, 50, 40, 60, 40 };
		System.out.println("Duplicate elements are :");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);

				}
			}
		}
	}
}
