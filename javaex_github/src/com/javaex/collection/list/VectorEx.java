package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//	벡터 선언
		Vector<Integer> v = new Vector<>();
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		for  (int i = 1; i <= 10; i ++) {
			//	추가
			v.addElement(i);	//	v.addElement(Integer.valueOf(i)
			
		}
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		v.addElement(11);
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		System.out.println("v : " + v);
		
		//	삽입
		v.insertElementAt(5, 7);	//	7번 인덱스에 5를 넣어라
		System.out.println("v : " + v);
		
		//	조회
		System.out.println(v.elementAt(5));
		
		//	검색
		System.out.println("indexOf(7) : " + v.indexOf(7));
		System.out.println("indexOf(12) : " + v.indexOf(12));	//	없는 객체는 -1 출력
		
		//	포함 여부 확인
		System.out.println("contains(10) : " + v.contains(10));	//	boolean	값 반환
		
		//	삭제
		v.removeElement(5);	//	객체 5를 삭제
		System.out.println("v : " + v);
		
		//	순회
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		//	순회 위 방식으로 돌리기보다
		//	반복자 활용
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer item = e.nextElement();
			System.out.print(item + " ");
		}
		System.out.println();	//	위와 같은 값 출력, 메모리 절약
		
		//	비우기
		v.clear();
		System.out.println("v : " + v);
	}
}
