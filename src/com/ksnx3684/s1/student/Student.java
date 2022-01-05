package com.ksnx3684.s1.student;

public class Student {

	// Data 저장 용도
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void makeTotal() {
		int total; // 각 변수 total은 생성된 메모리 영역이 다르다. 이 변수는 지역변수이다.
		System.out.println("참조변수 this"); // 만들어진 객체를 가리키는 변수
		System.out.println("참조변수 this : " + this);
		this.total = this.kor + this.eng + this.math; // this.을 붙이면 멤버변수에 적용
		total = kor + eng + math; //this는 생략 가능하다. // this.이 없으면 지역변수에 적용
		// 평균 계산
		this.avg = this.total / 3.0;
	}
	
	public void hello() {
		System.out.println("안녕");
	}
}
