package com.cashapona.collections.may19;

public class HashMapUsingCountry {

	private String state;
	private String capital;

	public HashMapUsingCountry(String state, String capital) {
		super();
		this.state = state;
		this.capital = capital;
	}

	@Override
	public String toString() {

		return state + "=" + capital;
	}


}

