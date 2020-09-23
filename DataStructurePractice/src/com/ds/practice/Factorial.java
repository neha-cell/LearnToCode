package com.ds.practice;

import java.math.BigInteger;

public class Factorial {
	
	public String solve1(int A) {
		Integer factorial = 1;
		
		while(A>1) {
			factorial*=A;
			A--;
		}
		if(A==1) {
			return factorial.toString();
		}
	
		return factorial.toString();
    }
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.solve(100);
	}
	public String solve(int n) {
		BigInteger  i =factorial(n);
		System.out.println(i);
		return i.toString();
	}
	public BigInteger factorial (int numero ){
	    if (numero < 0) {
	        return BigInteger.ZERO;
	    } else if (numero==0){
	        return BigInteger.ONE;
	    } else {
	        return BigInteger.valueOf(numero).multiply(factorial(numero-1));
	    }
	}
}
