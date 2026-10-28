package Class1;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int m = 0; m < i + 1; m++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
