package Encapsulation;

public class Main {

	public static void main(String[] args) {

		employee e = new employee();
		e.setName("prasanth");
		e.setId(1);
		e.setSalary(350000);

		System.out.println("name :" + e.getName());
		System.out.println("Id :" + e.getId());
		System.out.println("salary :" + e.getSalary());

	}

}
