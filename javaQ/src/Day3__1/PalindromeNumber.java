package Day3__1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");

		int n = sc.nextInt();
		int current = n;
		int reversed = 0;
		while (n > 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}

		if (current == reversed) {
			System.out.println("it is Palindrome Number ");
		} else {
			System.out.println("it is not a Palindrome Number ");
		}
		sc.close();
	}
}
