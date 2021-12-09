package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	//	에러, 추상 클래스는 객체화 할 수 없다
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();	//	특정 메소드를 강요하는 측면이 있다
		
		Circle c = new Circle(10, 10, 30);
		c.draw();
		
		Point p = new Point(100, 100);
		
		System.out.println("p는 Drawable을 구현했는가? "
				+ (p instanceof Drawable ? "Drawable" : "Drawable이 아님"));
		
		//	인터페이스로 구현 객체를 참조할 수 있다.
		Drawable[] objs = new Drawable[] {
				r, c, p
		};
		
		for (Drawable obj: objs) {
			obj.draw();
		}
	}
}
