package com.codingbat.exercise3;

public class Array1_FirstLast6 {

	public static void main(String[] args) {
		Array1_FirstLast6 obj = new Array1_FirstLast6();
		int[] input = new int[] { 1, 2, 6 };
		int[] input1 = new int[] { 6, 1, 2, 3 };
		int[] input2 = new int[] { 13, 6, 1, 2, 3 };
		System.out.println(obj.firstLast6(input));
		System.out.println(obj.firstLast6(input1));
		System.out.println(obj.firstLast6(input2));
	}

	public boolean firstLast6(int[] nums) {

		return (nums[0] == 6 || nums[nums.length - 1] == 6);

	}
}
