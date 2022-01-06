package com.ksnx3684.s2.constructor;

public class Car {

	
	String brand;
	public static String company = "Kia";
	String color;
	int cc;
	
	public Car() { // 생성자 - 특수한 메서드
		this("k9");
//		this.company = "Kia";
//		this.brand = "k9";
//		this.color="black";
//		this.cc = 3000;
	}
	public Car(String brand) { // 생성자도 메서드이므로 오버로딩이 가능하다
		this(brand, "black");
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = "black";
//		this.cc = 5000;
	}
	public Car(String brand, String color) {
		this(brand, color, 5000);
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = color;
//		this.cc = 5000;
	}
	public Car(String brand, String color, int cc) {
		// this.company = "Kia";
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	public void info() { // 멤버메서드
		System.out.println("멤버메서드");
		System.out.println(Car.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
	}
}
