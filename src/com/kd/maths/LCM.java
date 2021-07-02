package com.kd.maths;

public class LCM {
// https://www.geeksforgeeks.org/program-to-find-lcm-of-two-numbers/
	public static void main(String[] args) {
		int a = 125, b = 145;
		System.out.println("gcd " + gcd(a, b));
		System.out.println("lcm " + lcm(a, b));
	}

	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
