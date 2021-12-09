package com.javaex.oop.shape.v2;

//	클래스 생성할때, 슈퍼클래스를 선택하면 자동으로 기본 틀 구현해줌

public class Circle extends Shape implements Drawable {
	protected double r;	//	반지름
	
	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸어요.%n",
				x, y, r, area());
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

}
