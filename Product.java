import java.util.Scanner;

class Product {
	String productName;
	double price;
	int quantity;

	public Product(String name, double p, int q) {
		productName = name;
		price = p;
		quantity = q;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Product Name : " + productName);
		System.out.println("Price        : Rs. " + price);
		System.out.println("Quantity     : " + quantity);
	}

	void bill() {
		double totalBill = price * quantity;
		System.out.println("Total Bill   : Rs. " + totalBill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Name:");
		String name = sc.nextLine();

		System.out.println("Enter Product Price:");
		double p = sc.nextDouble();

		System.out.println("Enter Quantity:");
		int q = sc.nextInt();

		Product obj = new Product(name, p, q);

		obj.display();
		obj.bill();

		sc.close();
	}
}
