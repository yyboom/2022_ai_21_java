package humanWeight;

public class Human {
	//필드
	private String name;//인스턴스 필드임(지역변수가 아님)
	private double height;//자동 초기화가 된 상태임
	private double weight=0.0;
	
	//생성자
	public Human () {}
	
	//매개값이 있는 생성자
	public Human(String name, double height, double weight) {//지역변수임
		this.name = name;
		this.height = height;
		this.weight = weight;
	}


	//메소드
	public void weightIncrease(double gainWeight) {
		if(gainWeight > this.weight) {
			System.out.println("살이 찌기 전에 몸무게는 "+this.weight+"kg 이었습니다.");
			double change = gainWeight - this.weight;
			System.out.println("현재는 "+ change +"kg 만큼 증가해서"+gainWeight+"kg 입니다.");
		}
		
	}
	public void weightDecrease(double reduceWeight) {
		if(reduceWeight < this.weight) {
			System.out.println("살이 빠지기 전에 몸무게는 "+this.weight+"kg 이었습니다.");
			double change = this.weight - reduceWeight;
			System.out.println("현재는 "+ change +"kg 만큼 감소해서"+reduceWeight+"kg 입니다.");
		}
		
	}
	//get,set 메서드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
