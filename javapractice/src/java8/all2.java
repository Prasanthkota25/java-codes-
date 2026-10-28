package java8;

@FunctionalInterface
interface Hello {
	public void show();

}

public class all2 {
	public static void main(String[] args) {
		Hello hi = () -> System.out.println("Hi Hello ");
		hi.show();
	}
}
