package com.javaex.oop.casting;

public class Cat extends Animal {	//	마찬가지로 에러
	public Cat(String name) {
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ": 야옹!");
	}
}