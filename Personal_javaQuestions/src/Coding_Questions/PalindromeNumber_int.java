package Coding_Questions;

import java.util.Scanner;

public class PalindromeNumber_int {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		int original = n;
		int reversed = 0;
		while (n > 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n /= 10;
		}
		if (original == reversed) {
			System.out.println("it is palindrome Number ");
		} else {
			System.out.println("it is not a palindrome Number ");
		}
	}
}
