package com.interfaces;


interface A1{
	default String name(String name) {
		System.out.println("A1 interface"+name);
		return "A1 interface"+name;
	}
}

interface A2{
	String name(String name);
}

public class Test implements A1,A2 {
	public static void main(String[] args) {
		A1 a1 = new Test();
		System.out.println(a1.name("Tarun"));
	}

	@Override
	public String name(String name) {
		return "A2 interface"+name;
	}
}
