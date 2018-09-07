package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 23, 33, 54, 25, 10, 23, 33, 54, 25, 16, 37, 587, 89, 910);
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 13);
		map.put("a", 14);
		map.put("b", 12);
		map.put("B", 11);
		map.put("C", 51);
		map.put("c", 61);
		map.put("D", 31);
		map.put("d", 21);
		map.put("E", 11);
		map.put("e", 41);
		// System.out.println(Arrays.toString(list.stream().toArray(Integer[]::new)));
		// list.stream().filter(x -> x>10).forEach(x -> System.out.println(x));
		// System.out.println(list.stream().sorted().collect(Collectors.toSet()));
		List<String> list1 = map.keySet().stream().filter(i -> i.equals("z")).collect(Collectors.toList());
		list1.forEach(System.out::println);
		System.out.println(list.stream().filter(i -> i > 25).sorted().collect(Collectors.toList()));
	}
}
