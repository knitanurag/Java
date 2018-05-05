package com.anurag.string;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		StringBuffer sbf = new StringBuffer(inputString);
		if (sbf.reverse().toString().equals(inputString)) {
			System.out.println("Is Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}

	}
}
