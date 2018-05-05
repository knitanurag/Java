package com.anurag.collection;

import java.util.Arrays;

public class CustomArrayList<T> {

	Object element[];

	int size;

	public void add(T t) {
		if (element == null) {
			element = new Object[2];
		} else if (size == element.length - 1) {
			int newSize = ((element.length * 3 / 2) + 1);
			element = Arrays.copyOf(element, newSize);
		}
		element[size] = t;
		size++;

	}

	public T get(int index) {
		return (T) element[index];

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Object obj : element) {
			builder.append(obj);
			builder.append(", ");
		}
		return builder.toString();
	}
}
