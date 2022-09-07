package inheritanceExam;

public class Tiger extends Animal{
	//필드

	
	//생성자
	public Tiger(String eye, String mouth, String name) {
		super(eye, mouth, name);
	}
	
	//메서드
	void run() {
		System.out.println("호랑이가 달린다.");
	}

}
