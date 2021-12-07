package com.javaex.oop.shape.v2;

//	클래스 생성시, 인터페이스 drawable로 설정하면 자동 구현됨
public class Point implements Drawable {
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.printf(
				"점[x=%d, y=%d]을 그렸습니다.%n",
				x, y);
	}
}
