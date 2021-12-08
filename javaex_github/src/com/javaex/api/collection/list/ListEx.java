package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//	작동 방법 위주로, 구현은 자구에서
public class ListEx {

	public static void main(String[] args) {
		//	List는 interface
		//	따라서 Linked, Array는 "똑같이" 사용할 수 있다.
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		
		//	객체 추가
		lst.add("Java");	//	맨뒤에 새 노트 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		//	객체 삽입
		lst.add(2, "C#");	//	중간에 객체 삽입
		System.out.println(lst);
		
		//	List는 중복삽입 허용
		lst.add("Java");
		System.out.println(lst);
		
		//	List 항목 수
		System.out.println("Size : " + lst.size());
		
		//	삭제
		lst.remove(2);	//	인덱스로 삭제
		lst.remove("Python");	//	객체 직접 입력해서 삭제
		System.out.println(lst);
		
		//	List, Set의 경우 Iterator 사용
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {	//	hasNext : 뒤가 더 있는지 확인
			String item = it.next();	//	다음 요소를 가져온다
			System.out.println(item);
		}
		//	비우기
		lst.clear();
		System.out.println(lst);
	}
}
