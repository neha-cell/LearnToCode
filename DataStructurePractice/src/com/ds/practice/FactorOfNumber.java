package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;

public class FactorOfNumber {
	public ArrayList<Integer> allFactors1(int A) {
		ArrayList<Integer> z = new ArrayList<>();
		if (A < 1) {
			return z;
		}
		if(A==1) {
			z.add(1);
			return z;
		}
		for (int i = 1; i <= A/2; i++) {
			
			if (A % i == 0) {
				z.add(i);
			}
		}
		z.add(A);
		System.out.println(z);
		return z;
	}
	 public ArrayList<Integer> allFactors(int A) {
			ArrayList<Integer> z = new ArrayList<>();
			ArrayList<Integer> m = new ArrayList<>();
			if (A < 1) {
				return z;
			}
			if(A==1) {
				z.add(1);
				return z;
			}
			for(int i = 1; i<Math.sqrt(A);i++) {
				if(A%i==0) {
					z.add(i);
					if(i!=Math.sqrt(A)) {
						z.add(A/i);
					}
				}
			}
			if(A%Math.sqrt(A)==0) {
				z.add((int) Math.sqrt(A));
			}
			Collections.sort(z);
			return z;
		}
	public static void main(String[] args) {
		FactorOfNumber f = new FactorOfNumber();
		f.allFactors(21);
	}
}
