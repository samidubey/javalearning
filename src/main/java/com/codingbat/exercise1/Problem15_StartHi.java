package com.codingbat.exercise1;

public class Problem15_StartHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem15_StartHi obj = new Problem15_StartHi();
		System.out.println(obj.startHi("hi"));
		System.out.println(obj.startHi("hi there"));
		System.out.println(obj.startHi("hello hi"));
		System.out.println(obj.startHi("h"));
		System.out.println(obj.startHi(""));
		System.out.println(obj.startHi(null));
	}

	public boolean startHi(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		if (str.length() > 1) {
			String startTwoChar = str.substring(0, 2);
			if (startTwoChar.equals("hi")) {
				return true;
			}
		}
		return false;

	}

}
