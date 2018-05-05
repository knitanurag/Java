package com.anurag.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapOnValues {
	public static void main(String[] args) {
		HashMap<String, String> unsortedMap = new HashMap<String, String>();
		unsortedMap.put("A", "2");
		unsortedMap.put("B", "3");
		unsortedMap.put("C", "1");
		Set<Map.Entry<String, String>> entryMapSet = unsortedMap.entrySet();
		for (Map.Entry<String, String> entry : unsortedMap.entrySet()) {
			System.out.println("Key is " + entry.getKey() + " Value is :" + entry.getValue());
		}
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(entryMapSet);
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
				// TODO Auto-generated method stub
				System.out.println(o2.getValue().compareTo(o1.getValue()));
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Map.Entry<String, String> entry : list) {
			System.out.println("Key is " + entry.getKey() + " Value is :" + entry.getValue());
		}
	}
}
