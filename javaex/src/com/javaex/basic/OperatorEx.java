package com.javaex.basic;

public class OperatorEx {

	public static void main(String[] args) {
//		arithOperEx();
//		prefixIncrEx();
//		suffixIncrEx();
//		logicalOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionalOperEx();
	}

	// 3항 연산자
	private static void conditionalOperEx() {
		int a = 10;
		// a가 짝수면 > 짝수, 혹수면 > 홀수 출력
		System.out.println(a + "은(는) " + (a % 2 == 0 ? "짝수" : "홀수"));

		int score = 85;
		String message;
		// 점수가 90점 이상이면 Good, 50점 미만이면 Fail, 아니면 Pass
		message = score >= 90 ? "Good" : score < 50 ? "Fail" : "Pass";
		// 이런식으로 조건이 여러개면 연달아서 만들고 나머지 조건 마지막에 적어도 됨
		// 다만, 조건 길어지면 가독성 떨어짐, 따라서 복잡해지면 if, switch 쓰기
		System.out.println(message);
	}

	// 비트시프트
	private static void bitShiftOperEx() {
		int val = 1;

		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 3));

		val = 0b1000;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 2));
	}

	// 비트연산자
	private static void bitOperEx() {
		// int에서만 사용 가능
		// 비트 단위의 미세한 제어에 이용
		int b1 = 0b11011101;
		int mask = 0b10101010;

		System.out.println(Integer.toBinaryString(b1)); // 메소드는 나중에 배움
		System.out.println(Integer.toBinaryString(mask));

		System.out.println(Integer.toBinaryString(b1 & mask)); // 비트 논리곱
		System.out.println(Integer.toBinaryString(b1 | mask)); // 비트 논리합
		System.out.println(Integer.toBinaryString(~b1)); // 비트 논리부정
	}

	// 비교, 논리연산
	private static void logicalOperEx() {
		// 비교연산자 : >, >=, <. <=. ==(equal), !=(not equal)
		// 논리연산자 : 논리곱(AND, &&), 논리합(OR, ||), 논리부정(NOT, !)
		int a = 5;
		// a가 0 초과, 10 미만의 값?
		// 조건1: a > 0
		// 조건2: a < 10
		// 결과: 조건1 AND 조건2
		boolean b1 = a > 0;
		boolean b2 = a < 10;

		boolean r = b1 && b2;
		System.out.println("b1 && b2 == " + r);

		// a가 10 이하이거나, 10 이상의 값?
		// 조건 1 : a <= 0
		// 조건 2 : a >= 10
		b1 = a <= 0; // 중복으로 선언 안해도 됨
		b2 = a >= 10;

		r = b1 || b2;
		System.out.println("b1 || b2 == " + r);
		// 위 조건과 영역이 다름

		// 논리 부정(NOT !)
		System.out.println("!r == " + !r);
	}

	// 후위증감
	private static void suffixIncrEx() {
		int a = 7;
		int b = 0;

		b = a++; // a는 8 b는 7
		System.out.println("b : " + b);
		System.out.println("a : " + a);
	}

	// 전위증감
	private static void prefixIncrEx() {
		int a = 7;
		int b = 0;

		b = ++a; // a는 8, b도 8
		System.out.println("b : " + b);
		System.out.println("a : " + a);
	}

	// 산술연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;

		// 부호연산자(+, -) // +는 굳이?
		System.out.println(-a); // -> -1 * a 부호변경

		// 산술연산(+, -, *, /, %(나머지))
		System.out.println(a / b); // int / int -> int가 나온다(나눗셈의 몫)
		System.out.println(a % b); // 정수 나눗셈의 나머지

//		System.out.println(a / 0); // int / 0, 에러 발생, 에러 잘 보는 방법 알아두기
		System.out.println(7.0 / 0); // 무한대가 나옴

		System.out.println(7.0 / 0 + 100); // 무한대가 포함된 산술, 따라서 중간에 확인해봐야함

		// Infinity 체크
		System.out.println(Double.isInfinite(7.0 / 0)); // 인피티니 체크(불리언)
		// 데이터가 NaN인지 체크
		System.out.println(0.0 / 0.0); // Not a Number, 마찬가지로 미리 체크해봐야함
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println(Double.isNaN(7.0 / 0.0)); // infinity는 NaN이 아님
	}

}
