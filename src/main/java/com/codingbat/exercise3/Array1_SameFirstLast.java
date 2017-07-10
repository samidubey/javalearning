package com.codingbat.exercise3;

public class Array1_SameFirstLast {
	public static void main(String[] args) {
		Array1_SameFirstLast obj = new Array1_SameFirstLast();
		int[] input = new int[] { 1, 2, 3 };
		int[] input1 = new int[] { 1, 2, 3, 1 };
		int[] input2 = new int[] { 1, 2, 1 };
		System.out.println(obj.sameFirstLast(input));
		System.out.println(obj.sameFirstLast(input1));
		System.out.println(obj.sameFirstLast(input2));
	}

	public boolean sameFirstLast(int[] nums) {
		return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);

	}

}
