import java.util.Scanner;

class Calculator 
{
	double num1;
	double num2;

	public Calculator(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}

	void add() {
		double result = num1 + num2;
		System.out.println("Addition       : " + result);
	}

	void sub() {
		double result = num1 - num2;
		System.out.println("Subtraction    : " + result);
	}

	void mul() {
		double result = num1 * num2;
		System.out.println("Multiplication : " + result);
	}

	void div() {
		if (num2 != 0) {
			double result = num1 / num2;
			System.out.println("Division       : " + result);
		} else {
			System.out.println("Division       : Cannot divide by zero");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		double n1 = sc.nextDouble();

		System.out.println("Enter second number:");
		double n2 = sc.nextDouble();

		Calculator obj = new Calculator(n1, n2);

		System.out.println("\n--- Calculator Results ---");
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

		sc.close();
	}
}
