package com.codingbat.exercise6;

public class Recursion1_Factorial {

	public static void main(String[] args) {
		Recursion1_Factorial obj = new Recursion1_Factorial();
		System.out.println(obj.factorial(1));
		System.out.println(obj.factorial(2));
		System.out.println(obj.factorial(3));
		System.out.println(obj.factorialloop(1));
		System.out.println(obj.factorialloop(2));
		System.out.println(obj.factorialloop(3));

	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}

	}

	public int factorialloop(int n) {
		int factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;

		}
		return factorial;
	}
}
