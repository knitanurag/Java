package com.anurag.collection.ArrayList;

import java.util.Arrays;

public class CustomArrayListExample<E> {
	private static final int DEFAULT_CAPACITY = 5;
	private static final Object[] EMPTY_ELEMENT_DATA = {};
	private int size;
	private transient Object[] customArrayListElementData;

	public CustomArrayListExample() {
		this.customArrayListElementData = EMPTY_ELEMENT_DATA;
	}

	CustomArrayListExample(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Illegal capacity " + capacity);
		if (capacity == 0)
			this.customArrayListElementData = EMPTY_ELEMENT_DATA;
		this.customArrayListElementData = new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
																										 
	public boolean add(E e) {
		ensureCapacity(size + 1);
		customArrayListElementData[size++] = e;
		return true;

	}

	private void ensureCapacity(int minCapacity) {
		if (customArrayListElementData == EMPTY_ELEMENT_DATA)
			minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);

		if (minCapacity - customArrayListElementData.length > 0)
			grow(minCapacity);
	}

	private void grow(int minCapacity) {
		int oldCapacity = customArrayListElementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		this.customArrayListElementData = Arrays.copyOf(customArrayListElementData, newCapacity);

	}
}
