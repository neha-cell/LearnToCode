package com.ds.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingInteger {
	 public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 HashSet<Integer> h = new HashSet<>();
		 int count = 0;
		 int arrCount = 0;
		 for(int i =0; i<A.size();i++) {
			 count = count+i+1;
			 if(h.contains(A.get(i))) {
				 arr.add( A.get(i));
				 continue;
			 }
			 h.add(A.get(i));
			 arrCount+= A.get(i);
			 
			 System.out.println(count+"count");
			 System.out.println(arrCount);
		 }
		 int var = Math.abs(count-arrCount);
		 if(var!=count)arr.add (var);
		 return arr;
	    }
	 public static void main(String[] args) {
		 MissingInteger sub = new MissingInteger();
			List<Integer> A = new ArrayList<>();
			A.add(1);
			A.add(2);
			A.add(2);
			A.add(3);
			A.add(4);
			A.add(5);
			A.add(7);
			A.add(8);
			A.add(9);
			ArrayList<Integer>a = sub.repeatedNumber(A);
			System.out.println(a);
	}
}
