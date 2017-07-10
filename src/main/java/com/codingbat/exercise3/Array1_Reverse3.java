package com.codingbat.exercise3;

import java.util.Arrays;

public class Array1_Reverse3 {

	public static void main(String[] args) {
		Array1_Reverse3 obj = new Array1_Reverse3();
		System.out.println(Arrays.toString(obj.reverse3(new int[] { 1, 2, 3 })));

	}

	public int[] reverse3(int[] nums) {
		int[] result = new int[3];
		int lastindex = nums.length - 1;
		for (int count = 0; count < nums.length; count++, lastindex--) {
			result[count] = nums[lastindex];
		}
		return result;
	}

}
