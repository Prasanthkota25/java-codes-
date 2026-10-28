package Day3;

import java.util.Scanner;

public class Swappingnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number A: ");
			int a = sc.nextInt();
			System.out.println("Enter the number  B: ");
			int b = sc.nextInt();

			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("A :" + a);
			System.out.println("B :" + b);
		} catch (Exception e) {
			System.out.println("Error ...." + e);
		} finally {
			sc.close();
		}
	}
}
