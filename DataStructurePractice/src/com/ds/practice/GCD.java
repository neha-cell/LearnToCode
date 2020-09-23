package com.ds.practice;

public class GCD {
	public int gcd(int A, int B) {
		int x = 0;
		if(B>A) {
			int temp = B;
			B = A;
			A = temp;
		}

		
		while (A != 0 && B != 0) {
			int quot = A / B;
			int rem = A % B;
			if (A == B * quot + rem) {
				A = B;
				B = rem;
			}
		}
		if (A == 0 && B != 0) {
			return B;
		}
		if (A != 0 && B == 0) {
			return A;
		}
		else return 0;

	}

	public static void main(String[] args) {
		GCD gcd = new GCD();
		int x = gcd.gcd(12, 24);
		System.out.println(x);
	}
}
