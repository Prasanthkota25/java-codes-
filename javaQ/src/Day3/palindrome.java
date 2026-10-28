package Day3;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");

		try {
			String s = sc.next();
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				rev += s.charAt(i);
			}
			if (s.equals(rev)) {
				System.out.println("it is palindrome");
			} else {
				System.out.println("it is not a palindrome");
			}
		} catch (Exception e) {
			System.out.println("Error " + e);
		} finally {
			sc.close();
		}
	}
}
