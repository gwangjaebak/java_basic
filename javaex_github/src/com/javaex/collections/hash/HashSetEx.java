package com.javaex.api.collections.hash;

import java.util.HashSet;

public class HashSetEx {
	//	Hash 알고리즘을 사용하는 컬렉션
	//	HashSet : 순서가 없다. 중복을 허용하지 않는다.
	public static void main(String[] args) {
//		hashSetEx();
		hashSetCustom();
	}
	
	private static void hashSetCustom() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 1);
		Student s2 = new Student("홍길동", 2);	//	s1과 동명이인
		Student s3 = new Student("홍길동", 1);	//	s1과 동일인
		//	다른 객체라서 해시코드 기준으로 다른 객체로 판단해서 중복 출력됨
		//	따라서 1. 해시코드를 맞춰주고 2. 이퀄스까지 동등한지 판단하는 과정이 필요하다
		
		hs.add(s1); hs.add(s2); hs.add(s3);
		
		System.out.println(hs);
	}
	
	private static void  hashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		//	객체 추가
		hs.add("Java");			//	순서가 없다
		hs.add("C");
		hs.add("Python");
		hs.add("Java");			//	중복 허용하지 않음, 출력 X
		
		System.out.println(hs);
		
		//	원소의 갯수
		System.out.println("hs size = " + hs.size());
		
		//	포함여부
		System.out.println("contains Java ? " + hs.contains("Java"));
		System.out.println("contains Linux ? " + hs.contains("Linux"));
		
		//	객체 삭제
		hs.remove("Python");
		System.out.println(hs);
		
	}
}
