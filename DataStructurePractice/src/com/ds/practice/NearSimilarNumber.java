package com.ds.practice;

import java.util.Arrays;
import java.util.Collections;

public class NearSimilarNumber {
	public String solve(String A) {
		if(A.length()<2) {
			return "-1";
		}
		String[] a = new String[A.length()];
		String[] copy = new String[A.length()];
		a = A.split("");
		copy = Arrays.copyOf(a, a.length);
		Arrays.sort(copy);
		if (Arrays.asList(a).toString().equals(Arrays.asList(copy).toString())) {
			String temp = a[a.length - 1];
			a[a.length - 1] = a[a.length - 2];
			a[a.length - 2] = temp;
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < a.length; j++) {
				sb.append(a[j]);
			}
			String str = sb.toString();
			return str;
		}
		Collections.reverse(Arrays.asList(copy));
		if (Arrays.asList(a).toString().equals(Arrays.asList(copy).toString())) {
			return "-1";
		}
		for (int i = a.length - 2; i >= 0; i--) {
			if (Integer.parseInt(a[i]) < Integer.parseInt(a[i + 1])) {
				String temp = "";
				String smallerNum = "0";
				int index = 0; 
				System.out.println(Arrays.asList(a).toString()+i);
				// Arrays.sort(a,i,a.length);
				for (int k = i+1; k <=a.length - 1; k++) {
					System.out.println(Arrays.asList(a).toString()+k);
					if (Integer.parseInt(a[i]) <= Integer.parseInt(a[k])&& Integer.parseInt(smallerNum)<Integer.parseInt(a[k])) {
						smallerNum = a[k];
						index = k;
						System.out.println(Arrays.asList(a).toString()+"k:" +a[k]);
					} else
						continue;
				}
				System.out.println(a[i]);
				temp = a[index];
				a[index] = a[i];
				a[i] = temp;
//				Collections.reverse(Arrays.asList(a, i+1, a.length));
				System.out.println(Arrays.asList(a).toString());
//				temp = a[i];
//				a[i] = a[i + 1];
//				a[i + 1] = temp;
//				if (Integer.parseInt(a[i]) >= Integer.parseInt(a[i + 1]))
			    Arrays.sort(a, i + 1, a.length);
			    System.out.println(Arrays.asList(a).toString());
				StringBuffer sb = new StringBuffer();
				for (int j = 0; j < a.length; j++) {
					sb.append(a[j]);
				}
				String str = sb.toString();
				return str;
			} else
				continue;
		}
		return "-1";
	}

	public static void main(String[] args) {
		String A = "1734965109968348499255";// 218756,218567,215678
		String A1 = "281765";// 281756,281567,215678,512
		String A2 = "740948";// 8
		String A3 = "215768";// 216578
		String A4 = "115";// 518726,518267,512678,521678
		NearSimilarNumber a = new NearSimilarNumber();
		String z = a.solve(A);
		System.out.println(z);
	}
}
