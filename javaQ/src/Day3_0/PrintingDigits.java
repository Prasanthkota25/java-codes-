package Day3_0;

import java.util.Scanner;

public class PrintingDigits {
	static class printingdigitsThread extends Thread {
		String n;

		printingdigitsThread(String n) {
			this.n = n;
		}

		public void run() {
			try {
				for (int i = 0; i < n.length(); i++) {
					System.out.println(n.charAt(i));
				}

			} catch (Exception e) {
				System.out.println("Erro..." + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number :");
			String input = sc.next();
			printingdigitsThread t = new printingdigitsThread(input);
			t.start();

		} catch (Exception e) {
			System.out.println("Main Erro ..." + e);
		} finally {
			sc.close();
		}
	}
}
