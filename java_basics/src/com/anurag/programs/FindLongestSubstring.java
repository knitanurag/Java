package com.anurag.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindLongestSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		char[] charArray = inputString.toCharArray();
		int lengthOfLargetSubString = 0;
		String largestSubString = null;
		Map<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);

			} else {
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			if (charPosMap.size() > lengthOfLargetSubString) {
				lengthOfLargetSubString = charPosMap.size();
				largestSubString = charPosMap.keySet().toString();

			}
		}

		System.out.println(largestSubString);

	}
}
