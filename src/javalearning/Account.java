package javalearning;

public class Account {
	
	String strAccHolderName;
	int intAccNumber;
	String strAddress;
	String strTypeOfAcc;
	double dblCurrentBalance;
	double dblIntAmount;
	public Account(String strAccHolderName, int intAccNumber, int dblIntAmount)
	{
		this.strAccHolderName = strAccHolderName;
		this.intAccNumber = intAccNumber;
		this.dblIntAmount = dblIntAmount;
	}
	public Account(String strAccHolderName, int intAccNumber,String strAddress, String strTypeOfAcc, double dblCurrentBalance )
	{

		this.strAccHolderName = strAccHolderName;
		this.intAccNumber = intAccNumber;
		this.strTypeOfAcc = strTypeOfAcc;
		this.strAddress = strAddress;
		this.dblCurrentBalance = dblCurrentBalance;
	}
	
	public double Get_Balance()
	{
		return this.dblCurrentBalance;
	}


}
