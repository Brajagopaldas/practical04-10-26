import java.util.Scanner;

class Employee {
	String empName;
	double salary;
	int rating;
	double bonus;

	public Employee(String name, double sal, int r) {
		empName = name;
		salary = sal;
		rating = r;
	}

	void calculateBonus() {
		if (rating == 5) {
			bonus = salary * 0.20; 
		} else if (rating == 4) {
			bonus = salary * 0.15; 
		} else if (rating == 3) {
			bonus = salary * 0.10; 
		} else {
			bonus = 0.0;
		}
	}

	void display() {
		calculateBonus();

		System.out.println("\n-------------------");
		System.out.println("Employee Name      : " + empName);
		System.out.println("Monthly Salary     : Rs. " + salary);
		System.out.println("Performance Rating : " + rating + " / 5");
		System.out.println("Bonus Amount       : Rs. " + bonus);
		System.out.println("Total Payout       : Rs. " + (salary + bonus));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();

		System.out.println("Enter Monthly Salary:");
		double sal = sc.nextDouble();

		System.out.println("Enter Performance Rating (1 to 5):");
		int r = sc.nextInt();

		Employee obj = new Employee(name, sal, r);

		obj.display();

		sc.close();
	}
}
