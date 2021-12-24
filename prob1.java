package goorm.day1;

import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i=a; i<=b; i++) {
			sum += Math.pow(n, i);
		}
		
		System.out.println(sum);
	}
}
