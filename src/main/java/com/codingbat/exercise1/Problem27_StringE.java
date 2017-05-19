package com.codingbat.exercise1;

public class Problem27_StringE {

	public static void main(String[] args) {
		Problem27_StringE obj = new Problem27_StringE();
		System.out.println(obj.stringE("Hello"));

	}

	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count = count + 1;
			}
		}
		return (count >= 1 && count <= 3);

	}
}
