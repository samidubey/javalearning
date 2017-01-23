package com.examples;

import java.util.Scanner;

public class MarksAverageWithUserInput {
    public static void main(String[] args) {
        marksAverageWithUserInputs();
    }

    public static void marksAverageWithUserInputs() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter All six course number:");
        float course1 = in.nextFloat();
        float course2 = in.nextFloat();
        float course3 = in.nextFloat();
        float course4 = in.nextFloat();
        float course5 = in.nextFloat();
        float course6 = in.nextFloat();

        float average;
        Float percentage;
        average = (course1 + course2 + course3 + course4 + course5 + course6) / 600;
        percentage = average * 100;
        System.out.println(average);
        System.out.println(percentage + "%");
    }
}
