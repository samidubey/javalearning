package com.practice;

public class DecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary obj = new DecimalToBinary();
		System.out.println(obj.convertBinary(11));
	}

	public String convertBinary(int d) {
		StringBuilder result = new StringBuilder();
		int modulus;
		while (d != 1) {
			modulus = d % 2;
			d = d / 2;
			result = result.append(modulus);
		}
		return result.append(d).reverse().toString();

	}

}
