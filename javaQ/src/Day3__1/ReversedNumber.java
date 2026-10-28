package Day3__1;

import java.util.Scanner;

public class ReversedNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  : ");
		int n = sc.nextInt();
		int temp = n;
		int reversed = 0;
		while (temp > 0) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			temp /= 10;
		}
		System.out.println("Reversed Number is  : " + reversed);
	}
}
