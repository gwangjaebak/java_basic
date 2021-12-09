package com.java.p2;

public abstract class Memory {
	// field
	protected int[] data = new int[5];
	protected int index = 0;
	
	// abstract method -> 자식 메소드에서 구현
	public abstract int pop();

	// concrete method -> 부모 메소드에서 구현
	public void push(int number) {
		data[index] = number;
		++index;
	}
	// concrete method -> 부모 메소드에서 구현
	public boolean isEmpty() {
		if (index == -1) {
			return true;
		} else {
			return false;
		}
	}
	
}