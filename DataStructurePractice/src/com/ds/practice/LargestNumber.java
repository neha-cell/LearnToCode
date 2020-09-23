package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public String largestNumber(List<Integer> nums) {
	    String[] arr = new String[nums.size()];
	    for(int i=0; i<nums.size(); i++){
	        arr[i]=String.valueOf(nums.get(i));
	    }
	 
	    Arrays.sort(arr, 
	       (String a, String b)->{
	            return (b+a).compareTo(a+b);
	        });
	  
	
	    StringBuilder sb = new StringBuilder();
	    for(String s: arr){
	    	//System.out.println(s);
	        sb.append(s);
	    }
	 
	    while(sb.charAt(0)=='0'&&sb.length()>1)
	        sb.deleteCharAt(0);
	    System.out.println(sb.toString());
	    return sb.toString();
	}

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		LargestNumber largestNumber = new LargestNumber();
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(1);

		largestNumber.largestNumber(A);
	}
}
