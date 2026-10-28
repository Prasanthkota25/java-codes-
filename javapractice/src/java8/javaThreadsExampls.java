package java8;

class hi extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hey hi ...");
		}
	}
}

class hello extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello hi .....");
		}
	}
}

public class javaThreadsExampls {
	public static void main(String[] args) {
		hi t = new hi();
		hello t1 = new hello();

		t.start();
		t1.start();
	}
}
