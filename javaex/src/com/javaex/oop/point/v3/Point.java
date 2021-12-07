package com.javaex.oop.point.v3;


//	v3. 메서드 오버로딩
public class Point {
	private int x;
	private int y;
	
	//	기본 생성자 : 매개 변수가 없는 생성자, 안쓰면 컴파일러가 자동으로 끼워넣어주는 생성자
	public Point() {
		
	}
	
	//	전체 필드 초기화 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	오른쪽 마우스 > 소스 > 게터/세터 생성으로 간단하게 생성 가능
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n",
				x, y);
	}
	
	//	위와 이름이 같으나 매개변수 타입이 다름
	//	메서드 오버로딩
	//	매개변수 타입, 갯수, 순서가 같은 이름의 메서드를 중복 선언할 수 있다.
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을 ", x, y);
		if (bDraw) {	//	true
			message += "그렸습니다.";
		} else {	//	false
			message += "지웠습니다.";
		}
		
		System.out.println(message);
	}
}
