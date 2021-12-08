package com.javaex.api.generic;

//	int, str 대신 최상위 클래스 obj로 만들 수 있지 않을까?
public class ObjBox {
	Object content;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
}
