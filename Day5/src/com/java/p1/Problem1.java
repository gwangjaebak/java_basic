package com.java.p1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int range1 = sc.nextInt();
		int range2 = sc.nextInt();
		
		int sum = 0;
		
		for (int j=range1-1; j<=range2-1; j++){
			sum += arr[j];
		}
		
		System.out.println(sum);
	}

}
