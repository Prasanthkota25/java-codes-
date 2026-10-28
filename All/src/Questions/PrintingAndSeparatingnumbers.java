package Questions;

import java.util.Scanner;

public class PrintingAndSeparatingnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String n = sc.next();
		for (int i = 0; i < n.length(); i++) {
			System.out.println(n.charAt(i));
		}

	}
}
