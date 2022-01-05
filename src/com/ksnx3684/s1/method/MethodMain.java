package com.ksnx3684.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		
		System.out.println("MainMethod Start");
		System.out.println("Conflict Test");
		
		// 객제 생성 코드
		// new 클래스명();
		ReturnStudy rs = new ReturnStudy(); // 객체 생성
		
		// 참조변수명.멤버들
		rs.test1();
		int num = rs.test2(); // 변수명이 반드시 ReturnStudy의 변수명과 같을 필요는 없다.
		String name = rs.test3();
		
		double num2 = Math.random();
		System.out.println("Math.random : " + num2);
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("Main : " + num);
		System.out.println("이름 : " + name);
		System.out.println("age : " + age);
		System.out.println("MainMethod Finish");
	}

}
