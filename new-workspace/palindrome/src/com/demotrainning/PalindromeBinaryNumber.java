package com.demotrainning;

import java.util.Scanner;

public class PalindromeBinaryNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int num = sc.nextInt();

		String binary = Integer.toBinaryString(num);

		System.out.println("Binary form of number: " + binary);

		String reversed = "";
		for (int i = binary.length() - 1; i >= 0; i--) {
			reversed += binary.charAt(i);
		}

		if (binary.equals(reversed)) {
			System.out.println("The binary representation is a palindrome.");
		} else {
			System.out.println("The binary representation is not a palindrome.");
		}

		
	}
}
