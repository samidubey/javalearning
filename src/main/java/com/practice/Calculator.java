package com.practice;

public class Calculator {
	public int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	public int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public int divide(int n1, int n2) {
		int result = 0;
		if (n1 != 0) {
			result = n1 / n2;
		}
		return result;
	}

}
