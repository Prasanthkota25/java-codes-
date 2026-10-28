package javapatterns;

public class allpattrens {

	public static void main(String[] args) {

//		String s = "prasanth";
//		int n = s.length();

//		for (int i = 0; i < n + 1; i++) {
//			System.out.println(s.substring(0, i));
//		}
//		System.out.println("");

		/* reverse */

//		for (int i = n; i > 0; i--) {
//
//			System.out.println(s.substring(0, i));
//		}
//		System.out.println("");

		/* Star (* ) */

//		int n = 5;
//		for (int i = 0; i < n + 1; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* Star (* ) reverse */

//		int n = 5;
//		for (int i = n; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* abc */

//		int n = 5;
//		for (int i = 0; i < n + 1; i++) {
//			char ch = 'A';
//			for (int j = 0; j < i; j++) {
//				System.out.print(ch);
//				ch++;
//			}
//			System.out.println("");
//		}

		/* 123 */

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}
}
