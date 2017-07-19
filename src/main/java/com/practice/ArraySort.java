package com.practice;

public class ArraySort {

	public static void main(String[] args) {
		ArraySort obj = new ArraySort();

		int[] array = { 1, 5, 3, 2, 4 };
		int[] sortedArray = obj.arraySort(array);

		obj.printArrays(sortedArray);
	}

	public void printArrays(int[] array) {
		int size = array.length;

		for (int row = 0; row < size; row++) {
			System.out.print(array[row] + "  ");

		}
	}

	public int[] arraySort(int[] array) {
		int temp = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

}
