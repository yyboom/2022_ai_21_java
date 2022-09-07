package objectExam;

class Vehicle{
	String name = "탈 것";
	
	
	
	void kind() {
		System.out.println("vehicle은 탈것이다.");
	}
	static void move() {
//		System.out.println(name + "이 이동한다.");//인스턴스를 static에서 부를 수 없음.
		System.out.println("vehicle이 이동한다.");
	}
}

//abstract class Vehicle{
//	String name = "탈 것";
//	
//	
//	
//	void kind();=>미완성 된것이 있기에 추상 클래스임
//
//	static void move() {
////		System.out.println(name + "이 이동한다.");//인스턴스를 static에서 부를 수 없음.
//		System.out.println("vehicle이 이동한다.");
//	}
//}

class Car extends Vehicle{
	String name = "자동차";
	
	void kind() {
		System.out.println("Car은 자동차이다.");
	}
	static void move() {
		System.out.println("Car이 이동한다.");
	}
	
}

class SportCar extends Car{
	void kind() {
		System.out.println("SportCar은 스포츠 자동차이다.");
	}
	
}

public class PolymorExam {

	public static void main(String[] args) {
		
		//필드, 인스턴스메서드, static 메서드가 어떤 것이 실행되는지 확인하면서 볼것
		//up cast, 자동 타입 변환
		//부모범위쪽만 쓸 수 있음!! 단, 오버라이팅 된 것은 자식꺼
		//static메서드는 부모꺼!!
		Vehicle veh = new Car();
		Car car = new SportCar();
		Vehicle vehSp = new SportCar();
		
		System.out.println(veh.name);//탈 것
		System.out.println(car.name);//자동차
		System.out.println(vehSp.name);//탈 것
		
		System.out.println();
		veh.move();//"vehicle이 이동한다."
		veh.kind();//"Car은 자동차이다." => 오버라이팅 된 것!
		
		car.kind();//"SportCar은 스포츠 자동차이다." =>오버라이팅 된 것!
		
		//==================================
		System.out.println();
		//클래스형
		Vehicle[] vehicles = new Vehicle[2];
		
		vehicles[0] = new Car();//배열에다가 클래스객체를 담을 수 있음
		vehicles[1] = new SportCar();
		
		//향상된 for문 - 배열, arraylist 자료를 확인
		//for(자료형 변수명 : 배열 또는 arraylist){
			//변수명}
		//배열의 마지막이 될때까지 배열에 들어있는 것을 출력해 주는 것!
		
		for(Vehicle v : vehicles) {
			v.kind();//vehicles안에 kind를 가지고 있는 것을 배열 순서대로 출력해줌
		}
		
		

	}

}
