package com.javaex;
//	이클립스 단축기 정리하기
abstract class Abs{
	abstract void disp();	//	"disp"
}

class Outter{
	
	private int num = 10;
	private static int num2 = 3;
	
	public void output() {
		new Abs() {
			
			@Override
			void disp() {
				System.out.println(num);
				System.out.println(num2);
			}
		}.disp();
	}
}


public class MemberInnerTest {

	public static void main(String[] args) {
		Outter out = new Outter();
		out.output();
	}	
}