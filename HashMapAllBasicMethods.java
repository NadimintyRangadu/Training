package com.cashapona.collections.may19;

import java.util.HashMap;
import java.util.Map;

public class HashMapAllBasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
//put():		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(7, "G");
		System.out.println(map);
		System.out.println("Retrive the particular pair");
//get():
		for (int i = 0; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		System.out.println("remove the particular pair");
// remove():
		System.out.println(map.remove(4));
		System.out.println(map);
		System.out.println(">>>>>>>>>>>");
//containsKey():
		if (map.containsKey(5)) {
			System.out.println("key is present in hashmap:");
		} else {
			System.out.println("key is not present in hashmap");
		}

		System.out.println(">>>>>>>>>>");

//containsValue():
		System.out.println(map.containsValue("E"));
		System.out.println("Search for value");
// isEmpty():
		System.out.println(map.isEmpty());
		System.out.println("Returns the all the keys");

//keySet():

		System.out.println(map.keySet());
		System.out.println("Return the all the keys in one by one");
		for (Integer i : map.keySet()) {
			System.out.println(i);
		}
		System.out.println("Returns the all the values");
//values():
		System.out.println(map.values());
		// entrySet():
		System.out.println("Return all the entries as Set");
		System.out.println(map.entrySet());
	}

}
