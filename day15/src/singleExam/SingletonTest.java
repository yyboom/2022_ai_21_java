package singleExam;

public class SingletonTest {
	//정적필드
	private static SingletonTest single = new SingletonTest(); //new부분은 힙 영역에 있음 왼쪽은 클래스영역
	//생성자
	private SingletonTest() {}
	//메서드
	static SingletonTest getInstance() {
		return single;
	}
}
