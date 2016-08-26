package javalearning;

public class RectangleDemo {
public static void main(String[] args)
{
	Rectangle rectCompare = new Rectangle();
    double length=4;
    double width=4;
    String colour= "red";
	Rectangle rect = new Rectangle(  length,  width,  colour);

    double length1 = 3;
    double width1 = 4;
    String colour1 = "white";
    Rectangle rect1 = new Rectangle(length1, width1, colour1);

    rect1.equals(rect1,rect);
    rect.equals(rect1,rect);
    boolean result = rectCompare.equals(rect, rect1);
    boolean result1 =   rectCompare.equals(rect1,rect);
	
	System.out.println(result);
	System.out.println(result1);
}
}
