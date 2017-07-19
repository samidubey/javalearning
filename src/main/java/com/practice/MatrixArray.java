package com.practice;

public class MatrixArray {

	public static void main(String[] args) {
		int[][] array1 = { { 0, 1 }, { 2, 3 } };
		int[][] array2 = { { 3, 2 }, { 1, 0 } };

		MatrixArray obj = new MatrixArray();

		System.out.println("Array1");
		obj.printArrays(array1);

		System.out.println("Array2");
		obj.printArrays(array2);

		int[][] matrixAddition = obj.matrixAddition(array1, array2);

		System.out.println("Result Array");
		obj.printArrays(matrixAddition);
	}

	public void printArrays(int[][] array) {
		int size = array.length;

		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print(array[row][col] + "  ");
			}

			System.out.println();
		}
	}

	public void advancePrintArrays(int[][] array) {
		int size = array.length;

		for (int[] row : array) {
			for (int col : row) {
				System.out.print(col + "  ");
			}

			System.out.println();
		}
	}

	public int[][] matrixAddition(int[][] array1, int[][] array2) {
		int size = array1.length;

		int[][] result = new int[size][size];

		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				result[row][col] = array1[row][col] + array2[row][col];
			}
		}

		return result;
	}
}
