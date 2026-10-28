package java8;

class Q extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi ..");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class F extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello ...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Sleepandpriority {
	public static void main(String[] args) {
		Q obj = new Q();
		F obj1 = new F();
		obj.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj1.start();
	}
}
