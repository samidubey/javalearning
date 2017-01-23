package com.examples;

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(4, 5, "White");

        Rectangle rect1 = new Rectangle(4, 6, "White");
        boolean result = Rectangle.isSame(rect, rect1);

        System.out.println("Rectangle 1 - Length[" + rect.getLength() + "], Width[" + rect.getWidth() + "], Color["
                + rect.getColour() + "]");
        System.out.println("Rectangle 2 - Length[" + rect1.getLength() + "], Width[" + rect1.getWidth() + "], Color["
                + rect1.getColour() + "]");

        if (result == true) {
            System.out.println("Compared Rectangle 1 and Rectangle 2 - Match");
        } else {
            System.out.println("Compared Rectangle 1 and Rectangle 2 - Mismatch");
        }

    }
}
