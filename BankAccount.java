import java.util.Scanner;

class BankAccount {
	String accountHolder;
	double balance;

	public BankAccount(String name, double bal) {
		accountHolder = name;
		balance = bal;
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Deposited    : Rs. " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		} else if (amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance = balance - amount;
			System.out.println("Amount Withdrawn    : Rs. " + amount);
		}
	}

	void checkBalance() {
		System.out.println("\n-------------------");
		System.out.println("Account Holder      : " + accountHolder);
		System.out.println("Current Balance     : Rs. " + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Holder Name:");
		String name = sc.nextLine();

		System.out.println("Enter Opening Balance:");
		double bal = sc.nextDouble();

		BankAccount obj = new BankAccount(name, bal);

		System.out.println("Enter Amount to Deposit:");
		double depAmount = sc.nextDouble();
		obj.deposit(depAmount);

		System.out.println("Enter Amount to Withdraw:");
		double withAmount = sc.nextDouble();
		obj.withdraw(withAmount);

		obj.checkBalance();

		sc.close();
	}
}