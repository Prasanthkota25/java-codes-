//: The Employee Payroll System ......

public class Employeepayrollsystem {
	static class Employee {
		String name;

		Employee(String name) {
			this.name = name;
		}

		void calculateSalary() {
			System.out.println("Calculating salary...");
		}
	}

	static class FullTimeEmployee extends Employee {
		double monthlySalary;

		FullTimeEmployee(String name, double monthlySalary) {
			super(name);
			this.monthlySalary = monthlySalary;
		}

		@Override
		void calculateSalary() {
			System.out.println(name + " Salary: " + monthlySalary);
		}
	}

	static class ContractEmployee extends Employee {
		double hourRate;
		int workHours;

		ContractEmployee(String name, double hourlyRate, int hoursWorked) {
			super(name);
			this.hourRate = hourlyRate;
			this.workHours = hoursWorked;
		}

		@Override
		void calculateSalary() {
			System.out.println(name + " Salary:  " + (hourRate * workHours));
		}
	}

	public static void main(String[] args) {

		Employee[] myEmp = new Employee[2];

		myEmp[0] = new FullTimeEmployee("prasanth ", 500000);
		myEmp[1] = new ContractEmployee("ravi ", 50, 600);

		for (Employee emp : myEmp) {
			emp.calculateSalary();

		}

	}
}
