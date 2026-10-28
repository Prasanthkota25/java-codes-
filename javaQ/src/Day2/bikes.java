package Day2;

abstract class bikes {

	abstract void Start();

	void Run() {
		System.out.println("Bike runing through petrol");
	}

	static class Ktm extends bikes {
		@Override
		void Start() {
			System.out.println("Ktm bike Starts with Key.... ");
		}
	}

	public static void main(String[] args) {
		bikes mybike = new Ktm();
		mybike.Start();
		mybike.Run();
	}
}
