package javalearning;

public class RectangleDemo {
public static void main(String[] args)
{

	Rectangle rect = new Rectangle( 4, 5,  "White");

    Rectangle rect1 = new Rectangle(4, 6, "White");
    
    rect1.equals(rect1,rect);
    rect.equals(rect1,rect);
    boolean result = rect1.equals(rect, rect1);
    boolean result1 =   rect1.equals(rect1,rect);
	
	System.out.println(result);
	System.out.println(result1);
	System.out.println(rect.area());
}
}
