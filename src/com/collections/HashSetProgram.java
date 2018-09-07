package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Tarun");
		set.add("Tarun");
		set.add("Mansi");
		set.add("Ajinkya");
		set.add("Harsh");
		set.add("Yash");
		
		set.forEach(x -> System.out.println(x));
	}
}
