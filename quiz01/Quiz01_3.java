package com.javaex.quiz01;

public class Quiz01_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q3
		System.out.println("1" + "3");
		System.out.println(true + "Java");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('J' + "ava");
		System.out.println(false);
		// 마지막꺼 오류, 왜? 연산자 "+"는 boolean, null에 정의되지 않아서
		// true, false는 상관없으나 프린트에서 null은 모호하다.
	}

}
