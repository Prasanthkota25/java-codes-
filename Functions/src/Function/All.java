package Function;

import java.util.Scanner;

public class All {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.next();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("it is palindrome ");
		} else {
			System.out.println("its not a palindrome ");
		}
	}

}
