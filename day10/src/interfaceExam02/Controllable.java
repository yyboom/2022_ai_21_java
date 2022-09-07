package interfaceExam02;

public interface Controllable {
	public abstract void turnOn();
	void turnOff();//public abstract void turnOff();
					//자동으로 됨
	void repair();
	void reset();
	default void test() {//예전에 만들었던 프로그램을 에러가 안나게 바꾸고 싶을때 default를 사용
		//default룰 안쓰면 자식들도 다 수정해줘야하기 때문!!
		//static으로 쓸 수도 있음
		System.out.println("제품을 테스트 합니다.");
	}
}
