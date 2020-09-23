package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;

public class TripletSumFrame {
	public int solve(ArrayList<String> A) {
		int count = 0;
		if(A.size()<3) {
			return count;
		}
		ArrayList<Double> res = new ArrayList<>();
		Collections.sort(A);
		int j = 0; 
		
		for(int i = A.size()-1; i>=0&&i<j;) {
			double sum = 0;
				
				sum = sum+ Double.parseDouble(A.get(j))+Double.parseDouble(A.get(j+1))+Double.parseDouble(A.get(i));
				
				if(sum>=2) {
					i--;
				}else if(sum<=1) {
					j++;
				}else return 1;
		}
		return count;
    }
public static void main(String[] args) {
	TripletSumFrame t = new TripletSumFrame();
	ArrayList<String> A = new ArrayList<>();
	A.add("0.366507"); 
	A.add( "0.234601");
	A.add( "0.126313");
//	A.add("1.372403");
//	A.add("2.022170");
//	A.add("0.308558");
//	A.add("2.120754");
//	A.add("1.561462");
	
	
	
	t.solve(A);
}
}
