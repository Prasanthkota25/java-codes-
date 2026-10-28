package Function;

import java.util.Scanner;

public class Fun {

	static void Hello(int a, int b) {

		System.out.println(a + b);
	}

	static void checkage(int age) {
		if (age < 18) {
			System.out.println("low  age");
		} else {
			System.out.println("hign age ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Hello(a, b);

		int age = sc.nextInt();
		checkage(age);
	}
}
