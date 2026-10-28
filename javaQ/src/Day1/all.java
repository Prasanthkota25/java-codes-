package Day1;

import java.util.Scanner;

public class all {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number :");

//		int num = sc.nextInt();
//
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(num + "X" + i + "=" + (num * i));
//		}

//		int num = sc.nextInt();
//		long factorial = 1;
//
//		for (int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//		}
//		System.out.println("factorial number " + num + "is:" + factorial);

//		int num = sc.nextInt();
//		for (int i = num; i >= 0; i -= 5) {
//			System.out.println(i);
//		}

//		int num = sc.nextInt();
//
//		for (int i = 0; i <= num; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + "-Even");
//			} else {
//				System.out.println(i + "-Odd");
//			}
//		}

		int n = 5;

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}
}
