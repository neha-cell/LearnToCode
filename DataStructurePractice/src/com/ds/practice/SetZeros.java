package com.ds.practice;

import java.util.ArrayList;

public class SetZeros {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		for (int i = 0; i < a.size(); i++) {

			for (int j = 0; j < a.get(0).size(); j++) {
				System.out.println(a.get(j).contains(0));
				if (a.get(i).contains(0)) {
					if (a.get(i).get(j) != 0)
						a.get(i).set(j, -1);
					
				}
			}
			System.out.println(a);
		}
		//for (int i = 0; i < a.size(); i++) {
	
			for (int j = 0; j < a.get(0).size(); j++) {
				if (a.get(j).contains(0)) {
					System.out.println(a.get(j)+"j");
					System.out.println(a.get(j));
//					if (a.get(j).get(i) != 0)
//						a.get(j).set(i, -1);
					
				}
//				if(a.get(i).get(j)==0) {
//					for(int k = 0; k<a.size();k++) {
//					
//						a.get(k).set(j, -1);
//					}
//				}
			//}
			System.out.println(a.get(j)+"a(j)");
		}
		

	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		//a1.add(1);
		a1.add(0);
		a1.add(0);
		// a1.add(1);
		a.add(a1);
//		a2.add(1);
//		a2.add(1);
//		a2.add(1);
		// a2.add(1);
		//a.add(a2);
		//a3.add(1);
		a3.add(1);
		a3.add(1);
		// a3.add(1);
		a.add(a3);
//		a4.add(1);
//		a4.add(1);
//		a4.add(0);
//		a4.add(1);
//		a.add(a4);
		SetZeros zer = new SetZeros();
		zer.setZeroes(a);
	}
}
