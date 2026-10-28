package Day3;

import java.util.Scanner;

public class PrintingDigitsnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String n = sc.next();
		try {
			for (int i = 0; i < n.length(); i++) {
				System.out.println(n.charAt(i));
			}
		} catch (Exception e) {
			System.out.println("Error... " + e);
		} finally {
			sc.close();
		}
	}

}
