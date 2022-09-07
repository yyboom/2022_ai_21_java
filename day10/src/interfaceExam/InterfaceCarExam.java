package interfaceExam;

public class InterfaceCarExam {

	public static void main(String[] args) {
		
		InterCar01InherExam exam01 = new InterCar01InherExam();
		exam01.run();
//		exam01.speed = 5; final상수라서 바꿀 수 없음!
		System.out.println(exam01.speed);//권장 안함
		//static 멤버 호출 => 클래스명.필드명, 인터페이스명.필드명
		//class 멤버명으로 호출하는 것이 good
		System.out.println(InterfaceCar01.speed);
		
		
		
		
		
		
		
		
		//InterfaceCar01 = new InterfaceCar01();
		//interface라 객체 생성 불가
		//=>익명객체를 이용하여 완성시켜줌!!
		InterfaceCar01 inCar= new InterfaceCar01() {
			@Override
			public void run() {
				System.out.println("인터페이스 메서드 구현");
			}
		};

	}

}
