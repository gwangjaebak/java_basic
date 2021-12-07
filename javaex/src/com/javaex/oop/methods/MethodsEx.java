package com.javaex.oop.methods;

public class MethodsEx {

	public static void main(String[] args) {
		//	입력 x, 출력 x
//		printMessage();
		
		//	입력 o, 출력 o
		double result = getSum(4, 5);
		System.out.println("4 + 5 = " + result);
		
		//	입력 x, 출력 o
		//	입력 o, 출력 x
		
		System.out.println(getTotal(new double[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9
		}));
		System.out.println(getTotalVar(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		printTotal("합계", 1, 2, 3, 4, 5, 6, 7, 8, 9, 0); 	//	 합계 : 고정인수, 숫자 : 가변인수
	}
	//	고정인자 + 가변인자 -> 정의 순서 중요
	private static void printTotal(String message,
			double ... values) {
		System.out.println(message + ":" + getTotal(values));
	}
	
	
	//	가변 인수를 이용한 다수 인수 전달
	private static double getTotalVar(double ... values) {	//values에 배열로 묶여서 전달
//		double total = 0;
//		
//		for (double value: values) {
//			total += value;
//		}
//		
//		return total;
		return getTotal(values);
	}
	
	//	배열로 매개변수 전달
	private static double getTotal(double[] values) {
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		
		return total;
	}
	
	private static double getSum(double num1, double num2) {
		//	매개변수 갯수는 제한이 없음
		//	결과 리턴시 메서드의 타입과 결과 데이터의 타입이 일치해야
		return num1 + num2;
	}
	
	private static void printMessage() {
		System.out.println("Hello Java");
	}
}
