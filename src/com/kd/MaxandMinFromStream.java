package com.kd;

import java.util.stream.Stream;

public class MaxandMinFromStream {

	public static void main(String[] args) {

		System.out.println(Stream.of(2,8,9,45,63).min((i1, i2) -> i1.compareTo(i2)).get());
		System.out.println(Stream.of(2,8,9,45,63).max((i1, i2) -> i1.compareTo(i2)).get());

	}

}
