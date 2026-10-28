package java8;

import java.util.Scanner;

public class All {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the number : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum " + n + "is:" + sum);

	}
}
