package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		switchEx();
		switchEx2("MON"); // String 값을 적어줘야 함
	}

	private static void switchEx2(String day) { // day 값을 전달
		String message;

		switch (day) {
		case "MON": // 케이스를 String으로 받을 수 있다
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "열공 후 불금";
			break;
		case "SAT":
		case "SUN":
			message = "주말";
			break;
		default:
			message = "?";

		}
		System.out.println(day + "에는 " + message); // 이렇게 string변수 message를 만들어서 찍어주는 방법도 있음
	}

	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.println("1.Java, 2.C, 3.C++, 4.Python");

		int code = scanner.nextInt();

		switch (code) {
		case 1: // if (code == 1)
			System.out.println("R101");
			break; // 잊지말자 break
		case 2: // else if (code == 2)
			System.out.println("R202");
			break;
		case 3: // esle if (code == 3)
			System.out.println("R303");
			break;
		case 4: // else if (code == 4)
			System.out.println("R404");
			break;
		default:
			System.out.println("상담원 문의"); // default 뒤에는 break 쓸 필요 없음(당연)
		}
		scanner.close();
	}

	private static void ifElseEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.println("1.Java, 2.C, 3.C++, 4.Python");

		int code = scanner.nextInt();

		if (code == 1) {
			System.out.println("R101");
		} else if (code == 2) {
			System.out.println("R202");
		} else if (code == 3) {
			System.out.println("R303");
		} else if (code == 4) {
			System.out.println("R404");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}

		scanner.close();
	}

	// if문 연습
	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);

		// if ~ else if ~ else
		System.out.print("정수입력 : ");
		int num = scanner.nextInt();

//		if (num > 0) { //양수면 남은거 체크할 필요없이 조건문 끝남
//			System.out.println(num + "는 양수입니다.");
//		} else if (num < 0) { //음수면 남은거 체크할 필요없이 조건문 끝남
//			System.out.println(num + "는 음수입니다.");
//		} else {
//			System.out.println("0입니다."); //0이면 조건문 끝남	
//		}

		// 중첩 if
		if (num == 0) {
			System.out.println("0입니다.");
		} else { // 양수 or 음수
			if (num > 0) { // else의 품 안에서 한번 더 걸러냄
				System.out.println(num + "는 양수입니다.");
			} else { // 그 안에서도 나머지(음수)
				System.out.println(num + "는 음수입니다.");
			}
		}

		scanner.close();
	}
}
