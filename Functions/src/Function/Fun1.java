package Function;

import java.util.Scanner;

public class Fun1 {
	static int Mysum(int a, int b) {
		return a + b;
	}

	static void Mysums(int a1, int b2) {
		System.out.println(a1 + b2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Mysum(a, b);
		System.out.println(c);

		int a1 = sc.nextInt();
		int b2 = sc.nextInt();
		Mysums(a1, b2);

	}
}