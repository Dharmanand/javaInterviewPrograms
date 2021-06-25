package com.kd;

import java.util.Random;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class ConvertIteratorToStream {

	public static void main(String[] args) {

		 // Convert the iterator to Spliterator
	        Spliterator<Integer>
	            spliterator = Spliterators
	                              .spliteratorUnknownSize(new Random().ints(5).iterator(), 0);
	  
	        // Get a Sequential Stream from spliterator
	        StreamSupport.stream(spliterator, false).sorted((i1, i2) -> i2.compareTo(i1)).forEach(i -> System.out.println(i));
		 
		 
	}

}
