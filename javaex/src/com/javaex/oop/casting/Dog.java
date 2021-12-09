package com.javaex.oop.casting;

public class Dog extends Animal {	//	기본 생성자 안쪽에서 부모의 기본 생성자를 호출하는데 애니멀에는 기본 생성자가 없어서 에러 발생
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name + ": 멍멍!");
	}
}