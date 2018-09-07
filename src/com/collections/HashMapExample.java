package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	map.put("Tarun", 10);
	System.out.println(map.put("Tarun", 100));
}
}
