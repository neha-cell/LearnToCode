package com.ds.practice;

import java.util.Arrays;
import java.util.Properties;

public class ExcelNumber {
	   public int titleToNumber(String A) {
		   A = A.toUpperCase();
		   int c = 0;
		   int j = 0;
			char[] ch = A.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				Arrays.sort(ch);
				System.out.println(c);
				c = c+(int)(Math.pow(26, j))*(ch[i]-64);
				j++;
			}
			return c;
		 }
	   public static void main(String[] args) {
		ExcelNumber num = new ExcelNumber();
		int x =num.titleToNumber("AAZ");
		System.out.println(x);
	}

}
