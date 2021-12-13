package com.java.p2;

public class myStack extends Memory {
	
	@Override
	public int pop() {
		int result = data[index-1];
		--index;
		if (index == 0) {
			index = -1;
		}
		return result;
	}
}
