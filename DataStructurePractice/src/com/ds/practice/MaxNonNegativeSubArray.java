package com.ds.practice;

import java.math.BigInteger;
import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
		ArrayList<Integer> Al = new ArrayList<>();
		ArrayList<Integer> A2 = new ArrayList<>();
		int maxSum = 0;
		int currSum = 0;
		for (int i = 0; i < A.size(); i++) {

			while (A.get(i)%Integer.MAX_VALUE >= 0) {

				if (i >= A.size() - 1) {
					break;
				} else {
					currSum =currSum+ A.get(i);
					Al.add(A.get(i));
					i++;
				}
			}
			if (A.get(i) < 0) {
				if (maxSum <= currSum) {
					maxSum = currSum;
					A2.addAll(Al);
					Al.removeAll(A);
				}
				currSum = 0;
				
				if (maxSum <= currSum) {

					A2.addAll(Al);
					Al.removeAll(A);
				}
			}
			if (maxSum <= currSum) {
				A2.addAll(Al);
				Al.removeAll(A);
			}
		}

		System.out.println(A2);
		return A2;
	}

	public static void main(String... args) {
		MaxNonNegativeSubArray subArray = new MaxNonNegativeSubArray();
		ArrayList<Integer> A = new ArrayList<>();
		A.add( 336465782);
		A.add(-278722862);
		A.add(-2145174067);
		A.add(1101513929);
		A.add(1315634022);
		A.add(-1369133069);
		A.add(1059961393);
		A.add(628175011);
		A.add(-1131176229);
		A.add(-859484421);
		subArray.maxset(A);
	}
}
