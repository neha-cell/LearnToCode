package com.ds.practice;

import java.math.BigInteger;
import java.util.ArrayList;

public class PlusOne {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		StringBuffer InputStream = new StringBuffer();
		ArrayList<Integer> v = new ArrayList<>();
		String x = null;
		for (int i = 0; i < A.size(); i++) {

			InputStream.append(A.get(i));
		}
		BigInteger b = new BigInteger(InputStream.toString());
		x = b.add(BigInteger.ONE).toString();
		for (int i = 0; i < x.length(); i++) {
			v.add(Integer.parseInt(String.valueOf(x.charAt(i))));
		}
		return v;
	}

	public static void main(String[] args) {
		PlusOne plusOne = new PlusOne();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(9);
		A.add(9);
		A.add(9);
		plusOne.plusOne(A);
	}
}
