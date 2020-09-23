package com.ds.practice;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
	public int maxSubArray(final List<Integer> A) {
		List<Integer> subArr = new ArrayList<>();
		int maxSum = 0;
		int currSum = A.get(0);
		
		maxSum = A.get(0);
		for(int i=1;i<A.size();i++){
            if(A.get(i)>maxSum+A.get(i)){
            	maxSum=A.get(i);
            }
            else{
            	maxSum+=A.get(i);
            }
            if(currSum < maxSum){
            	currSum=maxSum;
            }
        }
		System.out.println(currSum);
		return currSum;
	}

	public static void main(String[] args) {
		MaxSubArray sub = new MaxSubArray();
		List<Integer> A = new ArrayList<>();
		A.add(-2);
		A.add(1);
		A.add(-3);
		A.add(4);
		A.add(-1);
		A.add(2);
		A.add(1);
		A.add(-5);
		A.add(4);
		sub.maxSubArray(A);
		
	}
}
