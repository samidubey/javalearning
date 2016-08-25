package javalearning;

public class PrintUsingFor {
	public static void main(String[] args)
	{
	   System.out.println("first pattern ");	
	   PrintUsingFor1();
		System.out.println("Second pattern ");	
		PrintUsingForOposite();
		System.out.println("Third pattern ");
		PrintUsingForSame();
	}
	public static void PrintUsingFor1()
	{
	  for (int i=1;i<=5; i++)
	  {
		  for (int j=1;j<=i;j++)
		  {
			  System.out.print(j+" ");		 
		  }
		System.out.println("");
	  }
	 }
	public static void PrintUsingForOposite()
	{
		 for (int i=1;i<=5; i++)
		  {
			  for (int j=5;j>=i;j--)
			  {
				  System.out.print(j+" ");		 
			  }
			System.out.println("");
		  }
	}
	public static void PrintUsingForSame()
	{
		 for (int i=1;i<=5; i++)
		  {
			  for (int j=1;j<=i;j++)
			  {
				  System.out.print(i+" ");		 
			  }
			System.out.println("");
		  }
	}
	
}
