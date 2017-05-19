package com.codingbat.exercise1;

import java.util.Optional;

public class Problem21_MixStart {

	public static void main(String[] args) {
		Problem21_MixStart obj = new Problem21_MixStart();
		System.out.println(obj.mixStart("mix snacks"));
		System.out.println(obj.mixStart("pix snacks"));
		System.out.println(obj.mixStart("pix"));
		System.out.println(obj.mixStart("ix"));
		System.out.println(obj.mixStart("x"));
		System.out.println(obj.mixStart(""));

	}

	public boolean mixStart(String str) {
		String str1 = Optional.ofNullable(str).orElse("");
		return (str1.length() >= 3 && str1.substring(1, 3).equals("ix"));
	}

}
