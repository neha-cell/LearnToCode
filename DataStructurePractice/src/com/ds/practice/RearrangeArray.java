package com.ds.practice;

import java.util.ArrayList;

public class RearrangeArray {

	public void arrange(ArrayList<Integer> A) {
		int n = A.size();
		for (int i = 0; i < A.size(); i++) {
			A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n);
		}
		for (int i = 0; i < A.size(); i++) {
			A.set(i, A.get(i) / n);
		}
	}
}
