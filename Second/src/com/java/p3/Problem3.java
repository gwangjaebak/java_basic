package com.java.p3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
    	int real1 = sc.nextInt();
    	int imag1 = sc.nextInt();
    	int real2 = sc.nextInt();
    	int imag2 = sc.nextInt();
    	
    	int resultim = (real1 * imag2) + (imag1 * real2);
    	int resultre = (real1 * real2) - (imag1 * imag2);
    	
    	if (resultim == 0) {
    		System.out.println(resultre);
    	} else if (resultre == 0) {
    		System.out.println(resultim +"i");
    	} else {
    		System.out.println(resultre + " + " + resultim + "i");
    	}
	}
}
