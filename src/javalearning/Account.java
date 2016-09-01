package javalearning;

public class Account {

	String strAccHolderName;
	int intAccNumber;
	String strAddress;
	String strTypeOfAcc;
	double dblCurrentBalance;
	double dblIntAmount;

	public Account(String strAccHolderName, int intAccNumber, double dblIntAmount) {
		this.strAccHolderName = strAccHolderName;
		this.intAccNumber = intAccNumber;
		this.dblIntAmount = dblIntAmount;
	}

	public Account(String strAccHolderName, int intAccNumber, String strAddress, String strTypeOfAcc) {

		this.strAccHolderName = strAccHolderName;
		this.intAccNumber = intAccNumber;
		this.strTypeOfAcc = strTypeOfAcc;
		this.strAddress = strAddress;
	}

	public double deposit(double Amount) {

		return this.dblIntAmount += Amount;
	}

	public double withdraw(double Amount) {

		return this.dblIntAmount -= Amount;

	}

	public double getBalance() {
		return this.dblIntAmount;
	}

	public String getDetails() {
		return this.strAccHolderName + " " + this.strAddress + " " + this.intAccNumber + " " + this.strTypeOfAcc;
	}
}
