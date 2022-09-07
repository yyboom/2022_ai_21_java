package inheritanceExam;

public class Car {
	//필드
	String model;
	String color;
	
	//생성자
	 public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메서드
	 void powerOn() {
		 System.out.println("차에 시동을 걸었습니다.");
	 }
	void powerOff() {
		 System.out.println("차에 시동을 껐습니다.");
		 
	 }
	 void drive() {
		 System.out.println("현재" + model +","+ color+"인 차가 주행 중입니다.");
	 }
	
}
