import java.util.Scanner;

class Electricity {
	String customerName;
	double units;

	public Electricity(String name, double u) {
		customerName = name;
		units = u;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Units Consumed : " + units);
	}

	void calculateBill(double ratePerUnit) {
		double totalBill = units * ratePerUnit;
		System.out.println("Rate per Unit  : Rs. " + ratePerUnit);
		System.out.println("Total Bill     : Rs. " + totalBill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name:");
		String name = sc.nextLine();

		System.out.println("Enter Units Consumed:");
		double u = sc.nextDouble();

		System.out.println("Enter Rate per Unit:");
		double rate = sc.nextDouble();

		Electricity obj = new Electricity(name, u);

		obj.display();
		obj.calculateBill(rate);

		sc.close();
	}
}