package com.ty;

import java.util.Map;

public class Shop {

	private String name;
	private Map<String, Integer> items;
	public Shop(String name, Map<String, Integer> items) {
		super();
		this.name = name;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", items=" + items + "]";
	}
	
	
}
