package com.ds.practice;

import java.util.ArrayList;

public class FizzBuzz {
	public ArrayList<String> fizzBuzz(int A) {
		Integer i = 0; 
		ArrayList<String> arr = new ArrayList<String>();
		while(i<A){
	        i++;
	       if(i%3==0){
	          
	           if(i%5==0){
	              arr.add("FizzBuzz");
	           }
	           else{
	                arr.add("Fizz");
	           }
	       }
	       else if(i%5==0){
	         arr.add("Buzz");  
	       }
	       else{
	           arr.add(i.toString());
	       }
	    }
	    return arr;
	 }

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		ArrayList<String>A = fb.fizzBuzz(23);
		System.out.println(A);
	}

}
