package java8;

@FunctionalInterface
interface B {
	void show();
}

public class Anonymous {
	public static void main(String[] args) {

		B hi = new B() {
			public void show() {
				System.out.println("Hey hi hello  ");
			}
		};
		hi.show();
	}
}
