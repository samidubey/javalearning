package com.practice;

import java.util.Scanner;

public class Calculator_Math {

	public static void main(String[] args) {

		Calculator_Math obj = new Calculator_Math();
		Scanner sc = new Scanner(System.in);
		String response;

		do {

			System.out.print("\nEnter first number : ");
			int num1 = sc.nextInt();
			System.out.println("");

			System.out.print("\nEnter second number : ");
			int num2 = sc.nextInt();
			System.out.println("");

			System.out.println("Select operations as listed below");
			System.out.println("1-Addition");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.print("Your selection : ");
			int operation = sc.nextInt();

			System.out.println(obj.calculatorMath(num1, num2, CalculatorOperations.get(operation)));

			System.out.print("\nDo you want to continue (Y/N) : ");
			response = sc.next();

		} while (response.equalsIgnoreCase("Y"));

		System.out.println("Thank you for using this programm");
		sc.close();
	}

	public int calculatorMath(int num1, int num2, CalculatorOperations operation) {

		int result = 0;
		if (operation != null) {
			switch (operation) {
			case ADD:
				result = num1 + num2;
				break;
			case SUBTRACT:
				result = num1 - num2;
				break;
			case MULTIPLY:
				result = num1 * num2;
				break;
			case DIVIDE:
				if (num2 > 0) {
					result = num1 / num2;
					break;
				}
			default:
				System.out.println("Invalid operation!!");
				break;
			}

		} else {
			System.out.println("Invalid operation!!");
		}
		return result;
	}

	public void day(int num) {
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekday");
			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;

		default:
			System.out.println("Invalid day!!");
			break;
		}
	}
}
