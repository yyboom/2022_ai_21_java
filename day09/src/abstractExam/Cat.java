package abstractExam;

public class Cat extends Animal{//부모가 추상 클래스이면 자식에서 메서드를 반드시 재정의를 해줘야함
	//만약 자식에서도 재정의를 안하고 싶으면 이 클래스도 abstract로 바꿔주면 된다.(추상 클래스)
	@Override
	public void cry() {
		System.out.println("고양이 야옹~~~");
	}

}
