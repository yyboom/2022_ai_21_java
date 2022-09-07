package classExam;

public class Student {
	//이름, 학번, 공부한다. 
	
	//필드
	String name;
	int hakbun;
	
	//생성자 : 클래스 이름과 같아야 한다. 클래스명(){}
	public Student() {
		name="홍길동";
		hakbun=2018251016;
			
	}
	
	//매서드
	void study() {
		System.out.println(name + "도서관에서 공부를 합니다.");
	}
	

}
