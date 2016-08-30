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

	public static double deposit(Account Acc, double Amount) {
		double deposite = 0;
		deposite = Acc.getDblIntAmount() + Amount;
		Acc.setDblIntAmount(deposite);
		return deposite;
	}

	public static double withdraw(Account Acc, double Amount) {
		double withdraw = 0;
		withdraw = Acc.getDblIntAmount() - Amount;
		Acc.setDblIntAmount(withdraw);
		return withdraw;

	}

	public static double getBalance(Account Acc) {
		return Acc.getDblIntAmount();
	}

	public String getStrAccHolderName() {
		return strAccHolderName;
	}

	public void setStrAccHolderName(String strAccHolderName) {
		this.strAccHolderName = strAccHolderName;
	}

	public int getIntAccNumber() {
		return intAccNumber;
	}

	public void setIntAccNumber(int intAccNumber) {
		this.intAccNumber = intAccNumber;
	}

	public String getStrAddress() {
		return strAddress;
	}

	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}

	public String getStrTypeOfAcc() {
		return strTypeOfAcc;
	}

	public void setStrTypeOfAcc(String strTypeOfAcc) {
		this.strTypeOfAcc = strTypeOfAcc;
	}

	public double getDblIntAmount() {
		return dblIntAmount;
	}

	public void setDblIntAmount(double dblIntAmount) {
		this.dblIntAmount = dblIntAmount;
	}

}
