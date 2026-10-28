package javapractice;

public class Arrays {
	public static void main(String[] args) {
		int a = 1;
		int b[] = new int[10];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;

		System.out.println(a);
		for (int i = 0; i <= 4; i++) {
			System.out.println(b[i]);
		}

		for (int i : b) {
			System.out.println(i);
		}

	}
}