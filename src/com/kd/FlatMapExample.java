package com.kd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {

		List<List<String>> names = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("John", "Michael"),
				Arrays.asList("Shawn", "Franklin"), Arrays.asList("Johnty", "Sean"));

		names.stream().flatMap(i -> i.stream()).map(String::toUpperCase).filter(i -> i.startsWith("S"))
				.collect(Collectors.toList()).forEach(i -> System.out.println(i));

	}

}
