package javalearning;

public class AccountDemo {

	public static void main(String args[]) {
		Account acc = new Account("Sam", 1234, "Hyderabad", "Saving", 25000);
		Account acc1 = new Account("Sam", 1234, 25);
		System.out.printf("First Method Current Balance - %.0f\n", acc1.getBalance());
		System.out.printf("Second Method Current Balance - %.0f\n", acc.getBalance());

		System.out.printf("Current Balance - %.0f\n", acc.deposit(500));

		System.out.printf("Current Balance - %.0f\n", acc.withdraw(500));
	}
}
