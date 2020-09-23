package com.ds.practice;

public class IntegerBit1Count {

	public static void main(String[] args) {
		IntegerBit1Count count = new IntegerBit1Count();
		int number = 32566;
		count.countOccurences(number);
		parityCheck(1245L);
	}

	public static short parityCheck(long x) {
		short result = 0;
		while (x != 0) {
			result ^= 1;
			System.out.println(result);
			x &= (x - 1); // Drops the lowest set bit of x.
			System.out.println(x);
		}
		return result;
	}

	public short countOccurences(int number) {

		short numBits = 0;
		while (number != 0) {
			numBits += (number & 1);
			System.out.println(numBits + " " + number);
			number >>>= 1;
		}
		System.out.println(numBits);
		return numBits;
	}

}
