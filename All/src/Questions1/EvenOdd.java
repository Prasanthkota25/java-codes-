package Questions1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number : " + i);
			} else {
				System.out.println("Odd  Number : " + i);
			}
		}
	}
}
