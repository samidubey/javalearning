package com.codingbat.exercise1;

public class Problem25_In3050 {

	public static void main(String[] args) {
		Problem25_In3050 obj = new Problem25_In3050();
		System.out.println(obj.in3050(31, 32));
		System.out.println(obj.in3050(30, 30));
		System.out.println(obj.in3050(42, 32));
		System.out.println(obj.in3050(50, 45));
		System.out.println(obj.in3050(50, 40));
		System.out.println(obj.in3050(50, 39));

	}

	public boolean in3050(int a, int b) {
		boolean abRange3040 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
		boolean abRange4050 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);

		return (abRange3040 || abRange4050);

	}

}
