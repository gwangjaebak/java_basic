package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {
	//	필드
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;	//	아직도 에러, 지금은 추상 메서드를 전부 구현하지 않은 상태라 에러
	}
	
	
	//	마우스 우클릭 > 소스 > 오버라이드 임플리먼트로 자동 완성 가능
	@Override
	public void draw() {
		System.out.printf(
				"사각형[x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸어요.%n",
				x, y, width, height, area());
	}

	@Override
	public double area() {
		return width * height;
	}
}
