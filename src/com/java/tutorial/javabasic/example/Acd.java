package com.java.tutorial.javabasic.example;

import java.util.ArrayList;

/**
 * @author wdp
 *
 *         2018年1月15日 上午11:45:07
 */
public class Acd {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int N = 6,b;
		int[] resultList = new int[N];
		for (int i = 1; i <= 33; i++) {
			al1.add(i);
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < N; i++) {
				int s = (int) (Math.random() * al1.size());
				resultList[i] = (int) al1.get(s);
				al1.remove(s);
				System.out.print(resultList[i] + " ");
			}
			
			do {
				b = (int) (Math.random() * 16);
			} while (b == 0);

			System.out.print("---" + b);
			System.out.println();
		}
	}
}
