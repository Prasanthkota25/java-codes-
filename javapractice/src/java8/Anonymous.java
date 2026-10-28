package java8;

@FunctionalInterface

interface B {

	void Show();
}

public class Anonymous {

	public static void main(String[] args) {
		B mya = new B() {
			public void Show() {
				System.out.println("hi ");
			}
		};
		mya.Show();
	}
}
