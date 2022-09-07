package inheritanceExam;

public class Fish extends Animal{
	//필드
	String fin;

	
	//생성자
	public Fish( String eye, String mouth, String name,String fin) {
		super(eye, mouth, name);
		this.fin = fin;

	}
	
	//메서드
	
	void swim() {
		System.out.println("물고기가 헤엄친다.");
	}

}
