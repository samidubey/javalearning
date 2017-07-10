package com.codingbat.exercise3;

public class Array1_Sum3 {

	public static void main(String[] args) {
		Array1_Sum3 obj = new Array1_Sum3();
		System.out.println(obj.sum3(new int[] { 1, 2, 3 }));
		System.out.println(obj.sum3(new int[] { 5, 11, 2 }));
		System.out.println(obj.sum3(new int[] { 7, 0, 0 }));

	}

	public int sum3(int[] nums) {
		int sum;
		sum = nums[0] + nums[1] + nums[2];
		return sum;

	}

}
