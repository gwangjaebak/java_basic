package com.javaex.api.stringclass;

//	String의 중요한 메소드, 자주 쓰인다.
//	문자열은 변경되지 않는다.
public class StringEx {

	public static void main(String[] args) {
//		usefulMethods();
		stringBufferEx();
	}
	
	private static void stringBufferEx() {
		//	버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		//	문자열 추가 : append
		sb.append(" is pencil");
		System.out.println(sb);
		//	문자열 삽입 : insert
		sb.insert(7, " my");
		System.out.println(sb);
		//	문자열 치환 : replace
		sb.replace(7, 10, " your");
		System.out.println(sb);
		//	버퍼 사이즈 조정 : setLength
		sb.setLength(5);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("This").append(" is pencil")
				.insert(7, " my")
				.replace(7, 10, " your");
		String s = sb2.toString();
		System.out.println(s);
	}
	
	private static void usefulMethods() {
		//	유용한 메서드들
		String str = "Java Programming JavaScript Programming";
		
		//	길이 추출 메서드
		System.out.println("str : " + str);
		System.out.println("LENGTH : " + str.length());
		
		//	변환 메서드
		System.out.println("UPPER : " + str.toUpperCase());
		System.out.println("LOWER : " + str.toLowerCase());
		
		//	검색 메서드
		System.out.println("인덱스 5의 글자 : " + str.charAt(5));
		int index = str.indexOf("Java");	//	Java의 인덱스
		System.out.println("1번째 Java 인덱스 : " + index);
		
		//	검색 범위 줄여서 두번째 자바 찾기
		index = str.indexOf("Java", 5);		//	5번 인덱스 이후의 Java
		System.out.println("2번째 Java 인덱스 : " + index);
		
		//	세번째
		index = str.indexOf("Java", 21);	//	21번 인덱스 이후의 Java
		System.out.println("3번째 Java 인덱스 : " + index);	//	-1 : 찾을 수 없는 검색
		
		System.out.println("마지막 Java 인덱스 : " + str.lastIndexOf("Java"));
		
		//	문자열 추출
		System.out.println("substring(5) : " + str.substring(5));
		System.out.println("substring(5, 16) : " + str.substring(5, 16));	//	5 ~ 16 앞까지
		
		//	문자열 변경
		System.out.println("replace : " + str.replace("Programming", "Coding"));
		
		//	문자열은 변경되지 않음
		System.out.println("str : " + str);	//	중요, 장난질만 가능할 뿐 변경되지 않는다.
		
		//	화이트 스페이스 제거
		String s2 = "						Hello					";
		String s3 = "					Java					";
		
		System.out.println(s2.trim() + " " + s3.trim());	//	공백 사라짐, 정돈됨 trim()
		
		//	문자열 분리
		String[] words = str.split(" ");
		for (String word: words) {
			System.out.println("WORD : " + word);	
		}
		
		//	compareTo 중요(나중에 sorting 할 때)
		//	문자열의 비교 : Unicode 비교
		//	0 : 순서가 같다
		//	음수 : 순서가 빠르다(앞 값 기준)
		//	양수 : 순서가 늦다(앞 값 기준)
		System.out.println("ABC".compareTo("ABE"));
		
	}

}
