package com.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		//	기본 생성자 호출
		p1.setX(10);
		p1.setY(20);
		p1.draw();
		
		Point p2 = new Point(30, 40);
		//	전체 필드 초기화 생성자
		//	set이 생성자에 들어가있기 때문에 안해줘도 됨
		p2.draw();
	}

}
