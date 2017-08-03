package com.practice;

import java.util.Arrays;

public class CappedCollection {

	private int position = 0;
	private int[] arr;

	public CappedCollection(int size) {
		arr = new int[size];
	}

	public static void main(String[] args) {

		CappedCollection collection1 = new CappedCollection(5);
		CappedCollection collection2 = new CappedCollection(10);

		collection1.add(1);
		collection2.add(1);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(5);
		collection2.add(5);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(4);
		collection2.add(4);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(3);
		collection2.add(3);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(2);
		collection2.add(2);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(7);
		collection2.add(7);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(6);
		collection2.add(6);
		collection1.print();
		collection2.print();

		System.out.println();

		collection1.add(10);
		collection2.add(10);
		collection1.print();
		collection2.print();
	}

	private void print() {
		System.out.println(Arrays.toString(arr));
	}

	private void add(int value) {
		arr[position] = value;
		position++;

		if (position == arr.length) {
			position = 0;
		}
	}
}
