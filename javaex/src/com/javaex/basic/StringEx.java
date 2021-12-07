package com.javaex.basic;

public class StringEx {

	public static void main(String[] args) {
//		stringEx();
		stringFormatEx();
	}

	private static void stringFormatEx() {
		// 주로 사용하는 %d, %s, %f, %n(개행), %% ...을 사용해보자
		String fruit = "사과";
		int total = 10;
		int eat = 3;

		// 기존 방식
		System.out.println(total + "개의 " + fruit + " 중에서 " + eat + "개를 먹었다.");

		// 탬플릿 문자열
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n", total, fruit, eat); // 문법 알아두기, printf라는거 기억하기

		// 현재 이자율은 1.2%입니다.
		float rate = 1.2f;
		String str = String.format("현재 이자율은 %.1f%%입니다", rate); // %%는 %나타내기 위해 호출, %.1f와 같이 잘라줄 수 있다
		System.out.println(str);
	}

	private static void stringEx() {
		String str1; // 선언
		str1 = "Java"; // Literal
		String str2 = "Java"; // Literal
		String str3 = new String("Java"); //

		System.out.println("str == str2 ? " + (str1 == str2)); // 스트링 풀(같은 곳)에 들어가기 때문에 같다
		System.out.println("str1 == str3 ? " + (str1 == str3)); // 다른 곳에 저장돼있기 때문에 다르다

		// 참조 객체의 경우, ==, !=은 객체의 메모리 주소의 동일성 확인
		// 참조 객체의 값의 비교 : equals, 동작 방식은 나중에 일단 사용해보자

		System.out.println("str1과 str3의 값이 같은가? " + str1.equals(str3));
		// 값 자체만 비교하는 것이기 때문에 저장 위치와 관계없이 같다
	}

}
