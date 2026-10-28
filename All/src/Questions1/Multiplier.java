package Questions1;

import java.util.Scanner;

public class Multiplier {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int result = n * i;
			System.out.println(n + "X" + i + "=" + result);
		}
		sc.close();

	}
}
