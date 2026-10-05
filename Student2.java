import java.util.Scanner;

class Student2 {
	String studentName;
	int rollNumber;
	String department;

	public Student2(String name, int roll, String dept) {
		studentName = name;
		rollNumber = roll;
		department = dept;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Student Name : " + studentName);
		System.out.println("Roll Number  : " + rollNumber);
		System.out.println("Department   : " + department);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name:");
		String studentName = sc.nextLine();

		System.out.println("Enter Roll Number:");
		int rollNumber = sc.nextInt();
		sc.nextLine(); // Clear buffer

		System.out.println("Enter Department:");
		String department = sc.nextLine();

		Student2 obj = new Student2(studentName, rollNumber, department);

		obj.display();

		sc.close();
	}
}