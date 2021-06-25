package com.kd;

public class Solution {

	public static void main(String[] args) {
		String input = "welcome to mettl";
		char c = 'l';
		char arr[] = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < input.length(); i++) {
			if(arr[i] != c) 
				sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}

}
