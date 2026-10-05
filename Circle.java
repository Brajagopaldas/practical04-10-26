import java.util.Scanner;

class Circle {
	double radius;

	public Circle(double r) {
		radius = r;
	}

	void area() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle          : " + area);
	}

	void circumference() {
		double circumference = 2 * 3.14 * radius;
		System.out.println("Circumference of Circle : " + circumference);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius of Circle:");
		double r = sc.nextDouble();

		Circle obj = new Circle(r);

		System.out.println("\n-------------------");
		obj.area();
		obj.circumference();

		sc.close();
	}
}