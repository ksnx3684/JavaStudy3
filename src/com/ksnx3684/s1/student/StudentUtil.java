package com.ksnx3684.s1.student;
import java.util.Scanner;
public class StudentUtil {

	public Student[] makeStudents() {
		
		Scanner sc = new Scanner(System.in);
		
		// 학생의 수를 입력 받음
		System.out.println("학생의 수를 입력하시오.");
		int count = sc.nextInt();
		Student[] students = new Student[count];
		
		// 키보드로부터 이름, 번호, 국어, 영어, 수학을 입력 받아서 리턴
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			students[i] = student;
			System.out.println("이름을 입력하시오");
			student.name = sc.next();
			System.out.println("번호을 입력하시오");
			student.num = sc.nextInt();
			System.out.println("국어점수를 입력하시오");
			student.kor = sc.nextInt();
			System.out.println("영어점수를 입력하시오");
			student.eng = sc.nextInt();
			System.out.println("수학점수를 입력하시오");
			student.math = sc.nextInt();
			
		}
		sc.close();
		return students;
	}
	
	public Student makeStudent() {
		// 키보드로부터 이름, 번호, 국어, 영어, 수학을 입력 받아서 리턴
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("이름을 입력하시오");
		student.name = sc.next();
		System.out.println("번호을 입력하시오");
		student.num = sc.nextInt();
		System.out.println("국어점수를 입력하시오");
		student.kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오");
		student.eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오");
		student.math = sc.nextInt();
		
		sc.close();
		return student;
	}

}
