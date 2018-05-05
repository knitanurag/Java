package com.anurag.interviewquestion;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapBaedOnValue {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Anurag", "1");

		map.put("Shivam", "3");

		map.put("Abhi", "2");

		List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());
		System.out.println("Before" + list);

		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		System.out.println("Key Sort :" + list);

		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println("Value Sort :" + list);

	}
}
