package com.javaex.oop.goods.v2;


//	v2 : 접근 제한자 (캡슐화)
public class Goods {
	//	필드
	private String name;
	private int price;	//	접근 제한자 private으로 바꾸자 에러 발생
	
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
