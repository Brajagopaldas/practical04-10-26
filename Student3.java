import java.util.Scanner;

class Student3 {
	String studentName;
	int rollNumber;
	double mark1;
	double mark2;
	double mark3;
	double mark4;
	double mark5;
	double total;
	double percentage;

	public Student3(String name, int roll, double m1, double m2, double m3, double m4, double m5) {
		studentName = name;
		rollNumber = roll;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		mark4 = m4;
		mark5 = m5;
	}

	void calculateTotal() {
		total = mark1 + mark2 + mark3 + mark4 + mark5;
		System.out.println("Total Marks    : " + total + " / 500");
	}

	void calculatePercent() {
		percentage = (total / 500.0) * 100.0;
		System.out.println("Percentage     : " + percentage + "%");
	}

	void checkPassFail() {
		if (mark1 < 40 || mark2 < 40 || mark3 < 40 || mark4 < 40 || mark5 < 40 || percentage < 40.0) {
			System.out.println("Result         : FAIL");
		} else {
			System.out.println("Result         : PASS");
		}
	}

	void calculateGrade() {
		if (mark1 < 40 || mark2 < 40 || mark3 < 40 || mark4 < 40 || mark5 < 40 || percentage < 40.0) {
			System.out.println("Grade          : Failed");
		} else if (percentage >= 80.0) {
			System.out.println("Grade          : Grade A");
		} else if (percentage >= 60.0) {
			System.out.println("Grade          : Grade B");
		} else {
			System.out.println("Grade          : Grade C");
		}
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Student Name   : " + studentName);
		System.out.println("Roll Number    : " + rollNumber);
		System.out.println("Subject 1 Marks: " + mark1);
		System.out.println("Subject 2 Marks: " + mark2);
		System.out.println("Subject 3 Marks: " + mark3);
		System.out.println("Subject 4 Marks: " + mark4);
		System.out.println("Subject 5 Marks: " + mark5);

		calculateTotal();
		calculatePercent();
		checkPassFail();
		calculateGrade();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name:");
		String name = sc.nextLine();

		System.out.println("Enter Roll Number:");
		int roll = sc.nextInt();

		System.out.println("Enter Marks in Subject 1:");
		double m1 = sc.nextDouble();

		System.out.println("Enter Marks in Subject 2:");
		double m2 = sc.nextDouble();

		System.out.println("Enter Marks in Subject 3:");
		double m3 = sc.nextDouble();

		System.out.println("Enter Marks in Subject 4:");
		double m4 = sc.nextDouble();

		System.out.println("Enter Marks in Subject 5:");
		double m5 = sc.nextDouble();

		Student3 obj = new Student3(name, roll, m1, m2, m3, m4, m5);

		obj.display();

		sc.close();
	}
}