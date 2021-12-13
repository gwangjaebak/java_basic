package com.javaex;
import java.util.Scanner;

/*
 * 성적처리프로그램.
 * 1.입력 ( 이름, 국, 영, 수)
 * 2.검색 (이름검색, 평균검색(50점이상))
 * 3.출력 (전체출력)
 *
 *
 * class 관계
 *
 * 1. Has ~ A관계(~가 ~를 가지고있다.) => 임베디드오브젝트
 * 2. Is ~ A관계 (~는 ~이다.) => 상속
 * 		is a와 is like a는 다르다 따라서 확장성을 염두에 두고 확장해야함. 안그러면 나중에 다 뜯어고쳐야 됨.
 * 
 * 항상 독립적으로 만들어야 함(부품처럼)
 * 
 * 데이터클래스 : String
 * 
 * 추상클래스
 * 1. 오직 상속을 목적으로 사용.
 * 2. 추상클래스를 상속받는 sub class는 무조건 추상 메소드를 오버라이드를 해야만한다.
 *    하지 않을 경우, 추상 클래스화 돼서 객체를 생성할 수 없다.
 * 3. 추상메소드는 강제성을 발휘하기 때문에 꼭 오버라이드를 해야만한다.
 * 4. 추상클래스보다 더 추상화 된 것은 interface다.
 * 5. 추상메소드, 상수를 갖는게 원칙
 * 6. 인터페이스는 다중 상속을 허용한다. (모호성이 발생하지 않기 때문에)
 * 7. 다중상속을 대체하기 위해 만들어졌다. (대표적인 예 : Thread)
 * 
 * final 붙일수 있는 곳
 * 1. 클래스 > 더 이상 상속금지 : Has ~ A관계로만 써라
 * 2. 메소드 > 오버라이드(메소드 재정의) 금지 : 내 자식들은 내가 만든거 그대로 써라
 * 3. 필드 > 상수(대문자)
 * 
 * 
 * 
 */	

class Halbe {
	public void disp() {
		System.out.println("Halbe");
	}
}

class Abe extends Halbe{
	public void disp() {
		System.out.println("abe");
	}
}
class Me extends Abe{
	public void disp() {
		System.out.println("me");
	}
}

class First{
	public static void main(String[] args) {
		Halbe halbe = new Halbe();
		Abe abe = new Abe();
		Me me = new Me();
		
		Halbe h;
		h = halbe;
		h.disp();
		
		h = abe;	//	동적 바인딩 : 부모의 레퍼런스로 자식을 접근하는 방식
		h.disp();
		
		h = me;
		h.disp();	//	코드가 복잡해질 일이 없음. 유지보수에 편리
		
		halbe.disp();
		abe.disp();
		me.disp();
	}
}

	
	