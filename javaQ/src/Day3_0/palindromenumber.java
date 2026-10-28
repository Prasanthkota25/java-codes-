package Day3_0;

import java.util.Scanner;

public class palindromenumber {
	static class palindromeThread extends Thread {
		String s;

		palindromeThread(String s) {
			this.s = s;
		}

		public void run() {
			try {
				String rev = "";
				for (int i = s.length() - 1; i >= 0; i--) {
					rev = rev + s.charAt(i);
				}
				if (s.equals(rev)) {
					System.out.println("it is Palindrome Number");
				} else {
					System.out.println("it is not a Palindrome Number ");
				}
			} catch (Exception e) {
				System.out.println("Error ..." + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Name :  ");
			String input = sc.next();
			palindromeThread t = new palindromeThread(input);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error :" + e);
		} finally {
			sc.close();
		}

	}
}
