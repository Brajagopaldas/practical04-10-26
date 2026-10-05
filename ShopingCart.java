import java.util.Scanner;

class ShoppingCart {
	String productName;
	double price;
	int quantity;
	double totalPrice;
	double discountAmount;
	double finalBill;

	public ShoppingCart(String name, double p, int q) {
		productName = name;
		price = p;
		quantity = q;
	}

	void calculateTotal() {
		totalPrice = price * quantity;
	}

	void applyDiscount(double discountPercent) {
		calculateTotal();
		discountAmount = (totalPrice * discountPercent) / 100.0;
		finalBill = totalPrice - discountAmount;
	}

	void display(double discountPercent) {
		applyDiscount(discountPercent);

		System.out.println("\n-------------------");
		System.out.println("Product Name : " + productName);
		System.out.println("Unit Price   : Rs. " + price);
		System.out.println("Quantity     : " + quantity);
		System.out.println("Total Price  : Rs. " + totalPrice);
		System.out.println("Discount (" + discountPercent + "%) : Rs. " + discountAmount);
		System.out.println("Final Bill   : Rs. " + finalBill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Name:");
		String name = sc.nextLine();

		System.out.println("Enter Price:");
		double price = sc.nextDouble();

		System.out.println("Enter Quantity:");
		int quantity = sc.nextInt();

		System.out.println("Enter Discount Percentage (%):");
		double discount = sc.nextDouble();

		ShoppingCart obj = new ShoppingCart(name, price, quantity);

		obj.display(discount);

		sc.close();
	}
}
