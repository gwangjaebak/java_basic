package com.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q5
		int num1 = 13579;
		int num2 = 13579;

		System.out.println(++num1 + 1 == num2++ + 1 ? "같음" : "다름");

		System.out.println(num1);
		System.out.println(num2);
		// 알수 있는 것 : 최종 값은 같으나,
		// 프린트를 할 당시, 후위 가산인지 전위 가산 여부가 다르기 때문에
		// 값이 "다름"으로 나왔다.
	}

}
