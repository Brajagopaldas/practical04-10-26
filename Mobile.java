import java.util.Scanner;

class Mobile 
{
	String brand;
	String model;
	double price;

	
	public Mobile(String b, String m, double p) {
		brand = b;
		model = m;
		price = p;
	}

	
	void display() {
		System.out.println("\n-------------------");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : Rs. " + price);
	}

	
	void checkPrice() {
		if (price > 20000) {
			System.out.println("Above Rs. 20,000");
		} else {
			System.out.println(" Below Rs. 20,000");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Mobile Brand:");
		String brand = sc.nextLine();

		System.out.println("Enter Mobile Model:");
		String model = sc.nextLine();

		System.out.println("Enter Mobile Price:");
		double price = sc.nextDouble();

		Mobile obj = new Mobile(brand, model, price);

		obj.display();
		obj.checkPrice();

		sc.close();
	}
}