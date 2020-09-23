package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class NobleInteger {
	public int solve(ArrayList<Integer> A) {

		Collections.sort(A);
		int n = A.size();
		if (A.get(n - 1) == 0)
			return 1;

		for (int i = 0; i < n - 1; i++) {
			if (A.get(i + 1) == A.get(i))
				continue;
			if (n - i - 1 == A.get(i))
				return 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		NobleInteger np = new NobleInteger();
		ArrayList<Integer> A = new ArrayList<>();

		A.add(1);
		A.add(2);
		A.add(7);
		A.add(0);
		A.add(9);
		A.add(3);
		A.add(6);
		A.add(0);
		A.add(6);
		np.solve(A);
	}
}
