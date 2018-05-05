package com.anurag.programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int inputDigit = sc.nextInt();
		sc.close();

		findLargest(inputNumber, inputDigit);

	}

	private static void findLargest(int inputNumber, int inputDigit) {
		// TODO Auto-generated method stub
		char c = Integer.toString(inputDigit).charAt(0);
		for (int i = inputNumber; i > 0; --i) {
			if (Integer.toString(inputNumber).indexOf(c) == -1) {
				System.out.println(i);
				break;
			}
		}

	}
}
