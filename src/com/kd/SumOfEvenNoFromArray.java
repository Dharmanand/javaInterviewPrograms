package com.kd;

import java.util.stream.IntStream;

public class SumOfEvenNoFromArray {
	static int sum = 0;
	public static void main(String[] args) {

		System.out.println(IntStream.of(2, 5, 8, 14, 22).filter(i -> i%2==0).reduce((x, y) -> x + y).getAsInt());
		
	}

}
