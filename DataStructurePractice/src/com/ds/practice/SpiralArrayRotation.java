package com.ds.practice;

import java.util.ArrayList;
import java.util.List;

public class SpiralArrayRotation {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		int top = 0;
		int right = A.get(0).size();
		int left = 0;
		int bottom = A.size();
		int direction = 0;
		int j = 0;
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i<A.size();i++) {
			j = A.size()*A.get(i).size();
		}
		if (top == bottom - 1 && left == right - 1) {
			for (int i = 0; i < A.size(); i++) {
				result.add(A.get(i).get(i));
			}
			return result;
		}
		if (top == bottom - 1) {
			for (int i = 0; i < A.get(left).size(); i++) {
				result.add(A.get(left).get(i));
			}
			return result;
		}
		if (left == right - 1) {
			for (int i = 0; i < bottom; i++) {
				result.add(A.get(i).get(top));
			}
			return result;
		}
		while (top <= bottom && left <= right - 1 && result.size()<j) {

			if (direction == 0) {
				for (int i = left; i <= right - 1; i++) {
					if (left < right-1) {
						result.add(A.get(top).get(i));
					}
				}
				top++;
			}
			if (direction == 1) {
				for (int i = top; i < bottom; i++) {
					result.add(A.get(i).get(right - 1));
				}
				right--;
			}
			if (direction == 2) {
				for (int i = right - 1; i > left; i--) {
					if(right>left)
					result.add(A.get(bottom - 1).get(i));
				}
				bottom--;

			}
			if (direction == 3) {
				for (int i = bottom; i >= top; i--) {
					result.add(A.get(i).get(left));
				}
				left++;
			}
			direction = (direction + 1) % 4;
		}
		System.out.println(result);
		return result;

	}

	public static void main(String[] args) {
		SpiralArrayRotation rotation = new SpiralArrayRotation();
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		ArrayList<Integer> AList = new ArrayList<>();
		AList.add(1);
		AList.add(2);
		AList.add(3);
		AList.add(1);
		AList.add(2);
		
		A.add(AList);
		ArrayList<Integer> BList = new ArrayList<>();
		BList.add(4);
		BList.add(5);
		BList.add(6);
		BList.add(4);
		BList.add(5);
		
		A.add(BList);
		ArrayList<Integer> CList = new ArrayList<>();
		CList.add(7);
		CList.add(8);
		CList.add(9);
		// A.add(CList);
		rotation.spiralOrder(A);
	}
}
