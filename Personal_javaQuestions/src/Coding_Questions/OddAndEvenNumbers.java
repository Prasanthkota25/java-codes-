package Coding_Questions;

import java.util.Scanner;

public class OddAndEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Even Number ");
			} else {
				System.out.println(i + " Odd Number ");
			}
		}

	}

}
