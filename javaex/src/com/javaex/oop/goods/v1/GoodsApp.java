package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		//	할당연산 앞에는 받을 것 넣을수 있음 못 넣음
		Goods notebook = new Goods();	//	힙에 객체 생성
		notebook.name = "Macbook Air";
		notebook.price = 1600000;
		
		Goods smartphone = new Goods();	//	메모리 다른 공간에 객체 생성
		smartphone.name = "iPHONE 13";
		smartphone.price = 1000000;
		
		System.out.printf("%s, %d원%n",
				notebook.name,
				notebook.price);
		
		System.out.printf("%s, %d원%n",
				smartphone.name,
				smartphone.price);
		
	}
}
