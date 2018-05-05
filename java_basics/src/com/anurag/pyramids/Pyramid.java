package com.anurag.pyramids;

public class Pyramid {

	public static void main(String[] args) {
		createNumberPyramid(4);
		createReverseNumberPyramid(4);
		createNumberPyramidDecreaseAndIncrease(4);
		createReverseNumberPyramidDecreaseAndIncrease(4);
	}

	private static void createReverseNumberPyramid(int i) {
		// TODO Auto-generated method stub

	}

	private static void createReverseNumberPyramidDecreaseAndIncrease(int noOfRows) {
		// TODO Auto-generated method stub
		int rowCount = 1;
		for (int i = 1; i <= noOfRows; i++) {
			for (int j = 1; j <= noOfRows; j++) {
				System.out.print(j + " ");
			}
			rowCount++;
		}

	}

	private static void createNumberPyramidDecreaseAndIncrease(int noOfRows) {
		// TODO Auto-generated method stub
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
			rowCount++;
		}

	}

	private static void createNumberPyramid(int noOfRows) {
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			rowCount++;
			System.out.println("");
		}

	}

}
