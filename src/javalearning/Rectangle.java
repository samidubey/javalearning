package javalearning;

public class Rectangle {
	 private double length;
	 private double width;
	 private String colour;
	 
	 
	public  Rectangle(double length, double width, String colour)
	{
		this.length = length;
		this.width = width;
		this.colour = colour;
   }
	
	public double area()
	{
		return length*width;
	}

	 public static boolean isSame(Rectangle object1, Rectangle object2) {
			
		if (object1.getLength() == object2.getLength() && object1.getWidth() == object2.getWidth()&& object1.getColour().equals(object2.getColour()))
		{
			return true;
		}
		else
		{
		 return false;
		}
	 }
	 public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}



}
