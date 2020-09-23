package com.ds.practice;

import java.math.BigInteger;

public class BinaryRepresentation {
	 public String findDigitsInBinary(int A) {
		 Integer I = A;
		StringBuffer s = new StringBuffer();
		if(I==0) {
			s.append(0);
		}
		while(I>0) {
			
			if(I==1) {
				s.append(String.valueOf(I));
			}
			else{
				s.append(I%2);
			}
			I=I/2;
		}
		return s.reverse().toString();
	 }
	 public static void main(String[] args) {
		BinaryRepresentation binaryRepresentation = new BinaryRepresentation();
		binaryRepresentation.findDigitsInBinary(2);
	}
}
