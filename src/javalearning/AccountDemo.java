package javalearning;

public class AccountDemo {

	public static void main(String args[]) {
		Account acc = new Account("Sam", 1234, "Hyderabad", "Saving");
		Account acc1 = new Account("Sam", 1234, 1000);
		System.out.printf("Second Method Current Balance - %.0f\n", Account.getBalance(acc1));
		System.out.printf("Current Balance withdrawal - %.0f\n", Account.withdraw(acc1, 500));
		System.out.printf("Current Balance deposite - %.0f\n", Account.deposit(acc1, 1000));

		System.out.printf("getBalance - %.0f\n", Account.getBalance(acc1));

	}
}
