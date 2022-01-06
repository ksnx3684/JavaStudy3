package com.ksnx3684.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		
//		--- 복수의 학생 정보 입력 후 출력 ---
		StudentView sv = new StudentView();
		StudentUtil makeStudents = new StudentUtil();
		Student[] students = makeStudents.makeStudents();
		
		sv.view(students);
		
//		--- 단일 학생 정보 출력 ---
//		StudentView sv = new StudentView();
//		Student student = new Student();
//		student.name = "이병훈";
//		student.num = 1;
//		student.kor = 10;
//		student.eng = 20;
//		student.math = 30;
//		
//		sv.viewStudent(student);
		
		
		// makeStudent 호출
		// 이름, 번호, 국어, 영어, 수학 출력
//		StudentUtil studentUtil = new StudentUtil(); // 객체 생성
//		
//		Student[] students = studentUtil.makeStudents(); // Student[]타입의 students 변수에 makeStudents();호출
//		for(int i = 0; i < students.length; i++) {
//			Student student = students[i];
//			System.out.println("이름 : " + student.name);
//			System.out.println("번호 : " + student.num);
//			System.out.println("국어 : " + student.kor);
//			System.out.println("영어 : " + student.math);
//			System.out.println("수학 : " + student.eng);
//			System.out.println("--------------------");
//		}
		
//		Student student = studentUtil.makeStudent();
//		
//		System.out.println("이름 : " + student.name);
//		System.out.println("번호 : " + student.num);
//		System.out.println("국어 : " + student.kor);
//		System.out.println("영어 : " + student.math);
//		System.out.println("수학 : " + student.eng);

	}

}
