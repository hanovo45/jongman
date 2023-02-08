package com.yedam.oop;

public class 필드활용 {
	public static void main(String[] args) {
		
		// 클래스 변수 = new 생성자();
		Car myCar = new Car("sonata",100);         // Car() 는 public car 실행후 new 로 객체 생성
		
		// dot 연산자 -> car필드에서 만든 값들을 사용하게해주는?
		myCar.name = "sonata";   // 필드에서 만든 데이터타입으로만 사용가능
		myCar.price = 100;
		
		// car 클래스를 활용한 또 다른 객체 생성
		Car yourCar = new Car("kona",200);
		
		// 클래스(필드?) 외부에서 데이터를 입력
		yourCar.name = "kona";
		yourCar.price = 200;
		
		// 클래서 외부에서 필드를 사용할 경우(출력)
		System.out.println(yourCar.name);
		System.out.println(yourCar.price);
		
		// 다양한 생성자를 통한 객체 생성
		Car car01 = new Car();
		Car car02 = new Car("kona", 300, "현대");
		
		System.out.println(yourCar.company);
		
		
	}
}
