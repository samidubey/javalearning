package javalearning;

public class AccountDemo {

	public static void main(String args[]) {
		Account acc = new Account("Sam", 1234, "Hyderabad", "Saving");
		Account acc1 = new Account("Sam", 1234, 1000);
		System.out.printf("Second Method Current Balance - %.0f\n", acc1.getBalance());
		System.out.printf("Current Balance withdrawal - %.0f\n", acc1.withdraw(500));
		System.out.printf("Current Balance deposite - %.0f\n", acc1.deposit(1000));

		System.out.printf("getBalance - %.0f\n", acc1.getBalance());

	}
}
