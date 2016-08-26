package javalearning;

public class Rectangle {
	 double length;
	 double width;
	 String colour;
	 double area;
	 
	 public Rectangle()
	 {
		 
	 }
	
	public  Rectangle(double length, double width, String colour)
	{
		length = this.length;
		width = this.width;
		colour = this.colour;
   }
	
	public double area(double length, double width)
	{
		return length*width;
	}

	 public boolean equals(Rectangle object1, Rectangle object2) {
			
		if (object1.getLength() == object2.getLength() && object1.getWidth() == object2.getWidth())
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
