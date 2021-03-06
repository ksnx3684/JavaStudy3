package com.ksnx3684.s1.student;

public class StudentView {
	
//			--- 출력 전용 클래스 ---
	
	// viewStudents - 여러명의 학생의 모든 정보를 출력
	public void view(Student[] students) {
		for(int i = 0; i < students.length; i++) {
//			Student student = students[i];
//			viewStudent(student);
			view(students[i]);
		}
	}
	
	
	// viewStudent - 학생의 모든 정보를 출력
	public void view(Student student) {
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.num);
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : " + student.total);
		System.out.println("평균 : " + student.avg);
		System.out.println("--------------------");
	}
	
	public void view(String message) {
		// 문자열 출력
		System.out.println("--------------------");
		System.out.println(message);
		System.out.println("--------------------");
		
	}

}
