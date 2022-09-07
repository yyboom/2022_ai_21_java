package interfaceExam;

public interface InterCom {
	//interface에 다 구현하고 싶지 않은 것들이 있다면 추상클래스도 같이 자식 클래스로 생성해줘서
	//여기 안에다가 필요 없는 기능들을 넣어놓는다!!
	void turnOn();
	void tunrOff();
	void show();
	void info();
	void remote();

}
