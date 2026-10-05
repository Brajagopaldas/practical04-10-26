import java.util.Scanner;

class Employee2 {
	int empId;
	String empName;
	double salary;

	public Employee2(int id, String name, double sal) {
		empId = id;
		empName = name;
		salary = sal;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Monthly Salary: Rs. " + salary);
	}

	void ySalary() {
		double ySalary = salary * 12;
		System.out.println("Yearly Salary : Rs. " + ySalary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID:");
		int empId = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter Employee Name:");
		String empName = sc.nextLine();

		System.out.println("Enter Monthly Salary:");
		double salary = sc.nextDouble();

		Employee2 obj = new Employee2(empId, empName, salary);

		obj.display();
		obj.ySalary();

		sc.close();
	}
}