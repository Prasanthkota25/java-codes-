package Day3_0;

import java.util.Scanner;

public class SwappingNumber {
	static class Data {
		int a, b;

		Data(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	static class swappingThread extends Thread {
		Data data;

		swappingThread(Data data) {
			this.data = data;
		}

		public void run() {
			try {
				synchronized (data) {
					data.a = data.a + data.b;
					data.b = data.a - data.b;
					data.a = data.a - data.b;

					System.out.println("A : " + data.a);
					System.out.println("B : " + data.b);
				}
			} catch (Exception e) {
				System.out.println("Error..." + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number A: ");
			int a = sc.nextInt();
			System.out.println("Enter the number  B: ");
			int b = sc.nextInt();
			Data data = new Data(a, b);
			swappingThread t = new swappingThread(data);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error ...." + e);
		} finally {
			sc.close();
		}
	}
}
