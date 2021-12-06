package com.javaex.quiz01;

public class Quiz01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q4
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;

		byte b2 = (byte) i; // 필요
		char ch2 = (char) b; // 필요
		short s = (short) ch; // 필요
		float f = l; // 필요없음 float이 더 크니까
		int i2 = ch; // 필요없음 int가 더 크니까
		// 명시적 형변환이 필요없는 경우는 원래부터 큰 크기였던 자료형일때다.
		// 명시적 형변환은 메모리 오류가 있더라도 개발자가 책임지고 자료형을 바꾸는 것

		System.out.println(b2);
		System.out.println(ch2);
		System.out.println(s);
		System.out.println(f);
		System.out.println(i2);
	}

}
