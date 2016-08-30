package javalearning;

public class AccountDemo {

	public static void main(String args[]) {
		Account acc = new Account("Sam", 1234, "Hyderabad", "Saving", 25000);
		Account acc1 = new Account("Sam", 1234, 25);
		System.out.println(acc.getBalance());
		System.out.println(acc1.getBalance());

		System.out.println("Current Balance - " + acc.deposit(500));
		System.out.println("Current Balance - " + acc.withdraw(500));
	}
}
