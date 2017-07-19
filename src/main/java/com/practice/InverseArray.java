package com.practice;

public class InverseArray {

	public static void main(String[] args) {
		InverseArray obj = new InverseArray();
		int[] array = { 1, 5, 3, 2, 4 };
		int[] inverseArray = obj.inverseArray(array);
		obj.printArrays(inverseArray);
	}

	public void printArrays(int[] array) {
		int size = array.length;

		for (int row = 0; row < size; row++) {
			System.out.print(array[row] + "  ");

		}
	}

	public int[] inverseArray(int[] array) {
		int size = array.length;
		int[] inverseArray = new int[size];
		for (int i = 0; i < size; i++) {
			inverseArray[i] = array[(size - 1) - i];
		}
		return inverseArray;
	}

}
