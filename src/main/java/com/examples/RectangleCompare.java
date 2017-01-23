package com.examples;

import java.util.Scanner;

public class RectangleCompare {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        RectangleComprision();
    }

    public static void RectangleComprision() {
        System.out.println("Enter for Rectangle1 details:");
        double Rect1_area;
        String Rect1_colour = set_colour();
        double Rect1_length = set_length();
        double Rect1_width = set_width();
        Rect1_area = Rect1_length * Rect1_width;
        sc.reset();
        System.out.println("Enter for Rectangle2 details:");
        double Rect2_area;
        String Rect2_colour = set_colour();
        double Rect2_length = set_length();
        double Rect2_width = set_width();
        Rect2_area = Rect2_length * Rect2_width;
        if (Rect1_area == Rect2_area & Rect1_colour.equals(Rect2_colour)) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Not Matching Rectangles");
        }

    }

    public static double set_length() {
        double length;
        System.out.println("Insert length:");
        length = sc.nextDouble();
        return length;

    }

    public static double set_width() {
        double width;
        System.out.println("Insert Width:");
        width = sc.nextDouble();
        return width;

    }

    public static String set_colour() {
        String colour;
        System.out.println("Insert Colour:");
        colour = sc.next();
        return colour;

    }

}
