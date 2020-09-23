package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;

public class GenerateMatrix {
	public  ArrayList<ArrayList<Integer>> generateMatrix(int A) {
		int count=1;
		
		ArrayList<ArrayList<Integer>> result= new ArrayList<>();
		for(int i=1;i<=A;i++) {
			ArrayList<Integer> sunRes= new ArrayList<>();
			for(int j=0;j<A;j++) {
				sunRes.add(0);
			}
			result.add(sunRes);
		}
		int top=0;
		 int left=0;
		  int down=A-1;
		  int right=A-1;
		  int i=0;
		  int j=0, k=0,w=0;
		  while(count<=A*A) {
			  if(top==left && down==right && top==down) {
				  result.get(top).set(left, count);
				  count++;
			  }
			  
			  i=left;
			  //  forward
			  while(i<right) {
				  result.get(top).set(i, count);
				  count++;
				  i++;
			  }
			  
			  
			  // downward
			  j=top;
			  while(j<down) {
				  result.get(j).set(right, count);
				  count++;
				  j++;
			  }
			  
			  
			  // backward
			  k=right;
			  while(k>left) {
				  
				  result.get(down).set(k, count);
				  count++;
				  k--;
			  }
			  
			  
			  
			  // upward
			  w=down;
			  while(w>top) {
				  result.get(w).set(left, count);
				  count++;
				  w--;
			  }
			  top++;
			  left++;
			  right--;
			  down--;
			  
		  }
		  return result;
		
	}
		
	public static void main(String[] args) {
		GenerateMatrix m = new GenerateMatrix();
		m.generateMatrix(4);
	}

}
