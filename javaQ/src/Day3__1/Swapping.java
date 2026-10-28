package Day3__1;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Value A : ");
		int a = sc.nextInt();
		System.out.println("Value B : ");
		int b = sc.nextInt();

		if (a != b) {
			int temp = a;
			a = b;
			b = temp;

		} else {
			System.out.println("Same  Values ....");
		}

		System.out.println("A Value : " + a);
		System.out.println("B Value : " + b);

	}
}
