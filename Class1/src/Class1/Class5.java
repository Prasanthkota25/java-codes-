package Class1;

import java.util.Scanner;

public class Class5 {
	public static void main(String[] args) {

		int a = 5;
		byte b = 2;
		short c = 1;
		long d = 20l;
		double e = 30d;
		float f = 40f;
		char g = 98;
		boolean h = true;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num:");

		int age = sc.nextInt();
		System.out.println("u r age is " + age);

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i * 5);
		}

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		int a1 = 0;
		do {
			System.out.println(a1);
			a1++;
		} while (a1 < 10);
		System.out.println("Happy");

	}
}
