package com.ksnx3684.s1.student;

public class StudentMain2 {

	public static void main(String[] args) {
		
		StudentView sv = new StudentView();
		StudentUtil makeStudents = new StudentUtil();
		Student[] students = new Student[2];
		
		//sv.viewStudents(students);
		
		Student student = new Student();
		student.name = "이병훈";
		student.num = 1;
		student.kor = 10;
		student.eng = 20;
		student.math = 30;
		students[0] = student;
		
		student.name = "김병훈";
		student.num = 2;
		student.kor = 10;
		student.eng = 20;
		student.math = 30;
		students[1] = student;
		
		Student student2 = makeStudents.search(students);
		if(student2 != null) {
			sv.view(student2);
		} else {
			System.out.println("학생없음");
		}

	}

}

