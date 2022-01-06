package com.ksnx3684.s1.student;
import java.util.Scanner;
public class StudentUtil {
	// 학생 객체를 생성하고 정보를 입력 받는 곳
	Scanner sc; // Scanner sc를 멤버변수로 선언
	
	public StudentUtil() {
		this.sc = new Scanner(System.in);
	}
	
//	public void initUtil() { // 메서드
//		this.sc = new Scanner(System.in);
//	}
	
	public Student search(Student[] students) {
		// 검색할 학생의 번호를 입력
		// 입력 받은 번호와 일치하는 학생을 찾아서 출력
		System.out.println("학생 정보 검색");
		System.out.println("학생의 번호를 입력하시오.");
		int number = sc.nextInt();
		
		Student student = null;
		for(int i = 0; i < students.length; i++) {
			if(number == students[i].num) {
				System.out.println("Find");
				student = students[i];
				break;
			}
		}
		return student;
	}

	public Student[] makeStudents() {
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
			student.makeTotal(); // 총점과 평균 계산하는 메서드 호출
			
		}
		return students;
	}
	
	public Student makeStudent() {
		// 키보드로부터 이름, 번호, 국어, 영어, 수학을 입력 받아서 리턴
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
		student.makeTotal();
		return student;
	}

}
