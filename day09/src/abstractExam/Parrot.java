package abstractExam;

public class Parrot extends Animal{
//	@Override
//	void cry() {//부모 클래스보다 작은 범위의 메서드이기 때문에 에러가 나온다.
	//Animal의 접근제한자가 public이기에 자식보다 큰것이 되버리기에 에러가 나오는 것!!
//		System.out.println("짹짹");
//	}
	@Override
	public void cry() {
		System.out.println("짹짹");
	}

}
