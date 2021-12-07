package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		System.out.println("p = " + p);
		
		Point p2 = p.getClone();	//	복제
		System.out.println("p2 = " + p2);
		
		System.out.println("p == p2 ? " +
				(p == p2));	//	같은 객체가 아님, 완벽한 복제
		
		//	완벽하게 분리됐느지 확인을 위해 p값을 바꿔보자.
		
		p.setX(100);
		p.setY(200);
		
		System.out.println("p = " + p);
		System.out.println("p2 = " + p2);	//	p2는 영향을 받지 않음
	}
}
