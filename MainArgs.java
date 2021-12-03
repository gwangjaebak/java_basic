package com.javaex.basic;

public class MainArgs {

	public static void main(String[] args) { //	외부에서 받기 위해서 인자를 받아둠. 평상시에는 안쓰나 이렇게 확인해볼수 있음.
		// 프로그램 실행시 외부에서 전달되는 매개변수들(일종의 옵션)
		System.out.println("매개변수의 갯수:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("매개변수:" + args[i]);
		}
	}
}
