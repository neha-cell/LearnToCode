package com.ds.practice;

import java.util.ArrayList;

public class PrimeSum {
	public ArrayList<Integer> primesum(int A) {
		ArrayList<Integer> m = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		m.add(2);
		for(int i = 2;i<A;i++) {
			if (isPrime(i)) {
					m.add(i);
			}
			System.out.println(m);
		}

		for (int i = 0, j = m.size() - 1; i < m.size() && i <= j;) {
			if (m.get(i) + m.get(j) == A) {

				res.add(m.get(i));
				res.add(m.get(j));
				System.out.println(res);
				return res;

			} else if (m.get(i) + m.get(j) > A) {
				j--;

			} else if (m.get(i) + m.get(j) < A) {
				i++;

			}
		}
		System.out.println(res);
		return res;
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		PrimeSum sum = new PrimeSum();
		sum.primesum(1048574);
	}

}
