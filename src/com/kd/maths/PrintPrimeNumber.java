package com.kd.maths;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		System.out.println(Stream.iterate(0, i -> i+1).limit(1000).filter(PrintPrimeNumber :: isPrime).count());
		System.out.println(Stream.iterate(0, i -> i+1).limit(1000).filter(PrintPrimeNumber :: isPrime).reduce((x,y) -> x+y).get());
		System.out.println(isPrime(11));
	}

	public static boolean isPrime(int number) {

        if (number <= 1) return false; // 1 is not prime and also not composite

        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
	
}
