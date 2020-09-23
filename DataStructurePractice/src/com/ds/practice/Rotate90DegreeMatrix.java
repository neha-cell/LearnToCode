package com.ds.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Rotate90DegreeMatrix {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
		  int j = 0;
		  int i = 0;
		 while(i<a.size()) { 
		 Collections.reverse(a.get(i));
		  rotateIndex(a,i,j);
		  i++;
		  j++;
		 }
	  }
	
	public ArrayList<ArrayList<Integer>> rotateIndex(ArrayList<ArrayList<Integer>> a , int m,int j) {
		int z = a.size()-1;
		for(int i = 0; i<a.size()-1-m;i++) {
			int temp = a.get(z).get(j);
			a.get(z).set(j, a.get(j).get(i));
			a.get(j).set(i, temp);
			System.out.println(a+"s");
			z--;
		}
		 return a;
	}
	

	public static void main(String[] args) {
		Rotate90DegreeMatrix degreeMatrix = new Rotate90DegreeMatrix();
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		A.add(a1);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		A.add(a2);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(9);
		a3.add(10);
		a3.add(11);
		a3.add(12);
		A.add(a3);
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(13);
		a4.add(14);
		a4.add(15);
		a4.add(16);
		A.add(a4);
		degreeMatrix.rotate(A);
		}
}
