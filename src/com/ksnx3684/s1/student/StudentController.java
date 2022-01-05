package com.ksnx3684.s1.student;
import java.util.Scanner;
public class StudentController {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil();
		studentUtil.initUtil();
		StudentView studentView = new StudentView();
		Student[] students = null;
		
		while(check) {
			// switch case 구문 사용
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				students = studentUtil.makeStudents();
				break;
			case 2:
				if(students != null) {
					studentView.viewStudents(students);
				} else {
					studentView.viewMessage("학생 정보가 없습니다.");
				}
				break;
			case 3:
				if(students == null) {
					studentView.viewMessage("학생 정보가 없습니다.");
					continue;
				}
				Student student = studentUtil.search(students);
				if(student != null) {
					studentView.viewStudent(student);
				} else {
					studentView.viewMessage("검색 결과가 없습니다.");
				}
				break;
			default :
				check =! check;
				break;
			}
		}
		
	}

}
