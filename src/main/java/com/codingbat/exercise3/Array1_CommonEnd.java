package com.codingbat.exercise3;

public class Array1_CommonEnd {

	public static void main(String[] args) {
		Array1_CommonEnd obj = new Array1_CommonEnd();

		System.out.println(obj.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3 }));
		System.out.println(obj.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3, 2 }));
		System.out.println(obj.commonEnd(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
	}

	public boolean commonEnd(int[] a, int[] b) {
		return (a.length >= 1 && b.length >= 1 && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]));

	}

}
