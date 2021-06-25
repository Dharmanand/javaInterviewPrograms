package com.kd;

import java.util.ArrayList;
import java.util.stream.Collectors;
//https://www.youtube.com/watch?v=clA_d0rkark&list=PLmNK9aRt5JxZA2Vdg11fhuDu4bVEfjFPx&index=16
public class NagarroSmallestWindowInString {

	public static void main(String[] args) {

		String input = "ADOBECODEBANC";
		String pattern = "ABC";

		System.out.println(findSmallestWindow(input, pattern));
	}

	private static String findSmallestWindow(String input, String pattern) {
		char arr[] = pattern.toCharArray();
		ArrayList<Character> list = (ArrayList<Character>) input.chars().mapToObj(x -> (char) x)
				.collect(Collectors.toList());
		boolean flag = false;
		int firstIndex = 0;
		while (!flag) {
			for (int j = 0; j < pattern.length(); j++) {
				if (!list.contains(arr[j])) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				list.remove(0);
				firstIndex++;
			}
		}
		int indexFromLast = 0;
		flag = false;
		while (!flag) {
			for (int j = 0; j < pattern.length(); j++) {
				if (!list.contains(arr[j])) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				list.remove(list.size() - 1);
				indexFromLast++;
			}
		}
		return input.substring(firstIndex - 1, input.length() - indexFromLast);
	}

}
