package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();	//	불가, 왜? 생성자가 private이니까
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//	객체 주소가 같으면 같은 객체다
		System.out.println("s1, s2 같은 객체? " +
				(s1 == s2));	//	true, 같은 주소를 가진 같은 객체다		
	}

}
