package com.java.p2;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		String[] numarr= num.split("");
		
		Arrays.sort(numarr);
		
		int num1 = Integer.parseInt(numarr[3]);
		int num2 = Integer.parseInt(numarr[2]);
		int num3 = Integer.parseInt(numarr[1]);
		int num4 = Integer.parseInt(numarr[0]);
		
		System.out.println(num1*1000 +
							num2*100 +
							num3*10 +
							num4*1);
	}
}
