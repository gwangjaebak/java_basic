package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayCopyEx();
//		basicSortEx();
//		basicSortDescEx();
//		customClassSort();
		basicSearch();
	}
	
	//	이진 검색
	private static void basicSearch() {
		int[] scores = {80, 50, 70, 90, 75, 88, 77};
		//	이진 검색 방식은 미리 정렬이 되어 있어야 한다.
		Arrays.sort(scores);	//	안해주면 이상한 값 출력
		System.out.println("원본 : " + Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 75);
		System.out.println("75의 인덱스 : " + index);
	}
	
	//	회원정보 프로그램을 만들어보자
	private static void customClassSort() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정"),
		};
		
		System.out.println("원본 : " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 : " + Arrays.toString(members));	//	에러 발생
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("역순정렬 : " + Arrays.toString(members));
	}
	
	//	내림차순 정렬
	private static void basicSortDescEx() {
//		int[] scores = {80, 50, 70, 90, 75, 88, 77};
		Integer[] scores = {80, 50, 70, 90, 75, 88, 77};
		System.out.println("원본 : " + Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());	//	import 해도 에러, comparTo 이용해서 바꿔주는건데 기본형엔 compareTo가 업승ㅁ
		//	따라서 기본타입을 기본형이 아닌 wrapper 클래스를 써줘야 함
		System.out.println("역순 정렬 : " + Arrays.toString(scores));	
	}
	
	//	오름차순 정렬(기본)
	private static void basicSortEx() {
		int[] scores = {80, 50, 70, 90, 75, 88, 77};
		System.out.println("원본 : " + Arrays.toString(scores));
		Arrays.sort(scores);	//	정렬
		System.out.println("정렬 : " + Arrays.toString(scores));	//	정렬 완료, 오름차순
		
	}
	
	private static void arrayCopyEx() {
		int arr[] = new int[]{1, 2, 3, 4, 5};	//	1. 루프 돌려서 출력
		
		//	2. 시스템 이용 복사
		int[] target = new int[arr.length];
		System.arraycopy(arr,	//	원본 배열
				0,	//	시작 인덱스
				target,	// 대상 배열
				0,	//	시작 인덱스
				arr.length);	//	복사할 길이
		
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println("System 복제 : " + Arrays.toString(target));
		
		//	Arrays의 복제 메서드 사용
		target = Arrays.copyOf(arr,	//	원본 배열
				arr.length);	//	복사할 길이
		System.out.println("copyOf : " + Arrays.toString(target));
		
		//	배열의 일부 복제
		target = Arrays.copyOfRange(arr,	//	원본 배열
				1,	//	복사 시작 인덱스
				3);	//	복사 끝 인덱스
		System.out.println("copyOfRange : " + Arrays.toString(target));
 	}

}
