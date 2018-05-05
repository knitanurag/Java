package com.anurag.collection;

public class CustomCollectionTest {
	public static void main(String[] args) {
		CustomArrayList<String> list=new CustomArrayList<String>();
		list.add("Anu");
		list.add("Ankit");
		//list.add("Sanjay");
		//list.add("Hello");
		System.out.println("Printing List : "+ list.toString());
	}
}
