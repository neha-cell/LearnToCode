package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RepeatNumber {

	public int repeatedNumber(final List<Integer> A) {
		Collections.sort(A);
		HashSet<Integer> h = new HashSet<>();
		for(int i = 0; i<A.size();i++) {
			if(h.contains(A.get(i))) {
				return A.get(i);
			}
			else h.add(A.get(i));
			
		}
		return -1;
	}
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(3);
		A.add(4);
		A.add(1);
		A.add(4);
		A.add(1);
		RepeatNumber rNumber = new RepeatNumber();
		int i = rNumber.repeatedNumber(A);
		System.out.println(i);
	}

}
