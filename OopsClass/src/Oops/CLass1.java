package Oops;

public class CLass1 {

	static class Car {
		String brand;
		int Speed;

		void display() {
			System.out.println("Car brand " + brand + "Speed " + Speed);
		}
	}

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.brand = "honda";
		myCar.Speed = 120;

		myCar.display();

	}

}
