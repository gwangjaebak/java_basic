package com.javaex.oop.staticmember;

public class staticExApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//	static 멤버는 new 없이 접근 가능
		System.out.println("RefCount : " + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("RefCount : " + StaticEx.refCount);
		
		s2 = null;	//	s2 해제
		System.out.println("s2 해제");
		System.out.println("RefCount : "
				+ StaticEx.refCount);
		//	주의 : 가비지 컬렉터를 직접 호출하는게 아니라
		//	최대한 빨리 들르게 하는 정도
		System.gc();
		try {
			Thread.sleep(3000);	//	3초 대기
			System.out.println("RefCount:"+ StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}
	//	프린트하면
	//	스태틱 영역 먼저
	//	두번째로 생성자 호출됨(참조 카운트 늘려주고 메세지 출력)
	//	10번 라인부터는 static 블럭이 이미 호출된 상태기 때문에
	//	호출되지 않는다
	//	중요한건 static 영역에서는 static만 접근 가능
	//	instance에서는 제약없이 static에 접근 가능
	//	인스턴스 끼리도 접근 불가
}
