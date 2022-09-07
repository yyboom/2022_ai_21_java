package inheritanceExam;

public class Eagle extends Animal{
	//필드
	String wing;
	
	//생성자
	public Eagle(String eye, String mouth, String name,String wing) {
		super(eye, mouth, name);//상속을 받을 때는 맨 첫줄에 써줘야함

		this.wing = wing;

	}
	
	//메서드	
	void sleep() {//현재 오버라이딩된 상태임
		super.sleep();//부모꺼도 불러오고 싶을 때
		System.out.println("독수리가 실컷 잠을 잔다.");
	}

	void fly() {
		System.out.println("독수리가 날아간다");
	}

}
