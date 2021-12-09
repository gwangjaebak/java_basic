package com.java.p3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size+1];
		
		int sum = 0;
	
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i=2; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			sum += arr[i];
		}
		System.out.println(sum+1);
	}

}
