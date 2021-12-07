package com.javaex.oop.goods.v4;


//	v4 : this
//	this : 현재 인스턴스 자신을 지칭
//	this() : 현재 클래스 내부의 다른 생성자 호출시 사용
public class Goods {
	//	필드
	private String name;
	private int price;	//	접근 제한자 private으로 바꾸자 에러 발생
	
	//	생성자 1.
	public Goods(String name) {
		this.name = name;
	}
	
	//	생성자 1.
	public Goods(String name, int price) {
		this(name);
		this.price = price;
	}
	
	//	외부 접근 방식 노출
	//	getter/setter
	public String getName() {
		return name;
	}

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
