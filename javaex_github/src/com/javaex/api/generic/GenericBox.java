package com.javaex.api.generic;

public class GenericBox<T> {	//	굳이 GenericBox 이런 이름 아니어도 되고
								//	<T>도 지켜줄 필요없고, 여러개 받아도 됨
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
