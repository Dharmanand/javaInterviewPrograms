package com.kd.maths;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(square(25));
	}

	public static double square(double number){
	    double t;
	  
	    double squareroot = number / 2;
	  
	    do {
	        t = squareroot;
	        squareroot = (t + (number / t)) / 2;
	    } while ((t - squareroot) != 0);
	  
	    return squareroot;
	}
	
}
