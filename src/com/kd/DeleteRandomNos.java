package com.kd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
// https://www.youtube.com/watch?v=vxqXClYH8bg&list=PLmNK9aRt5JxZA2Vdg11fhuDu4bVEfjFPx&index=17
public class DeleteRandomNos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i < n; i++)
			list.add(sc.nextInt());
		TreeSet<Integer> set = new TreeSet<>(list);
		int count = 0;
		for(int i=0; i < n-count; i++) {
			if((set.last() > list.get(i) * 2) && list.get(i) !=0) {
				list.remove(i);
				count ++;
				i--;
			}
		}
		System.out.println(count);
	}

}
