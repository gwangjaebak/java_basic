package com.javaex;
import java.util.Arrays;
import java.util.Scanner;


public class FirstApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean sw = true;
		
		System.out.print("입력할 사람 수 : ");
		int cnt = sc.nextInt();
		String[] list = new String[cnt*4];
		
		while (sw) {
			System.out.println("성적처리프로그램");
			System.out.println("1. 입력 (이름, 국, 영, 수)");
			System.out.println("2. 검색 (이름검색, 평균검색(50점이상))");
			System.out.println("3. 전체출력");
			System.out.println("4. 종료하려면 아무 키나 누르세요");
			
			int num = sc.nextInt();
			
			if (num==1) {
				
				for (int i = 0; i < cnt; i++) {
					System.out.print("이름 : ");
					list[i] = sc.next();
					System.out.print("국어 : ");
					list[i+1] = sc.next();
					System.out.print("영어 : ");
					list[i+2] = sc.next();
					System.out.print("수학 : ");
					list[i+3] = sc.next();
				}
				System.out.println(Arrays.toString(list));
				continue;
				
			} else if (num==2) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				
				for (int j = 0; j < list.length; j++) {
					if (name.equals(list[j])) {
						int avg = ((Integer.parseInt(list[j+1]) +
								Integer.parseInt(list[j+2]) +
								Integer.parseInt(list[j+3])) / 3);
						
						if (avg > 50) {
							System.out.println("평균점수 : " + avg);
						}
						
						else {
							System.out.println("평균이 50보다 낮습니다.");
						}
						
					}
				}
				
				continue;
					
			} else if (num==3) {
				System.out.println(Arrays.toString(list));
				continue;
			} else {
				break;
			} 
		}
	}
}
