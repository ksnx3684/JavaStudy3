package com.ksnx3684.s1.same;

public class Square {

	// 사각형 넓이 구하기
	int garo;
	int sero;
	public boolean same(Square s) {
		// 멤버 변수 garo와 매개변수로 받은 객체의 garo가 같고
		// 멤버 변수 sero와 매개변수로 받은 객체의 sero가 같으면 true 리턴
		// 하나라도 틀리면 false 리턴
		if(this.garo == s.garo && this.sero == s.sero) {
			return true;
		}
		return false;
	}
	
}
