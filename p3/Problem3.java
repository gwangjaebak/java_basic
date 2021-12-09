package com.java.p3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int sum = 0;
		
		
		for (int i=0; i<=size; i++) {
			if(i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}