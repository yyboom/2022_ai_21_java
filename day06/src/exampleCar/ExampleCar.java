package exampleCar;

public class ExampleCar {
	//필드(=멤버변수, 클래스 멤버변수, 인스턴스 변수)
	String company;//이들은 다 default인 것
	public String model;
	private String color;
	int maxSpeed;
	
	//private접근 방법
	public String getColor() {//private로 선언된 것을 넘겨줘라
		return color;//다른 패키지에서도 불러올 수 있게 됨
	}
	public void setColor(String color) {//private변수의 상수 변경하는 방법
		this.color = "파랑";
	}
	//기본생성자(class의 접근제한자와 같음)
	public ExampleCar () {
		company = "현대자동차";
		model = "아반떼";
		color = "노랑";
		maxSpeed = 250;
				
	};
	//매개변수 이용한 생성자
	public ExampleCar(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메서드

}
