package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		//	Upcasting && Downcasting
		Dog dog1 = new Dog("스누피");
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		Animal dog2 = new Dog("아지");	//	Upcasting : 참조 자료형에 설꼐된 멤버에만 접근 가능
		dog2.eat();
		dog2.walk();
//		dog2.bark();	//	자식꺼라 안됨, Downcasting 필요
		
		((Dog)dog2).bark();	//	일시적으로 자식 클래스인 Dog로 변경됨, 정상 출력
		
		Animal cat1 = new Cat("야옹이");	//	Upcasting
		cat1.eat();
		cat1.walk();
//		((Dog)cat1).bark();	//	오류 발생, 그래서 instanceof로 확인 필요
		
		if (cat1 instanceof Dog) {	//	cat이 Dog의 인스턴스인가?
			((Dog)cat1).bark();	//	예시 출력
		} else if (cat1 instanceof Cat){	//	cat1이 Cat의 인스턴스인가?
			((Cat)cat1).meow();	//	예시 출력
		}
		
//		Dog[] pets = new Dog[3];	//	이런식으로 배열 생성 가능
		Animal[] pets = new Animal[3];
		pets[0] = dog1;
		pets[1] = (Dog)dog2;
		pets[2] = new Dog("멍멍이");
		pets[2] = new Cat("아즈라엘");	//	왜 오류가 안뜰까? 루프 돌려보자
		
		for (Animal pet: pets) {
			pet.eat();
			pet.walk();
			
			if (pet instanceof Dog) {
				((Dog)pet).bark();
			} else if (pet instanceof Cat) {
				((Cat)pet).meow();
			}
		}
		//	결론 : instanceof를 잘 활용하자
	}
}
