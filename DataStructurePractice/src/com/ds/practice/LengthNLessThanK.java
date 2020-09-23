package com.ds.practice;

import java.util.ArrayList;

public class LengthNLessThanK {
	public int solve(ArrayList<Integer> A, int B, int C) {
		int size = 0;
		int sum = 1;
		B = 0;
		if (A.size() == 1) {
			if (A.get(0) <= C) {
				return 0;
			}
		}
		
		B += sum ;
		System.out.println(B);
		return B;
	}

	public static void main(String[] args) {
		LengthNLessThanK m = new LengthNLessThanK();
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(1);
		A.add(2);
		A.add(5);
		int B = 0; 
		int C = 21;
		m.solve(A, B, C);
	}

}
