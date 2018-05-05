package com.anurag.collection.LinkedList;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(1);
		list.display();

		// Reverse data.
		
		/*
		 * list.reverseLinkedList(); System.out.println("Reverse Data :");
		 * list.display();
		 */
		System.out.println(list.findMiddleElement());
	}
}
