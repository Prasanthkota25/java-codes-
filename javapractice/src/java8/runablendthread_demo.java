package java8;
//

//class Y implements Runnable {
//	public void run() {
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("Hi ...");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}	
//}

class N implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello ...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class runablendthread_demo {
	public static void main(String[] args) {

		// Anonymous Function
		Runnable obj = new Runnable() {

			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("Hi ...");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		// lamda Function

		Runnable obj1 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello ...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj1);

		t.start();
		t1.start();

	}
}
