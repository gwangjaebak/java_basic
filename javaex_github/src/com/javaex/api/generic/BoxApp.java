package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		//	비효율적인 방법
		IntBox iBox = new IntBox();
		iBox.setContent(10);
		System.out.println("IntBox : " + iBox.getContent());
		StrBox sBox = new StrBox();
		sBox.setContent("String");
		System.out.println("StrBox : " + sBox.getContent());
		
		ObjBox oBox = new ObjBox();
		oBox.setContent(10);
		oBox.setContent("String");	//	일단 이렇게 다 들어감
		
//		String value = oBox.getContent();	//	컴파일 오류
		String value = (String)oBox.getContent();	//	다운캐스팅 해줘야하는 번거로움
		System.out.println("content : " + value);
//		int iValue = (Integer)oBox.getContent();	//	캐스팅 오류 발생 가능
		
		//	궁극적 해결책 : Generic
		GenericBox<Integer> intGBox = new GenericBox<Integer>();	//	여기서 비로소 타입 결정
		
		//	1. 컴파일러에서 타입 체크 가능
		intGBox.setContent(10);
		//	2. 다운캐스팅의 불편을 해소
		Integer iValue = intGBox.getContent();
		System.out.println("content : " + iValue);
		
		GenericBox<String> strGBox = new GenericBox<>();	//	이렇게 간단하게 선언해주는게 가장 보편적
	}

}
