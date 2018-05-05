package com.anurag.hackerRank;

public class Solution1 {
	public static void main(String[] args) {
		String s = "Hey? Anurag How, are you.";
		String delims = "[ ?.!',]+";
		String[] sArray = s.split(delims);
		System.out.println(sArray.length);
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
	}
}
