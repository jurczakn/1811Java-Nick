package com.example.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		// HashMap
		// unique keys

		Map<Integer, String> hashMap = new HashMap<>();

		hashMap.put(4, "Kitten"); // keys are objects
		hashMap.put(7, "Timothy");
		hashMap.put(6, "Doggo");
		hashMap.put(17, "Pupper");
		hashMap.put(10, "Jack The Spider");
//		hashMap.put(10, "Clark Kent");
		// hashMap.put(null, "something"); //null can be a key

		// System.out.println(hashMap);
		// System.out.println(hashMap.size());
		// System.out.println(hashMap.get(7));
		// System.out.println(hashMap.get(99)); //prints out null

		// Loop
		// you can iterate over the key set, value set or the entry set (both)
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		// Tree map
		// cannot have null as a key or values
		// sorted by key
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.putAll(hashMap);
System.out.println("TreeMap Loop");
		for (Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

	}

}
