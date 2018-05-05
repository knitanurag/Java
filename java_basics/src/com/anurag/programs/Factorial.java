package com.anurag.programs;

public class Factorial {
	public static void main(String[] args) {
		int value = calculateFactorial(5);
		System.out.println(value);
	}

	private static int calculateFactorial(int i) {
		if (i > 1) {
			return i * calculateFactorial(i - 1);
		} else {
			return 1;
		}

	}
}
