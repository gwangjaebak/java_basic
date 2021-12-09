package com.java.p3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int sum = 0;
		
		for (int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int range1 = sc.nextInt();
		int range2 = sc.nextInt();
		
		for (int j=range1; j<=range2; j++){
			sum += arr[j-1];
		}
		
		System.out.println(sum);
	}

}
