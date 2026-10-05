import java.util.Scanner;

class Book 
{
	String title;
	String author;
	double price;

	public Book(String t, String a, double p) {
		title = t;
		author = a;
		price = p;
	}

	void display() {
		System.out.println("Book Title  : " + title);
		System.out.println("Author Name : " + author);
		System.out.println("Price       : Rs. " + price);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book Title:");
		String title = sc.nextLine();

		System.out.println("Enter Author Name:");
		String author = sc.nextLine();

		System.out.println("Enter Book Price:");
		double price = sc.nextDouble();

		Book b = new Book(title, author, price);

		b.display();

		sc.close();
	}
}