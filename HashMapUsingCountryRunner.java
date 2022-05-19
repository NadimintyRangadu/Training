package com.cashapona.collections.may19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapUsingCountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapUsingCountry map = new HashMapUsingCountry("AP", "Amaravati");
		// HashMapUsingCountry map1 = new HashMapUsingCountry("Hyderabad");

		List<HashMapUsingCountry> list = new ArrayList<HashMapUsingCountry>();

		list.add(map);

		Map<String, List<HashMapUsingCountry>> country = new HashMap<String, List<HashMapUsingCountry>>();
		country.put("A", list);
		// country.put("C", list);
		System.out.println(country.get("A"));

		}
	
	}


