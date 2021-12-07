package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		//	Object의 메서드를 기본 상속
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());	//	객체 식별자
		System.out.println(
				Integer.toHexString(p.hashCode()));	//	16진수 출력
		System.out.println(p);
		System.out.println(p.toString());
	}
}
