package com.anurag;

import java.util.ArrayList;
import java.util.List;

public class TestNew {
	public static void main(String[] args) {
		/*
		 * int i = 127; Integer i2 = Integer.valueOf(i);
		 */
		// System.out.println("Hi");
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		System.out.println(getAll(list) + "check");

	}

	private static String getAll(List<?> list) {
		System.out.println(list);
		String str = (String) list.get(0);
		return str;
	}
}
