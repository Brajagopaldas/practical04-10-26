import java.util.Scanner;

class Car {
	String brand;
	String model;
	String fuel;

	public Car(String b, String m, String f) {
		brand = b;
		model = m;
		fuel = f;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Car Brand : " + brand);
		System.out.println("Model     : " + model);
		System.out.println("Fuel Type : " + fuel);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Car Brand:");
		String brand = sc.nextLine();

		System.out.println("Enter Car Model:");
		String model = sc.nextLine();

		System.out.println("Enter Fuel Type (Petrol/Diesel/Electric/CNG):");
		String fuel = sc.nextLine();

		Car obj = new Car(brand, model, fuel);

		obj.display();

		sc.close();
	}
}
