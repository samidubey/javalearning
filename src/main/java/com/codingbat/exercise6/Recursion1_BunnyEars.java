package com.codingbat.exercise6;

public class Recursion1_BunnyEars {

	public static void main(String[] args) {
		Recursion1_BunnyEars obj = new Recursion1_BunnyEars();
		System.out.println(obj.bunnyEars(0));
		System.out.println(obj.bunnyEars(1));
		System.out.println(obj.bunnyEars(2));
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		return 2 + bunnyEars(bunnies - 1);
	}
}
