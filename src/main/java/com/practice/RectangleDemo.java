package com.practice;

public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLength(20);
		rectangle1.setWidth(10);
		rectangle1.setColour("Red");
		System.out.println(rectangle1.calculateArea());

		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLength(20);
		rectangle2.setWidth(10);
		rectangle2.setColour("Red");
		System.out.println(rectangle2.calculateArea());

		System.out.println(rectangle1.equals(rectangle2));

		if (rectangle1.equals(rectangle2)) {
			System.out.println("Matching Rectangles");
		} else {
			System.out.println("Non matching Rectangle");
		}
	}
}
