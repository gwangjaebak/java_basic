package com.java.p3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		
		int min = 100000;
		int sum = 0;
    	
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	
    	for (int i=num1; i<=num2; i++) {
    		if((int)(Math.sqrt(i) * (int)(Math.sqrt(i))) == i) {
    			sum += i;
    			if (min > i) {
    				min = 0;
    				min += i;
    			}
    		}
    	}
    	System.out.println(min + " " + sum);
    }
}