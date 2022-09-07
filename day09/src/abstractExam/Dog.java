package abstractExam;

public class Dog extends Animal{
//	@Override
//	//void cry() {//부모 클래스보다 작은 범위의 메서드이기 때문에 에러가 나온다.
//		System.out.println("강아지는 멍멍");
//	}
	@Override
	public void cry() {
		System.out.println("강아지는 멍멍");
	}

}
