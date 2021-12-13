package com.java.p3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String num = sc.next();
    	
        int bonus = 0;
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
        	
            if (num.charAt(i) == 'o') {
                bonus++;
                sum += bonus;
            }
            
            else {
                bonus = 0;
            }
        }
        
        System.out.println(sum);
    }
}