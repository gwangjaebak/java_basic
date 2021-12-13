package com.java.p3;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int size = sc.nextInt();
    	int[][] arr = new int[size][size];
    	
    	
    	for (int i=0; i<size; i++) {
    		for (int j=0; j<size; j++) {
    			arr[i][j] = sc.nextInt();
    		}
    	}
    	
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	int num3 = sc.nextInt();
    	int num4 = sc.nextInt();
    	
    	int sum = 0;
    	
    	for (int k=num1; k<=num3; k++) {
    		for (int l=num2; l<=num4; l++) {
    			sum += arr[k][l];
    		}
    	}
    	
    	System.out.println(sum);
    }
}