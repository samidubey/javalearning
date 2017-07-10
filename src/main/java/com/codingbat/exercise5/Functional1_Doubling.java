package com.codingbat.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Functional1_Doubling {

	public static void main(String[] args) {
		Functional1_Doubling obj = new Functional1_Doubling();
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(obj.doubling(nums));

	}

	public List<Integer> doubling(List<Integer> nums) {
		for (int count = 0; count < nums.size(); count++) {
			nums.set(count, 2 * nums.get(count));
		}
		return nums;

	}
}
