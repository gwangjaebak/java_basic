package com.java.p2;

public abstract class Memory {
	//	field
	//	선택폭을 줘야 됨
	protected int[] data;	//	상수로 쓸때 이런식으로 하면 좋다, 생성자에서 쓰는게 좋다.
	protected int index;		//	여기도 생성자
	// private을 쓰면 못쓴다.
	
	public Memory() {
		this.data = new int[5];
		this.index = 0;
	}
	
	// abstract method -> 자식 메소드에서 구현
	public abstract int pop();	//	실제 꺼내는 행동, 동적 바인딩을 고려했기 때문에 만든 것
	
	// concrete method -> 부모 메소드에서 구현
	public void push(int number) {		//	이거 바꾸지말고 꼭 써야돼 하면, final 써줘야 됨.
		this.data[this.index] = number;
		if (this.index+1 == 5) {
			this.index = -2;
		} else {
			++this.index;
		}
	}
	// concrete method -> 부모 메소드에서 구현
	public boolean isEmpty() {	//	논리는 불리언으로 하는게 좋다. int는 별로...
		if (index == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	//	isFull 만들기
	public boolean isFull() {
		if (index == -2) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}