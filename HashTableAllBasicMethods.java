package com.cashapona.collections.may19;

import java.util.Hashtable;
import java.util.Map;

public class HashTableAllBasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> table = new Hashtable<String, Integer>();
		table.put("A", 1);
		table.put("B", 4);
		table.put("C", 3);
		table.put("D", 4);
		table.put("E", 5);
		table.put("F", 6);
		table.put("G", 7);
		table.put("H", 8);
		System.out.println(table);

			System.out.println(table.get("D"));

			System.out.println(table.containsKey("D"));
			System.out.println(table.containsValue(7));
			System.out.println(table.isEmpty());
			System.out.println(table.keySet());
			System.out.println(table.values());
			System.out.println(table.entrySet());

	}

}
