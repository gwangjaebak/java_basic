package com.javaex.api.collection.list;

import java.util.Stack;

//	Stack : Last Input First Output(LIFO : 후입선출)
public class StackEx {

	public static void main(String[] args) {
		//	스택 선언
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 1; i <= 10; i++) {
			//	push
			stack.push(i);
			System.out.println("STACK : " + stack);
		}
		
		//	가장 위 데이터를 확인 : peek(흘깃보기)
		System.out.println("PEEK : " + stack.peek());	//	가장 위 데이터인 10이 찍힘
		System.out.println("STACK : " + stack);
		
		//	인출 : pop
		System.out.println("POP : " + stack.pop());
		System.out.println("STACK : " + stack);			//	10, 삭제
		
		while(!stack.isEmpty()) {	//	인출 전에 비어있지"않은지" 체크, 따라서 "!"을 사용해서 논리값을 뒤집어야 함
			System.out.println("POP : " + stack.pop());
			System.out.println("STACK : " + stack);		//	오른쪽부터 하나씩 삭제
		}
	}
}
