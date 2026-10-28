package Day2;

public class Cars {

	void Start() {
		System.out.println("Car is Starts with Key ....");
	}

	static class Bmw extends Cars {
		@Override
		void Start() {
			System.out.println("BMW operating with remote sensor Key ...");
		}
	}

	public static void main(String[] args) {
		Cars Mycar;
		Mycar = new Bmw();
		Mycar.Start();
	}
}
