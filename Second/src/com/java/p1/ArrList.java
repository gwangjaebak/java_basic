package com.java.p1;

import java.util.*;

public class ArrList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean sw = true;
		
		List<String> list = new ArrayList<>();
		
		while (sw) {
			System.out.println("성적처리프로그램");
			System.out.println("1. 입력 (이름, 국, 영, 수)");
			System.out.println("2. 검색 (이름검색 -> 성적)");
			System.out.println("3. 삭제");
			System.out.println("4. 출력");
			
			int num = sc.nextInt();
			
			if (num==1) {
				System.out.print("이름 : ");
				list.add(sc.next());
				System.out.print("국어 : ");
				list.add(sc.next());
				System.out.print("영어 : ");
				list.add(sc.next());
				System.out.print("수학 : ");
				list.add(sc.next());
				continue;
			
			} else if (num==2) {
				System.out.print("성적을 알고싶은 사람의 이름을 입력하세요 : ");
				String name = sc.next();
				
				for (int j=0; j<list.size(); j++) {
					if (name.equals(list.get(j))) {
						System.out.println("이름 : " + list.get(j) +
										   ", 국어 : " + list.get(j+1) + "점" +
										   ", 영어 : " + list.get(j+2) + "점" +
										   ", 수학 : " + list.get(j+3) + "점" );
						break;
					} else {
						System.out.println("입력한 이름이 데이터에 없습니다.");
					} 
				} continue;
						
			} else if (num==3) {
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				String name = sc.next();
				if (list.contains(name)) {
					System.out.println(list.remove(list.indexOf(name)));
				
				} else {
					System.out.println("입력한 이름이 데이터에 없습니다.");
				}
				
			} else if (num==4) {
				for (int l=0; l<list.size(); l++) {
					if ((int)l % 4 == 0) {
						System.out.print("이름 : " + list.get(l) +
								   ", 국어 : " + list.get(l+1) + "점" +
								   ", 영어 : " + list.get(l+2) + "점" +
								   ", 수학 : " + list.get(l+3) + "점");
						System.out.println();
					}
					
				}
				
				}
				continue;
		}
	}
}
