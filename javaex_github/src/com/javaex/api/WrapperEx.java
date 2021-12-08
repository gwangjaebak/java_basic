package com.javaex.api;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer(10);	//	deprecated, 코드에 줄 그어짐, 빠른 시일 내에 고치세요.
		//	정석 박싱
		Integer i2 = Integer.valueOf(10);
		
		Integer i3 = Integer.valueOf("10");
		
		//	자동 박싱
		Integer i4 = 10;	//	Integer i4 = Integer.valueOf(10);
		
		//	자동 언박싱
		int value = i4;		//	int value = i4.intValue();
		
		//	포장된 값의 비교
		System.out.println(i == i2);	//	false, 자동 박싱 언박싱 되도 객체가 아닌건 아니어서
		//	Wrapper 클래스도 객체다. 객체 주소의 비교
		
		//	따라서 이런식으로 비교해줘야 함
		System.out.println(i.intValue() == i2.intValue());
		System.out.println(i.equals(i2));
	}
}
