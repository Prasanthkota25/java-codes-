package com.demotrainning;

import java.util.Scanner;

public class Ksumpalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int k = sc.nextInt();

		System.out.println("palindrome num");
		int count = 0;
		int sum = 0;

		for (int i = 10; count < k; i++) {

			int n = i;
			int rev = 0;
			while (n > 0) {
				int digit = n % 10;
				rev = (rev * 10) + digit;
				n = n / 10;

			}
			if (rev == i && String.valueOf(i).length() % 2 == 0) {

				System.out.println(i);

				sum += i;
				count++;
			}

		}
		System.out.println("Sum of " + k + " even-length palindrome numbers: " + sum);

	}

}