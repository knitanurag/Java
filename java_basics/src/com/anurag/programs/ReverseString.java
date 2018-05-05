package com.anurag.programs;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Anurag";
		usingStringBuffer(s);
		usingIterativeMethods(s);
		String y = recursiveMethod(s);
		System.out.println(y);
	}

	private static void usingStringBuffer(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.err.println(sb.reverse().toString());
	}

	private static void usingIterativeMethods(String s) {
		char[] stringArray = s.toCharArray();
		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.print(stringArray[i]);

		}
		System.out.println();
	}

	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
