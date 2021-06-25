package com.kd;

import java.util.Collections;
import java.util.Random;

public class RandomIntegersSortedInDescendingOrder {

	public static void main(String[] args) {

		new Random().ints(5).boxed().sorted((i1, i2) -> i2.compareTo(i1)).forEach(i -> System.out.println(i));

		
	}

}
