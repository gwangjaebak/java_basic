package com.javaex.quiz02;

public class Quiz02_1 {
	public static void main(String[] args) {
		// Q1
		int a = 3;
		int b = 6;
		char c = 'A';

		// a는 짝수입니까? true or false
		System.out.println(a % 2 == 0 ? "true" : "false");
		// b는 3의 배수입니까? true or false
		System.out.println(b % 3 == 0 ? "true" : "false");
		// 'a는 짝수이다'와 'b는 3의 배수이다'를 논리곱(AND)으로 연산하여 해당 진위값을 r1 변수에 저장
		boolean r1 = a % 2 == 0 && b % 3 == 0;
		// 결과값 r1을 출력
		System.out.println(r1);
		// c의 4글자 뒤의 문자
		char r2 = (char) (c + 4);
		// 결과값 r2를 출력
		System.out.println(r2);
	}
}
