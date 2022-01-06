package com.ksnx3684.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Car.company = "BMW";
		// 변수 선언 = new 생성자호출
		Car car = new Car(); // 기본생성자 호출
//		car.brand="k7";
//		car.cc=2000;
		car.info();
		// car.Car(); // error 발생
		Car car2 = new Car("k5");
		car2.info();
		
		Car car3 = new Car("k3" , "white");
		car3.info();
		
		Car car4 = new Car("k7", "black", 4000);
		car4.info();
		
	}

}
