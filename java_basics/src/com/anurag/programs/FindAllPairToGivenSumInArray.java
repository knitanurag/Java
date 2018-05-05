package com.anurag.programs;

public class FindAllPairToGivenSumInArray {
	public static void main(String[] args) {
		int[] intArray = { 4, 6, 5, -10, 8, 5, 20 };
		int givenNumber = 10;
		findPairOfElements(intArray, givenNumber);
	}

	private static void findPairOfElements(int[] intArray, int givenNumber) {
		// TODO Auto-generated method stub
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (givenNumber == intArray[i] + intArray[j]) {
					System.out.println("(" + intArray[i] + ", " + intArray[j] + ")");
				}
			}
		}
	}
}
