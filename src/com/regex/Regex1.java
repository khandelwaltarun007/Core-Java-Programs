package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\w+\\@\\w+\\.[A-Za-z]{2,5}");
		Matcher matcher = pattern.matcher("khandelwal.tarun007@gmail.com");
		System.out.println(matcher.matches());

	}

}
