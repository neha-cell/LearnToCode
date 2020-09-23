package com.ds.practice;

import java.util.ArrayList;

public class InfiniteGrid {
	public int coverPoints1(ArrayList<Integer> A, ArrayList<Integer> B) {
		int count1 = 0;
		int count2 = 0;
		if(A.size()==1) {
			return 0;
		}
		for(int i = 0; i<A.size()-1;i++) {
			if(A.get(i)<0&&A.get(i+1)<0) {
				count1 += Math.abs(Math.abs(A.get(i))-Math.abs(A.get(i+1)));
			}
			else if(A.get(i)>=0&&A.get(i+1)>=0){
				count1 +=Math.abs( Math.abs(A.get(i))-Math.abs(A.get(i+1)));
			}
			else {
				count1 +=Math.abs( Math.abs(A.get(i))+Math.abs(A.get(i+1)));
			}
		}
		for(int i = 0; i<B.size()-1;i++) {
			if(B.get(i)<0&&B.get(i+1)<0) {
				count2 += Math.abs(Math.abs(B.get(i))-Math.abs(B.get(i+1)));
			}
			else if(B.get(i)>=0&&B.get(i+1)>=0){
			
				count2 += Math.abs(Math.abs(B.get(i))-Math.abs(B.get(i+1)));
			}
			else {
				
				count2 += Math.abs(Math.abs(B.get(i))+Math.abs(B.get(i+1)));
			}
		}
		System.out.println( count1+count2);
		return count1+count2;
	}
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		int numSteps = 0;
		for(int i = 1; i < X.size(); i++){
		numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) );
		}
		System.out.println(numSteps);
		return numSteps;
		}

	public static void main(String[] args) {
		InfiniteGrid grid = new InfiniteGrid();
		ArrayList<Integer> A= new ArrayList<>();
		ArrayList<Integer> B= new ArrayList<>();
		A.add( 4);
		A.add(8);
		A.add(-7);
		A.add(-5);
		A.add(-13);
		A.add(9);
		A.add(-7);
		A.add(8);
		B.add(4);
		B.add(-15);
		B.add(-10);
		B.add(-3);
		B.add(-13);
		B.add(12);
		B.add(8);
		B.add(-8);
		grid.coverPoints(A, B);
	}

}
