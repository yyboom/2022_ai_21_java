package inheritanceExam;

public class Human {
	//필드
	String name;
	int age;
	
	//생성자
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메서드
	void eat() {
		System.out.println(name+"은"+age+"살 이고 현재 점심을 먹는 중입니다.");
		
	}
	void sleep() {
		System.out.println(name+"은 모든 일과를 마치고 자는 중입니다.");
		
	}
}
