package javalearning;
import java.util.Scanner;

public class MarksAverageWithUserInput {
	public static void main(String[] args)
	{
		marksAverageWithUserInputs();
	}
	public static void marksAverageWithUserInputs()
	   {
		   float course1;
		   float course2; 
		   float course3; 
		   float course4;
		   float course5;
		   float course6;
		   float average;
		   Float percentage;
		   Scanner in = new Scanner(System.in);
		   System.out.println("Enter course1 number");
		   course1 = in.nextFloat();
		   System.out.println("You course1 "+course1);
		   System.out.println("Enter course2 number");
		   course2 = in.nextFloat();
		   System.out.println("You course2 "+course2);
		   System.out.println("Enter course3 number");
		   course3 = in.nextFloat();
		   System.out.println("You course3 "+course3);
		   System.out.println("Enter course4 number");
		   course4 = in.nextFloat();
		   System.out.println("You course4 "+course4);
		   System.out.println("Enter course5 number");
		   course5 = in.nextFloat();
		   System.out.println("You course5 "+course5);
		   System.out.println("Enter course6 number");
		   course6 = in.nextFloat();
		   System.out.println("You course6 "+course6);
		   
		   average = (course1 + course2 + course3 + course4 + course5 + course6)/600;
		   percentage = average*100;
		   System.out.println(average);
		   System.out.println(percentage+"%");
	   }
}
