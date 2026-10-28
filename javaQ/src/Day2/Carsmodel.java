package Day2;

public class Carsmodel {

	String cars(String Colour, String Carname) {
		return Colour + Carname;
	}

	int cars(int Carscount, int Carnumbers) {
		return Carscount + Carnumbers;
	}

	public static void main(String[] args) {
		Carsmodel obj = new Carsmodel();
		System.out.println(obj.cars("Colour : " + "Black ", "Carname :" + "Honda"));
		System.out.println(obj.cars("Carscount :" + "1 ", "CarNumber :" + " AP 16 bz2525"));
	}

}
