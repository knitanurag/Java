package com.anurag.collection;

public class CustomLinkedList<E> {

	private Node<E> start = null;

	private Node<E> last = null;

	private transient int size;

	private static class Node<E> {
		public E data;

		Node<E> next;

		Node<E> previous;

		public Node(E data, Node<E> previous, Node<E> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
	}

	public boolean add(E e) {
		linkLast(e);
		return true;

	}

	private void linkLast(E e) {
		Node<E> l = last;
		Node<E> newNode = new Node<>(e, l, null);
		last = newNode;
		if (l == null) {
			start = newNode;
		} else {
			l.next = newNode;
		}
		size++;

	}
}
