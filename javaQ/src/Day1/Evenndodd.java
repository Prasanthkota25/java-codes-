package Day1;

public class Evenndodd {
	public static void main(String[] args) {

		int n = 20;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "-Even ");
			} else {
				System.out.println(i + "-odd");
			}
		}
	}
}
