package com.javaex.basic;

public class MainArgs {

	public static void main(String[] args) { //	외부에서 받기 위해서 인자를 받아둠. 평상시에는 안쓰나 이렇게 확인해볼수 있음.
		System.out.println("매개변수의 갯수:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("매개변수:" + args[i]);
		}
	}
}
//모든 함수는 매개변수를 사용할수도 있고 않을수도 있습니다. 이는 main 함수도 마찬가지 입니다.
//그러나 일반 함수는 메인함수 내부에서 호출하기 때문에 입력값을 적어도 main 함수 안에서 정할 수 있습니다.
//그러나 main 함수는 프로그램 실행 시 처음으로 수행되는 함수이기 때문에, 외부로부터 값을 입력받을 수 있어야 합니다.
//프로그램 내부에서 값을 호출할 수가 없으며, 이렇기 때문에 항상 문자열 인자를 받게됩니다.
//외부로부터 값을 입력받는건 이런 의미입니다.
