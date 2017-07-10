package com.codingbat.exercise6;

public class Recursion1_Fibonacci {

	public static void main(String[] args) {
		Recursion1_Fibonacci obj = new Recursion1_Fibonacci();
		System.out.println(obj.fibonacci(0));
		System.out.println(obj.fibonacci(1));
		System.out.println(obj.fibonacci(2));
		System.out.println(obj.fibonacci(8));
		System.out.println(obj.fibonacci(5));
		System.out.println(obj.fibonacciloop(0));
		System.out.println(obj.fibonacciloop(1));
		System.out.println(obj.fibonacciloop(2));
		System.out.println(obj.fibonacciloop(8));
		System.out.println(obj.fibonacciloop(5));
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	public int fibonacciloop(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		int i = 0;
		int j = 1;
		int sum = 0;
		for (int k = 2; k <= n; k++) {
			sum = i + j;
			i = j;
			j = sum;
		}
		return sum;
	}

}
