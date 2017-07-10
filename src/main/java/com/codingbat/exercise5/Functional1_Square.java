package com.codingbat.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Functional1_Square {

	public static void main(String[] args) {
		Functional1_Square obj = new Functional1_Square();
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(obj.square(nums));
	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(n -> n * n);
		return nums;

	}

}
