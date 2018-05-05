package com.anurag.programs;

import java.util.HashSet;
import java.util.Set;

public class PermutaionOfString {
	public static void main(String[] args) {
		String s = "ABCD";
		System.out.println(findAllPermutationOfString(s));
	}

	private static Set<String> findAllPermutationOfString(String s) {
		Set<String> wordSet = new HashSet<String>();
		// TODO Auto-generated method stub
		if (s == null) {
			return null;
		} else if (s.length() == 0) {
			wordSet.add("");
			return wordSet;
		}
		char initial = s.charAt(0); // first character
		String rem = s.substring(1); // Full string without first character
		Set<String> words = findAllPermutationOfString(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				wordSet.add(charInsert(strNew, initial, i));
			}
		}
		return wordSet;
	}

	private static String charInsert(String str, char c, int j) {
		// TODO Auto-generated method stub
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}
}
