package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;

public class RotateArray {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size()-B; i++) {
			ret.add(A.get(i + B));
		}
		for (int i = 0; i < B-1; i++) {
			ret.add(A.get(i));
		}
		return ret;
	}

//	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
//		ArrayList<Integer> ret = new ArrayList<Integer>();
//		if (A.size() == 0 || B == 0) {
//			return A;
//		}
//		if (B > A.size()) {
//			for (int i = 0; i < A.size(); i++) {
//				if (B < A.get(i)) {
//					B = i;
//					break;
//				} else
//					B = A.size();
//
//			}
//			rotateArrByB(A, A.size() - B+1, 0);
//			rotateArrByB(A, A.size() - 1, B);
//			rotateArrByB(A, B - 1, 0);
//			return A;
//		} else {
//			rotateArrByB(A, B - 1, 0);
//			rotateArrByB(A, A.size() - 1, B);
//			rotateArrByB(A, A.size() - 1, 0);
//			System.out.println(A);
//			return A;
//		}
//	}

	private void rotateArrByB(ArrayList<Integer> A, int B, int init) {
		for (int i = init; i < B; i++) {
			if (B != 0) {
				int temp = A.get(i);
				A.set(i, A.get(B));
				A.set(B, temp);
				B--;
			}
			System.out.println(A);
		}

	}

	public static void main(String[] args) {
		RotateArray arr = new RotateArray();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(300);
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(8);
		A.add(9);
		A.add(10);
		arr.rotateArray(A, 2);
	}
}
