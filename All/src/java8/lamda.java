package java8;

@FunctionalInterface
interface Hello {
	void show();
}

public class lamda {
	public static void main(String[] args) {
		Hello hi = () -> System.out.println("Hello hi ");
		hi.show();
	}
}
