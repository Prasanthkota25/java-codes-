package com.demotrainning;


import java.util.Scanner;

public class palindromenumberrange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("palindrome numbers  :");

		for (int i = num1; i<= num2; i++) {

			int n = i;
			int rev = 0;
			while (n > 0) {
				int digit = n % 10;
				rev = (rev * 10) + digit;
				n = n / 10;

			}
			if (rev == i) {
				System.out.println(i + "  ");
			}

		}

	}
}
