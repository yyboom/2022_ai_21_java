package classExam;

public class Car {
	
	//바퀴, 핸들, 엔진회사, 모델, 색상, 최대속도,...=>속성
	//달린다, 운전한다...=>메서드
	
	//설계도(class) ->객체 ->사용
	//클래스 멤버 구성요소 - 필드, 메서드, 생성자, 내부클래스
	
	//1. 필드: 회사, 모델, 색상, 최대속력, 속력
	String company = "현대자동차";
	String model = "Sonata";
	String color;
	int maxSpeed = 350;
	int speed;
	
	//2. 생성자
	Car(){}
	
	//3. 메서드: 달린다
	void drive() {
		System.out.println(model + "달린다.");
	}

}
