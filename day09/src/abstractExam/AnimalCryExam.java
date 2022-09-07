package abstractExam;

public class AnimalCryExam {

	public static void main(String[] args) {
		//Animal ani = new Animal();//미완성된 메서드를 포함하는 클래스는 heap에 올릴 수 없다.
		Cat cat = new Cat();
		Dog dog = new Dog();
		Parrot par = new Parrot();
		
		//ani.cry();//객체 생성을 위에서 해주지 못했으니 에러가 나는 것
		cat.cry();
		par.cry();
		dog.cry();
		
		cat.run();
		
		//추상 클래스를 "익명의 이너클래스"로 작성
		//()와 ;사이에 중괄호 블록{}을 주어 미완성 메서드를 완성으로 수정해줄 수 있음
		//but이것은 딱 한번 여기서만 완성된 클래스로 만들어줄 수 있음!!!
		Animal ani = new Animal() {//익명 이너 클래스 - 이름이 없는 클래스로 클래스 내부 구현된 클래스
			public void cry() {
				System.out.println("짹짹, 야옹~~, 멍멍~~");
			}
		};
		
		ani.cry();
									
	}

}
