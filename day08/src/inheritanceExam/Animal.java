package inheritanceExam;

public class Animal {//부모클래스임
	//필드
	String eye;
	String mouth;
	String name;
	//생성자
	public Animal(String eye, String mouth, String name) {
		this.eye = eye;
		this.mouth = mouth;
		this.name = name;
	}

	//메서드
	void eat() {
		System.out.println(name + "이"+mouth + "로 음식을 먹는다.");
	}

	void sleep() {
		System.out.println(name+"가 잠을 잔다.");
	}


}
