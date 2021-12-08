package com.javaex.api.collections.hash;

public class Student {
	int id;
	String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	//	hashCode 비교 -> equals 확인 -> 동등
	@Override
	public int hashCode() {
		//	객체 식별값(정수)
		return id;	//	원래는 메모리주소 기반임, 연습이니까 id 값으로 해보자
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			//	다운캐스팅
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id;	//	중복 출력 제거
		}
		return super.equals(obj);
	}
}
