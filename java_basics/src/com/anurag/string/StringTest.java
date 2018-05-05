package com.anurag.string;

public class StringTest {
	public static void main(String[] args) {

		// Assignment Operator Confusion
		String s1 = new String("TEST");
		String s2 = new String("test");
		System.out.println(s1 = s2);

		// Instance Of Method in String Equals method
		String s3 = "abc";
		StringBuffer s4 = new StringBuffer(s1);
		System.out.println(s3.equals(s4));

		// Interning but not assigning back
		String s5 = "abc";
		String s6 = new String("abc");
		s6.intern();
		System.out.println(s5 == s6);
		//[cde, bcd, def, abc]
		String s7 = "bcd";
		String s8 = "";
		System.out.println(s7.compareTo(s8));

	}
}
