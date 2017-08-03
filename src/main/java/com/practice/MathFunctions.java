package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MathFunctions {

	public static void main(String[] args) {

		System.out.println(Math.abs(1));
		System.out.println(Math.abs(-1));
		System.out.println(Math.max(2, -30));
		System.out.println(Math.min(2, -30));
		System.out.println(Math.round(2.49));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(2.9));
		System.out.println(Math.sin(1));
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.floor(Math.random() * 200) + 300);

		System.out.println("arrayList");
		arrayList();

		System.out.println("set");
		set();

		System.out.println("Tree set");
		sortedSet();

		System.out.println("map");
		map();

		System.out.println("only 10 items");
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		arrayListForOnly10Items(numbers);

	}

	public static void arrayList() {
		List<Integer> arrayList1 = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			int randomNum = (int) Math.floor(Math.random() * 10);
			arrayList1.add(randomNum);
		}

		for (Integer number : arrayList1) {
			System.out.println(number);
		}

	}

	public static void arrayListForOnly10Items(ArrayList<Integer> items) {
		List<Integer> arrayList1 = new ArrayList<>();
		System.out.println(items);
		if (items.size() <= 10) {
			for (Integer number : items) {
				arrayList1.add(number);
			}
		} else if (items.size() > 10) {
			for (int i = 0; i < 10; i++) {
				arrayList1.remove(i);
				System.out.println(arrayList1);
				arrayList1.add(i, items.get(i + 10));

			}

		}
		for (Integer number : arrayList1) {
			System.out.println(number);
		}

	}

	// naturally sorted for numerics
	public static void set() {
		Set<Integer> set = new HashSet<>();

		for (int i = 1; i <= 10; i++) {
			int randomNum = (int) Math.floor(Math.random() * 10);
			System.out.println("\t" + randomNum);
			set.add(randomNum);
		}

		for (Integer number : set) {
			System.out.println(number);
		}

	}

	public static void sortedSet() {
		Set<Integer> treeSet = new TreeSet<>();

		for (int i = 1; i <= 10; i++) {
			int randomNum = (int) Math.floor(Math.random() * 10);
			treeSet.add(randomNum);
		}

		for (Integer number : treeSet) {
			System.out.println(number.intValue());
		}

	}

	public static void map() {
		Map<Integer, String> map = new HashMap<>();

		for (int i = 1; i <= 10; i++) {
			int randomNum = (int) Math.floor(Math.random() * 10);
			map.put(randomNum, "Value: " + randomNum);
		}
		System.out.println("Using keyset");
		for (Integer key : map.keySet()) {
			System.out.println(String.format("[%d] -> %s", key, map.get(key)));
		}
		System.out.println("Using Entry");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("[" + entry.getKey() + "]" + " -> " + entry.getValue());
		}
	}
}
