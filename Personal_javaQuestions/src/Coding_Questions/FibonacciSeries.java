package Coding_Questions;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :  ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			int temp = a + b;
			a = b;
			b = temp;
		}
		sc.close();
	}

}
