package com.codingbat.exercise1;

public class Problem19_LoneTeen {

	public static void main(String[] args) {
		Problem19_LoneTeen obj = new Problem19_LoneTeen();
		System.out.println(obj.loneTeen(13, 99));
		System.out.println(obj.loneTeen(21, 19));
		System.out.println(obj.loneTeen(21, 14));
		System.out.println(obj.loneTeen(15, 22));
		System.out.println(obj.loneTeen(13, 13));
		System.out.println(obj.loneTeen(14, 15));
		System.out.println(obj.loneTeen(19, 19));
		System.out.println(obj.loneTeen(13, 19));

		System.out.println("Otherway");
		System.out.println(obj.loneTeenOldSchool(13, 99));
		System.out.println(obj.loneTeenOldSchool(21, 19));
		System.out.println(obj.loneTeenOldSchool(21, 14));
		System.out.println(obj.loneTeenOldSchool(15, 22));
		System.out.println(obj.loneTeenOldSchool(13, 13));
		System.out.println(obj.loneTeenOldSchool(14, 15));
		System.out.println(obj.loneTeenOldSchool(19, 19));
		System.out.println(obj.loneTeenOldSchool(13, 19));
	}

	public boolean loneTeen(int a, int b) {
		return ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19));
	}

	public boolean loneTeenOldSchool(int a, int b) {
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);
		return ((aTeen && !bTeen) || (!aTeen && bTeen));
	}

}
