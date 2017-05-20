package com.codingbat.exercise1;

public class Problem16_icyHot {

	public static void main(String[] args) {
		Problem16_icyHot obj = new Problem16_icyHot();
		System.out.println(obj.icHot(2, 120));
		System.out.println(obj.icHot(-1, 120));
		System.out.println(obj.icHot(120, -1));
		System.out.println(obj.icHot(0, 0));
		System.out.println(obj.icHot(100, 100));
		System.out.println(obj.icHot(120, 120));
		System.out.println(obj.icHot(-1, -1));

	}

	public boolean icHot(int temp1, int temp2) {
		return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));

	}

}
