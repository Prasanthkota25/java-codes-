package Day1;

import java.util.Scanner;

public class allQ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");

		int num = sc.nextInt();

		/* Even-Odd */

//		for (int i = 0; i <= num; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + "-Even");
//			} else {
//				System.out.println(i + "-Odd");
//			}
//		}

		/* factorial */

//		long factorial = 1;
//		for (int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//		}
//		System.out.println("factorial num " + num + "is:" + factorial);
//		sc.close();

		/* multiplication */

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num + "X" + i + "=" + (i * num));
//		}

		/* Count to back */

//		for (int i = num; i >= 0; i -= 5) {
//			System.out.println(i);
//		}

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("sun of the num " + num + " is: " + sum);

	}
}
