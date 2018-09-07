package com.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeApi {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.of(2018, Month.NOVEMBER, 12, 19, 21, 25, 00000000000017));
	}

}
