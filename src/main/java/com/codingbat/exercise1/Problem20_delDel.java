package com.codingbat.exercise1;

import java.util.Optional;

public class Problem20_delDel {

	public static void main(String[] args) {
		Problem20_delDel obj = new Problem20_delDel();
		System.out.println(obj.delDelOldSchool("adelbc"));
		System.out.println(obj.delDelOldSchool("adelHello"));
		System.out.println(obj.delDelOldSchool("adedbc"));
		System.out.println(obj.delDelOldSchool(""));
		System.out.println(obj.delDelOldSchool("adedbcdel"));
		System.out.println(obj.delDelOldSchool("addeledbc"));
		System.out.println(obj.delDelOldSchool("del"));
		System.out.println(obj.delDelOldSchool("ad"));
		System.out.println(obj.delDelOldSchool("a"));
		System.out.println(obj.delDel("deDel execution"));
		System.out.println(obj.delDel("adelbc"));
		System.out.println(obj.delDel("adelHello"));
		System.out.println(obj.delDel("adedbc"));
		System.out.println(obj.delDel(""));
		System.out.println(obj.delDel("adedbcdel"));
		System.out.println(obj.delDel("addeledbc"));
		System.out.println(obj.delDel("del"));
		System.out.println(obj.delDel("ad"));
		System.out.println(obj.delDel("a"));

	}

	public String delDel(String str) {
		String str1 = Optional.ofNullable(str).orElse("");
		if (str1.length() >= 4 && str1.substring(1, 4).equals("del")) {
			return str1.substring(0, 1) + str1.substring(4);
		}
		return str1;
	}

	public String delDelOldSchool(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
			return str.substring(0, 1) + str.substring(4);
		}
		return str;
	}
}
