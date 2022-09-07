package inheritanceExam;

public class Sonata extends Car{
	//필드
	int maxSpeed;
	//생성자
	public Sonata(String model, String color, int maxSpeed) {
		super(model, color);
		this.maxSpeed = maxSpeed;
	}
	
	//메서드
	@Override
	void drive() {
		System.out.println("소나타는 구불구불하게 주행 중입니다.");
	}
	void speed() {
		System.out.println(this.model+"의 최고 속력은 "+this.maxSpeed+"입니다.");
	}
	

}
