package com.ds.practice;

public class PalindromeInteger {
	 public int isPalindrome(int A) {
		 int b = A;
		 int c = 0;
		 while (A>0) {
			
			 int rem = A%10;
			 A = A/10;
			 c = c*10+rem;
		 }
		 if(b==c) {
			 System.out.println("czx");
			 return 1;
		 }
		 else return 0;
	    }
	 public static void main(String[] args) {
		PalindromeInteger p = new PalindromeInteger();
		p.isPalindrome(1221);
	}

}
