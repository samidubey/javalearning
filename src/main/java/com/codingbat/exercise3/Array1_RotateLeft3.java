package com.codingbat.exercise3;

import java.util.Arrays;

public class Array1_RotateLeft3 {

	public static void main(String[] args) {
		Array1_RotateLeft3 obj = new Array1_RotateLeft3();
		System.out.println(Arrays.toString(obj.rotateLeft3(new int[] { 1, 2, 3 })));

	}

	public int[] rotateLeft3(int[] nums) {
		int[] result = new int[3];
		int firstvalue = nums[0];
		for (int count = 0; count < nums.length - 1; count++) {
			result[count] = nums[count + 1];
		}
		result[result.length - 1] = firstvalue;
		return result;

	}

}
