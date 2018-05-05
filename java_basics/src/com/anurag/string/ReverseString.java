package com.anurag.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "anurag";
		reverseStringUsingStringBuffer(str);
		reverseStringUsingRecursion(str);
	}

	private static String reverseStringUsingRecursion(String str) {
		if (str == null || str == "") {
			return "";
		}

		return str.charAt(str.length() - 1) + reverseStringUsingRecursion(str.substring(0, str.length() - 1));
	}

	private static void reverseStringUsingStringBuffer(String str) {
		StringBuffer bf = new StringBuffer(str);
		bf = bf.reverse();
		System.out.println(bf.toString());
	}
}
