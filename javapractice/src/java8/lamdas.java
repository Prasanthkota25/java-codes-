package java8;

//@FunctionalInterface

//interface B {
//	void show(int i);
//}
//
//public class lamdas {
//
//	public static void main(String[] args) {
//
//		B my = i -> System.out.println(i);
//		my.show(5);
//
//	}
//}

@FunctionalInterface
interface C {
	int Show(int i, int j);
}

public class lamdas {
	public static void main(String[] args) {
		C myint = new C() {
			public int Show(int i, int j) {
				return i + j;
			}
		};

		int result = myint.Show(5, 10);
		System.out.println(result);

	}
}