package Questions;

import java.util.Scanner;

public class reversednumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int reversed = 0;
		int temp = n;
		while (temp != 0) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			temp /= 10;
		}
		System.out.println(" reversed : " + reversed);

	}
}
