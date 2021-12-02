package com.javaex.basic;

import java.util.Scanner;

// util.Scanner; 해야됨

public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutputEx();
		consoleInputEx();
	}
	// 콘솔 입력
	private static void consoleInputEx() {
		//오류 발생, 
		Scanner scanner = new Scanner(System.in); //새로운 객체 생성, System.in은 키보드 입력
		System.out.print("이름은? ");
		String name = scanner.next();
		System.out.print("나이는? ");
		int age = scanner.nextInt();
		
		System.out.println("당신의 나이는 " + age + "세" + ", 이름은 " + name + "입니다.");
		
		scanner.close(); //잊지 말자
	}
	// 콘솔 출력
	private static void consoleOutputEx() {
		// System.out.print : 개행 X
		// System.out.println : 개행 O
		// System.out.printf : 형식지정 문자열 출력 -> String.format
		System.out.print("Hello "); // 개행 X
		System.out.println("Java "); // 개행 O
		
		// 이스케이프 문자
		// \n(개행), \t(탭문자), \"(따옴표), \ \(역슬래시)
		System.out.println("Hello \nJava"); // 개행
		System.out.println("Hello \tJava"); // 탭문자
		System.out.println("Hello \"Java\"");
		System.out.println("Hello \\Java"); // 역슬래시
		
		String dir = "C:\\Users\\Bit\\Desktop"; // 역슬래시 안해주면 할당 자체가 안됨(오류)
		System.out.println(dir);
	}

}
