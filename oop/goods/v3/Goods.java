package com.javaex.oop.goods.v3;


//	v3 : 생성자
//	객체의 초기화 담당, new와 함께 호출
public class Goods {
	//	필드
	private String name;
	private int price;	//	접근 제한자 private으로 바꾸자 에러 발생
	
	//	생성자
	//	생성자를 선언하지 않으면 컴파일러가 기본 생성자를 끼워 넣는다.
	//	생성자를 선언하면
	//	컴파일러는 기본 생성자를 끼워넣지 않는다.
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		//	main에서 에러발생, 원래 끼워넣었는데
		//	끼워넣는 순간 기본으로 끼워넣었던게 오류 발생
	}
	//	외부 접근 방식 노출
	//	getter/setter
	public String getName() {
		return name;
	}
	//	setter가 없으면 ReadOnly (읽기 전용)
	public void setName(String name) {	//	return값 필요없기 때문에 void
		this.name = name;	//	혼동되기 때문에 바깥 name에 this 사용
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
