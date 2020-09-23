package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class FirstMissingInteger {
	public int firstMissingPositive(ArrayList<Integer> A) {
		int min = 0;
		if (A.size() < 1) {
			return 1;
		}
		Collections.sort(A);
		int j = 1;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > 0) {
				if(A.get(i)!=j) {
					return j;
				}
				j++;
			}
			System.out.println(A);
		}
		if(j==1) {
			return 1;
		}
		return A.size() + 1;
	}

	public static void main(String[] args) {
		FirstMissingInteger firstMissingInteger = new FirstMissingInteger();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(-417);
//		A.add(1);
//		A.add(3);
//		A.add(4);
//		A.add(5);
//		A.add(6);
//		A.add(7);
//		A.add(8);
//		A.add(9);
//		A.add(10);
		int a = firstMissingInteger.firstMissingPositive(A);
		System.out.println(a);
	}
}
