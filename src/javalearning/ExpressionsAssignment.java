package javalearning;

public class ExpressionsAssignment {
    public static void main(String[] args)
     {
    	expressions();
     }
    
    public static void expressions()
    {
    	int a = 10;
    	int b = 5;
    	int result1;
    	boolean result2;
    	int result3;
    	int result4;
    	
        result1 = (a<<2)+(b>>2);
        System.out.println(result1);
        
        result2 = ((a!=0) || (b > 0));
        System.out.println(result2);
        
        result3 = (a + b * 100)/10;
        System.out.println(result3);
        
        result4 = a&b;
        System.out.println(result4);
    
    }
 
}


