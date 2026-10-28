package Class1;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		int a = 10;
		byte b = 5;
		short c = 2;
		long d = 10l;
		double e = 20d;
		float f = 40f;
		char g = 'B';
		boolean h = true;

		String[] Names = { "Ravi", "Siva", "Prasanth", "vamis" };

		for (String Name : Names) {
			System.out.println(Name);
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i * 5);
		}

		var Myname = 5;
		var Myname1 = 6;

		System.out.println(age);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		System.out.println(Names.length);

		System.out.println(Myname + Myname1);
		System.out.println(Myname * Myname1);
		System.out.println(Myname - Myname1);
		System.out.println(Myname / Myname1);

	}
}
