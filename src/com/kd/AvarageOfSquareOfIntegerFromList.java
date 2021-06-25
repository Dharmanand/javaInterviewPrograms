package com.kd;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvarageOfSquareOfIntegerFromList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 12, 10);
		
		OptionalDouble od = list.stream().map(i -> i*i).filter(i -> i <= 100).mapToInt(i -> i).average();
		if(od.isPresent())
			System.out.println(od.getAsDouble());

	}

}
