package Oops;

public class Inheritance {

	static class Animal {
		void Shouting() {
			System.out.println("Animal is Shouting ");
		}
	}

	static class Birds extends Animal {
		void Flying() {
			System.out.println("Flying ....");
		}
	}

	public static void main(String[] args) {

		Birds B = new Birds();
		B.Shouting();
		B.Flying();
	}

}
