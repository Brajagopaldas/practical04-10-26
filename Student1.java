import java.util.Scanner;

class Student1 
{
	String studentName;
	double mark1;
	double mark2;
	double mark3;
	double total;
	double percentage;

	public Student1(String name, double m1, double m2, double m3) {
		studentName = name;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}

	void total() {
		total = mark1 + mark2 + mark3;
		System.out.println("Total Marks  : " + total + " / 300");
	}

	void percentage() {
		percentage = (total / 300.0) * 100.0;
		System.out.println("Percentage   : " + percentage + "%");
	}

	void display() {
		System.out.println("\n--- Student Marksheet ---");
		System.out.println("Student Name : " + studentName);
		System.out.println("Subject 1    : " + mark1);
		System.out.println("Subject 2    : " + mark2);
		System.out.println("Subject 3    : " + mark3);

		total();
		percentage();

		if (percentage >= 40.0) {
			System.out.println("Result       : PASS");
		} else {
			System.out.println("Result       : FAIL");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name:");
		String name = sc.nextLine();

		System.out.println("Enter Marks in Subject 1:");
		double m1 = sc.nextDouble();

		System.out.println("Enter Marks in Subject 2:");
		double m2 = sc.nextDouble();

		System.out.println("Enter Marks in Subject 3:");
		double m3 = sc.nextDouble();

		Student1 s = new Student1(name, m1, m2, m3);

		s.display();

		sc.close();
	}
}