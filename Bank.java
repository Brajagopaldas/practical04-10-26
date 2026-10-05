import java.util.Scanner;

class Bank {
	String accountHolder;
	long accountNumber;
	double balance;

	public Bank(String name, long acc, double bal) {
		accountHolder = name;
		accountNumber = acc;
		balance = bal;
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Deposited : Rs. " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Current Balance: Rs. " + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Holder Name:");
		String name = sc.nextLine();

		System.out.println("Enter Account Number:");
		long accNo = sc.nextLong();

		System.out.println("Enter Balance:");
		double bal = sc.nextDouble();

		Bank obj = new Bank(name, accNo, bal);

		System.out.println("Enter Amount to Deposit:");
		double depositAmount = sc.nextDouble();

		obj.deposit(depositAmount);
		obj.display();

		sc.close();
	}
}