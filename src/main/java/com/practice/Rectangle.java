package com.practice;

import java.util.Objects;

public class Rectangle {
	private double width;
	private double length;
	private double area;
	private String colour;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double calculateArea() {
		area = getLength() * getWidth();
		return area;
	}

	@Override
	public boolean equals(Object rect) {
		if (rect == this)
			return true;
		if (!(rect instanceof Rectangle)) {
			return false;
		}
		Rectangle rect1 = (Rectangle) rect;
		return area == rect1.area && Objects.equals(colour, rect1.colour);
	}
}
