package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		//	기본 생성자 호출
		p1.setX(10);
		p1.setY(20);
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
		Point p2 = new Point(30, 40);
		//	전체 필드 초기화 생성자
		//	set이 생성자에 들어가있기 때문에 안해줘도 됨
		p2.draw();
		p2.draw(true);
		p2.draw(false);
	}

}
