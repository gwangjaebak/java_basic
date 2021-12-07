package com.javaex.oop.point.v4;

//	상속과 override
public class ColorPoint extends Point {	//	기본 생성자를 안적어서 에러
//	ColorPoint(){
//		super();	//	아무것도 안적으면 이게 생략된거라고 봐야됨
//	}
	private String color;
	
	//	생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);	//	부모 생성자
		this.color = color;
	}
	
	@Override	//	컴파일러에게 이 메서드가 오버라이딩한 메서드인지를 확인
	public void draw(boolean bDraw) {
		//	부모로부터 물려받은 메서드를 덮어쓰기
		String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ",
//				super.getX(), super.getY(), color);	//	이렇게 접근해줘도 됨
		//아니면 protected 제한자로 만들어주면 됨
				x, y, color);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		
		System.out.println(message);
		//	부모의 메서드를 호출하려면
		super.draw(bDraw);
	}
}
