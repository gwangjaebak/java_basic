package com.javaex.basic;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayEx();
//		twoDimenEx();
//		arrayCopyFor();
		arrayCopySystem();
	}
	
	private static void arrayCopySystem() {
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];
		
		//복사 바로 가능한 메서드
		System.arraycopy(source,	//	원본 배열
				0,	//	시작 인덱스
				target,	//	복사 대상 배열
				0,	//	대상 배열 인덱스
				source.length);	// 복사할 길이
		
		System.out.println("원본 : " + Arrays.toString(source));
		System.out.println("복제 : " + Arrays.toString(target));	//	아래와 결과 같음
	}
	
	private static void arrayCopyFor() {
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];
		
		//	배열 복사
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		System.out.println("원본 : " + Arrays.toString(source));
		System.out.println("복제 : " + Arrays.toString(target));
	}
	
	private static void twoDimenEx() {
		//	2차원 배열 선언
		int twoDimen[][] = new int[5][10]; //	5행 10열의 배열 생성
		
		//	기본 데이터가 있을 때, 
		int[][] table = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},	//	1행
				{2, 3, 4, 5, 6, 7, 8, 9, 0, 1},	//	2행
				{3, 4, 5, 6, 7, 8, 9, 0, 1, 2},	//	3행
				{4, 5, 6, 7, 8, 9, 0, 1, 2, 3}	//	4행
		};
		
		//	행배열 확인
		//	0 ~ table.length - 1
		System.out.println("tabel.length:" + table.length); //그냥 length는 행배열 출력
		//	열배열 확인:
		System.out.println("table[2].length:" + table[2].length); //열 길이 출력
		
		int sum = 0;
		
		for (int row = 0; row < table.length; row++) { //	행루프
			for (int col = 0; col < table[row].length; col++) { //열루프
				System.out.print(table[row][col] + " ");
				sum += table[row][col];
			}
			System.out.println();
		}
		System.out.println("요소의 합:" + sum);
	}
	private static void arrayEx() {
		// 배열의 선언
		String[] names; // Type[] 식별자 , 절대 배열 사이즈가 들어갈 수 없음
		int scores[]; // Type 식별자[]
		
		//	초기화
		names = new String[] { 
				"홍길동",
				"고길동",
				"장길산",
				"임꺽정"	// 바로 넣으려면 이렇게 넣어야 됨
		};
		
		//	값 목록이 있다면 -> 선언과 동시에 적용
		float height[] = {
				175.5f,
				178.3f,
				170.2f,
				165
		};
		
		scores = new int[4];
		System.out.println("배열의 길이:" + scores.length);
		//	인덱스의 범위 : 0 ~ .length - 1
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 85;
		scores[3] = 75;
//		scores[4] = 100; //	안나옴, 배열 범위 초과
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s, %.2f, score = %d%n",
					names[i], height[i], scores[i]);
		}
		
		int[] scores2 = scores; // 참조 복사, 사실상 복사가 아님 그대로 가져올 뿐
		
		System.out.println("scores: " + Arrays.toString(scores)); //	Arrays.toString은 다음에
		System.out.println("scores2: " + Arrays.toString(scores2));
		
		scores2[2] = 100;
		
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2)); // 참조복사라서 둘 다 변경되어버림. 주의!!
		
		System.out.println("scores == scores2 : " + (scores == scores2));
	}

}
