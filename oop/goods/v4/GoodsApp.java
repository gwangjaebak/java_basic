package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		//	할당연산 앞에는 받을 것 넣을수 있음 못 넣음
//		Goods notebook = new Goods();	//	힙에 객체 생성
//		notebook.setName("Macbook Air");
//		notebook.setPrice(1600000);
		
		//	생성자 1 호출
		Goods notebook = new Goods("Macbook Air");
		notebook.setPrice(1600000);
		
		//	생성자 2 호출
		Goods smartphone = new Goods("iPHONE 13");
		//	메모리 다른 공간에 객체 생성
		smartphone.setPrice(1000000);
		
//		System.out.printf("%s, %d원%n",
//				notebook.getName(),
//				notebook.getPrice();

		notebook.showInfo();
//		System.out.printf("%s, %d원%n",
//				smartphone.getName(),
//				smartphone.getPrice();
		
		smartphone.showInfo();

	}
}
