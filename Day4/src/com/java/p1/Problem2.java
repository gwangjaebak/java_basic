package com.java.p1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int eqsub1 = arr[1] - arr[0];
		int eqsub2 = arr[2] - arr[1];
		
		int eqmul1 = arr[1] / arr[0];
		int eqmul2 = arr[2] / arr[1];
		
		if (eqsub1 == eqsub2) {
			int subresult = arr[3] + eqsub1;
			System.out.println(subresult);
		} else if (eqmul1 == eqmul2) {
			int mulresult = arr[3] * eqmul1;
			System.out.println(mulresult);
		}
	}
}
