package Day3__1;

import java.util.Scanner;

public class PrintingDigits_And_separatingDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int reversed = 0;
		int temp = n;

		while (reversed > 0) {
			int digit = reversed % 10;
			System.out.println(digit);
			reversed = reversed / 10;
		}

		while (temp > 0) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			temp = temp / 10;
		}
		System.out.println(reversed);
	}

}
