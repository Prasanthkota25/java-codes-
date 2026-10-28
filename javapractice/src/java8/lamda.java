package java8;

@FunctionalInterface
interface A {
	void Show();
}

public class lamda {
	public static void main(String[] args) {

		A mya = ()  -> System.out.println("its my Show");
		mya.Show();
	}
}
