package javalearning;

public class AccountDemo {

	public static void main(String args[])
	{
		Account acc = new Account("Sam", 1234,"Hyderabad","Saving", 25);
		acc.Get_Balance();
		Account acc1 = new Account("Sam", 1234, 25);
		acc1.Get_Balance();
		System.out.println(acc.Get_Balance());
		System.out.println(acc1.Get_Balance());
	}
}
