package com.java.p1;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double sqrt3 = Math.sqrt(3);
		double num = sc.nextInt();
		double divnum = num / 2;
		
		double oneresult = ((divnum * sqrt3) * num) / 2;
		double result = oneresult * 6;
		
		System.out.printf("%.2f", result);
		
	}

}
