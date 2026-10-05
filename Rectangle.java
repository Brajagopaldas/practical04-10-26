import java.util.Scanner;

class Rectangle 
{
	double length;
	double breadth;

	public Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}

	void Area() {
		double area = length * breadth;
		System.out.println("Area of Rectangle      : " + area);
	}


	void Perimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length of Rectangle:");
		double l = sc.nextDouble();

		System.out.println("Enter Breadth of Rectangle:");
		double b = sc.nextDouble();

		Rectangle obj = new Rectangle(l, b);

		System.out.println("\n--- Rectangle Results ---");
		obj.Area();
		obj.Perimeter();

		sc.close();
	}
}