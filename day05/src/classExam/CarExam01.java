package classExam;

public class CarExam01 {

	public static void main(String[] args) {
		// 2. 객체 생성
		Car myCar = new Car();
		Car yourCar = new Car();
		Car heCar = new Car();
		
		//3. 객체를 사용
		//필드 사용
		
		
		myCar.company = "기아자동차";
		myCar.model = "k7";
		myCar.color = "노랑";
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		
		
		
		yourCar.color = "검정";
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		

	}

}
