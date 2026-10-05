import java.util.Scanner;

class Vehicle {
	String vehicleNumber;
	String model;
	double rentalPricePerDay;
	double totalAmount;
	double discountAmount;
	double finalAmount;

	public Vehicle(String vNo, String m, double price) {
		vehicleNumber = vNo;
		model = m;
		rentalPricePerDay = price;
	}

	void calculateRent(int days) {
		totalAmount = rentalPricePerDay * days;

	
		if (days > 5) {
			discountAmount = totalAmount * 0.15;
		} else {
			discountAmount = 0.0;
		}

		finalAmount = totalAmount - discountAmount;
	}

	void displayBill(int days) {
		calculateRent(days);

		System.out.println("\n-------------------");
		System.out.println("Vehicle Number      : " + vehicleNumber);
		System.out.println("Model               : " + model);
		System.out.println("Rental Rate per Day : Rs. " + rentalPricePerDay);
		System.out.println("Rental Days         : " + days);
		System.out.println("Total Amount        : Rs. " + totalAmount);
		System.out.println("Discount Amount     : Rs. " + discountAmount);
		System.out.println("Final Payable Rent  : Rs. " + finalAmount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Vehicle Number:");
		String vNo = sc.nextLine();

		System.out.println("Enter Model:");
		String model = sc.nextLine();

		System.out.println("Enter Rental Price per Day:");
		double price = sc.nextDouble();

		System.out.println("Enter Number of Rental Days:");
		int days = sc.nextInt();

		Vehicle obj = new Vehicle(vNo, model, price);

		obj.displayBill(days);

		sc.close();
	}
}