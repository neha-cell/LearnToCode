package com.ds.practice;

import java.util.ArrayList;

public class PrimeNumInRange {
	public ArrayList<Integer> sieve(int A) {
		ArrayList<Integer> M = new ArrayList<>();
		if(A<2) {
			return M; 
		}
		for(int i = 1; i<A;i++) {
			
			M.add(i+1);
		}
		for(int j = 1; j<M.size();j++) {
			for(int k = 0; j>k&k<M.get(j)/2;k++) {
				if(j==M.size()-1) {
					if(M.get(j)%M.get(k)==0) {
						M.remove(M.get(j));
						k=-1;
						System.out.println(M);
					return M;
					}
				}
				if(M.get(j)%M.get(k)==0) {
					M.remove(M.get(j));
					k=-1;
					
				}
			}
			
		}
		return M;
		
    }
	public static void main(String[] args) {
		PrimeNumInRange range = new PrimeNumInRange();
		range.sieve(100000);
	}

}
