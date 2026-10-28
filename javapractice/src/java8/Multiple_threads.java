package java8;

class P extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi...");
		}
	}
}

class H extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello ...");
		}
	}
}

public class Multiple_threads {
	public static void main(String[] args) {

		P t = new P();
		H t1 = new H();

		t.start();
		t1.start();
	}
}
