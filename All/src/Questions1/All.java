package Questions1;

import java.util.Scanner;

public class All {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = 6;
		int sum = n * (n + 1) / 2;
		for (int num : arr) {
			sum -= num;
		}
		System.out.println("Missing Array " + sum);

	}
}
