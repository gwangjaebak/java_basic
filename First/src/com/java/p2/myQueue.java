package com.java.p2;

public class myQueue extends Memory {
	private int front = 0;

	@Override
	public int pop() {
		int result = data[front];
		++front;
		if (data[front] == 0) {
			index = -1;
		}
		return result;
	}
}
