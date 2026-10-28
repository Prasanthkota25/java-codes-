package Questions1;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		long Factorial = 1;
		for (int i = 1; i <= n; i++) {
			Factorial = Factorial * i;
		}
		System.out.println(" Factorial :  " + Factorial);

	}
}
