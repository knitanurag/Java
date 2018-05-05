package com.anurag.collection.LinkedList;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {
		first = null;
	}

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void insertFirst(int data) {
		Node insertNode = new Node(data);
		insertNode.next = first;
		first = insertNode;
	}

	public void reverseLinkedList() {
		Node currentNode = first;
		Node nextNode = first;
		Node previousNode = null;

		while (nextNode != null) {
			nextNode = nextNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;

		}
		first = previousNode;
	}

	public int findMiddleElement() {
		Node slowPtr = first;
		Node fastPtr = first;
		if (first != null) {
			while (fastPtr != null && fastPtr.next != null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
			return slowPtr.data;
		}
		return 0;

	}

	public void display() {
		Node displayNode = first;
		while (displayNode != null) {
			System.out.println("Data" + displayNode.data);
			displayNode = displayNode.next;
		}
	}

}
