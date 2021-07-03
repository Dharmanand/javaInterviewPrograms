package com.kd;

import java.util.Scanner;

public class NthRoot {

	public static void main(String[] args) {

		System.out.println("Enter a number ::");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numRoot = sc.nextInt();

		System.out.println("Cube root of the given number is " + underRoot(num, numRoot));
	}

	/**
	 * 
	 * @param num - Number which have to under root.
	 * @param numRoot - the power of under root.
	 * @return under root, Example: num = 125 and noRoot = 3 then output = 5.0
	 */
	
	public static double underRoot(int num, int numRoot) {
		double i, precision = 0.00000001;
		double j = 1;
		for (i = 1; j <= num; i++) {
			j = 1;
			for (int a = 1; a <= numRoot; a++) {
				j = j * i;
			}
		}
		i--;
		j = 1;
		
		for (--i; j < num; i += precision) {
			j = 1;
			for (int b = 1; b <= numRoot; b++) {
				j = j * i;
			}
		}
		i -= precision;
		return i;
	}

}
