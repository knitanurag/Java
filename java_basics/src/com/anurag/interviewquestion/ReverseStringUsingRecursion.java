package com.anurag.interviewquestion;

public class ReverseStringUsingRecursion {

	private static String rev = "";

	public static void main(String[] args) {

		String input = "anurag";
		System.out.println(input.subSequence(0, input.length() - 1));
		System.out.println(reveseString(input));

	}

	private static String reveseString(String input) {
		if (input.length() == 1) {
			return input;
		} else {
			rev = rev + input.charAt(input.length() - 1) + reveseString(input.substring(0, input.length() - 1));
			return rev;
		}

	}
}
