package javalearning.rectangle;

public class Rectangle {

    private double length;
    private double width;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this(length, width, "");
    }

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double area() {
        return length * width;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
