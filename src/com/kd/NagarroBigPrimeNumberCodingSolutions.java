package com.kd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
// https://www.youtube.com/watch?v=ZC4UShhMgWU&list=PLmNK9aRt5JxZA2Vdg11fhuDu4bVEfjFPx&index=2
//Big Prime Number Coding Solutions
public class NagarroBigPrimeNumberCodingSolutions {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		int m = in.nextInt();
		List<Integer> nosList = new ArrayList<>();
		nosList.addAll(list);
		int index = 0;
		while(nosList.size() < m) {
			for (int i = 0; i < n; i++) {
				nosList.add(list.get(i)*nosList.get(index));
			}
			TreeSet<Integer> set = new TreeSet<>(nosList);
			nosList.clear();
			nosList.addAll(set);
			index++;
		}
		System.out.println(nosList);
		System.out.println("------------------");
		System.out.println(nosList.get(m-1));
		
	}

}
