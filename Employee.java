import java.util.Scanner;

class Employee 
{
	int empId;
	String empName;
	double basicSalary;

	
	public Employee(int id, String name, double salary) {
		empId = id;
		empName = name;
		basicSalary = salary;
	}

	
	void display() {
		double annualSalary = basicSalary * 12;

		System.out.println("\n======================");
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Monthly Salary: Rs. " + basicSalary);
		System.out.println("Annual Salary : Rs. " + annualSalary);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();

		System.out.println("Enter Basic Monthly Salary:");
		double salary = sc.nextDouble();

		Employee emp = new Employee(id, name, salary);

		emp.display();

		sc.close();
	}
}